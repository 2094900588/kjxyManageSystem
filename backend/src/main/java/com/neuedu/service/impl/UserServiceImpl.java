package com.neuedu.service.impl;

import com.neuedu.entity.User;
import com.neuedu.service.UserService;
import com.neuedu.utils.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Objects;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Override
    public String login(User user) {
        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword());
        Authentication authenticate =
                authenticationManager.authenticate(authenticationToken);//登陆失败会自动处理
        UserDetailsImpl loginUser = (UserDetailsImpl) authenticate.getPrincipal();
        User user1 = loginUser.getUser();
        if (!Objects.equals(user.getUsertype(), user1.getUsertype())){
            throw new RuntimeException("角色权限选择错误");
        }

        String jwt = JwtHelper.createToken(user1.getId(),user1.getUsertype());

        return jwt;
    }
}
