package br.com.alura.forum.config.swagger;

import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;

public class SwaggerConfigurations {

//	@Bean
//	public GroupedOpenApi publicApi() {
//		return GroupedOpenApi.builder().group("forumApi").pathsToMatch("/**").build();
//	}

	@Bean
	public OpenAPI forumAluraOpenAPI() {
	    return new OpenAPI()
	        .info(new Info().title("Forum API")
	        .description("API do Forum da Alura")
	        .version("1.0")
	        .license(new License().name("Apache 2.0").url("http://forum.alura.com.br")))
	        .externalDocs(new ExternalDocumentation()
	        .description("Forum API DOCS")
	        .url("https://forum.alura.com.br"))
	        .components(new Components()
	          .addSecuritySchemes("bearer-key",
	          new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").in(SecurityScheme.In.HEADER).bearerFormat("JWT")));
	}

}
