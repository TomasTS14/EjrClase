package com.tomasTorres.userVerification.configuration;

import com.tomasTorres.userVerification.domain.AppUser;
import com.tomasTorres.userVerification.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class configuration {
   private final AppUserService appUserService;
    @Bean
    CommandLineRunner commandLineRunner(){

        return args -> {
            AppUser tomas = new AppUser("Tomas","tomas@email.com", "123");
            AppUser andres = new AppUser("Andres", "andres@e.com", "1234");

            appUserService.saveUser(tomas);
            appUserService.saveUser(andres);
        };
    }
}
