package com.tomas.demo.security.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class WebSecurityConfig  {

    @Bean
    public SecurityFilterChain filterChain (HttpSecurity http) throws Exception{

        http
                .csrf().disable()
                .authorizeHttpRequests()
                .antMatchers("/api/v*/registration/**")
                .permitAll()
                .anyRequest()
                .authenticated().and()
                .formLogin();
        return http.build();


//        http
//                .authorizeHttpRequests( (authz) -> authz.anyRequest().authenticated())
//                .httpBasic(Customizer.withDefaults());
//        return http.build();
        /*Permite autorizar las request en base a una autorización que forma parte del objeto http,
        puede ser cuaqluier tipo de request pero tiene que estar authenticated(),
        despues da la configuración básica.
         */
    }
}
