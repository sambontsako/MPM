package com.mpm.configs;

import com.mpm.entities.user.User;
import com.mpm.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){
        return args -> {
            User u1 = new User(
                    "Ntsako",
                    "Sambo",
                    "np@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 5)

            );
            User u2 = new User(
                    "Peniel",
                    "Zimbo",
                    "pz@gmail.com",
                    LocalDate.of(2021, Month.DECEMBER, 25)

            );

            /*userRepository.saveAll(
                    List.of(u1,u2)
            );*/
            };
        }

}
