package erick.br;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
 public class ApiFeriadoNacionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiFeriadoNacionalApplication.class, args);
	}

}
