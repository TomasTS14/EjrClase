package com.tomasTorres.userVerification.configuration;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class SecutirtyConfig {

    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws  Exception{
        http
                .csrf().disable()
                .authorizeHttpRequests()
                .antMatchers("/**")
                .permitAll()
                .anyRequest()
                .authenticated().and().formLogin();

                return http.build();

    }
}
