package demo.app_user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppUserConfig {

    @Bean
    protected CommandLineRunner commandLineRunner(AppUserRepository repository){

        return args -> {

            AppUser tomas = new AppUser("Tomas","Torres","tomas@email.com");
            AppUser andres = new AppUser("Andres","Torres", "andres@email.com");

            repository.saveAll(List.of(tomas, andres));

        };
    }
}
