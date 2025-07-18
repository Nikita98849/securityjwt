package com.example.securityjwt.service;

import com.example.securityjwt.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Hardcoded user for demo (no DB)
        if ("admin".equals(username)) {
            return new User("admin", "admin123");
        } else {
            throw new UsernameNotFoundException("User not found");
        }
    }
}