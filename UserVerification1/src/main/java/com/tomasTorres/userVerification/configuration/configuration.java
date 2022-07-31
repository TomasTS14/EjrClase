package com.tomasTorres.userVerification.configuration;

import com.tomasTorres.userVerification.domain.AppUser;
import com.tomasTorres.userVerification.domain.Role;
import com.tomasTorres.userVerification.repo.AppUserRepo;
import com.tomasTorres.userVerification.repo.RoleRepo;

import com.tomasTorres.userVerification.service.AppUserServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@Configuration
public class configuration {

    @Bean
    CommandLineRunner commandLineRunner(AppUserServiceImpl appUserService){

        return args -> {
            Role admin = new Role(null,"admin");
            Role user = new Role(null, "user");

            AppUser tomas = new AppUser(null, "Tomas", "tomas@email.com", "123", List.of(admin, user) );
            AppUser andres = new AppUser(null,"Andres", "andres@email.com", "1234", List.of(user));

            appUserService.saveRole(admin);
            appUserService.saveRole(user);
            appUserService.saveUser(tomas);
            appUserService.saveUser(andres);




        };
    }
}
