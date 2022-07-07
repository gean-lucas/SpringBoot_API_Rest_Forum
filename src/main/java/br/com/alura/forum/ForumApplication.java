package br.com.alura.forum;

import org.springdoc.core.annotations.RouterOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@SpringBootApplication
@EnableSpringDataWebSupport
@EnableCaching
@RouterOperation(operation = @Operation(security = @SecurityRequirement(name = "bearer-key")))
public class ForumApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForumApplication.class, args);
	}

}
