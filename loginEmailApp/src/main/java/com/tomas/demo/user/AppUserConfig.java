package com.tomas.demo.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppUserConfig {

    @Bean
    //USUARIOS INICIALES DE PRUEBA.
    CommandLineRunner commandLineRunner (AppUserRepository appUserRepository){
        return args -> {
            AppUser user1 = new AppUser(
                    "Tomas",
                    "Torres",
                    "tomastorres@email.com",
                    "123"
            );
            AppUser user2 = new AppUser(
                    "Andres",
                    "Torres",
                    "andres@email.com",
                    "123"
            );

            appUserRepository.saveAll(List.of(user1, user2));
        };
    }
}
