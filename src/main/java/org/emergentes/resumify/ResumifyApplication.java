package org.emergentes.resumify;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
public class ResumifyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResumifyApplication.class, args);
    }

}
