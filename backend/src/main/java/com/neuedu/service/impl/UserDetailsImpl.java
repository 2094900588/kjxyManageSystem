package com.neuedu.service.impl;


import com.neuedu.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailsImpl implements UserDetails {

    private User user;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {//用户被封锁
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {//用户是否被锁定
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {//用户授权是否过期
        return true;
    }

    @Override
    public boolean isEnabled() {//是否被启用
        return true;
    }
}

