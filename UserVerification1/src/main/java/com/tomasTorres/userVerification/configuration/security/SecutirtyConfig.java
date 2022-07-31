package com.tomasTorres.userVerification.configuration.security;

import com.tomasTorres.userVerification.domain.AppUser;
import com.tomasTorres.userVerification.service.AppUserService;
import com.tomasTorres.userVerification.service.AppUserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class SecutirtyConfig {

    private  AppUserServiceImpl userService;

    @Bean
    public UserDetailsService userDetailsService(){
        return userService;

    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return  new PlaintextPasswordEncoder();
    }


    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws  Exception{
        http
                .csrf().disable()
                .authorizeHttpRequests()
                .antMatchers("/**")
                .permitAll()
                .anyRequest()
                .authenticated().and().formLogin();
        http.authenticationProvider(authenticationProvider());


                return http.build();

    }
    public  void  configure (WebSecurity web){
        web.ignoring().antMatchers("/images/**","/js/**", "/webjars/**");
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider (){
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailsService());
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;

    }
}
