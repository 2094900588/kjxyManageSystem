package com.neuedu;

import com.neuedu.entity.User;
import com.neuedu.service.impl.UserDetailsImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

@SpringBootTest
class SpringbootStudentAdminApplicationTests {


    @Autowired
    private AuthenticationManager authenticationManager;
    @Test
    void contextLoads() {
        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken("admin","admin");
        Authentication authenticate =
                authenticationManager.authenticate(authenticationToken);//登陆失败会自动处理

        UserDetailsImpl loginUser = (UserDetailsImpl) authenticate.getPrincipal();
        User user = loginUser.getUser();
        System.out.println(user);
    }

}
