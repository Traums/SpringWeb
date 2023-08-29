package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"main.repos"})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
