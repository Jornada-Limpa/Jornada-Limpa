package com.generation.jornadalimpa.configuration;

import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;

@Configuration
public class SwaggerConfig {

	@Bean
	OpenAPI springJornadalimpaOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Projeto Jornada Limpa")
						.description("Projeto desenvolvido na Generation Brasil com a finalidade de resolver ODES da ONU, voltado para saúde e bem estar."
								+ "Um E-commerce onde parte do valor arrecadado nas vendas é direcionado a ONG's de combate ao álcool, cigarro e drogas!")
						.version("v0.0.1")
						.license(new License()
								.name("James, Gabriella, Weslley, Nathalia, Ericles, Carol, Kelton")
								.url("https://linktr.ee/jornadalimpa"))
						.contact(new Contact()
								.name("Jornada Limpa")
								.url("www.linkedin.com/in/Jornada-limpa-170435313")
								.email("jornadalimpa123@gmail.com")))
						.externalDocs(new ExternalDocumentation()
								.description("Github")
								.url("https://github.com/JamesHMoura/Blog-Pessoal.git"));
	}
	
	@Bean
	OpenApiCustomizer customerGlobalHeaderOpenApiCustomiser() {
		
		return openApi -> {
			openApi.getPaths().values().forEach(pathItem -> pathItem.readOperations()
					.forEach(operation -> {
						ApiResponses apiResponses = operation.getResponses();
						
						apiResponses.addApiResponse("200", createApiResponse("Sucesso!"));
						apiResponses.addApiResponse("201", createApiResponse("Objeto Persistido!"));
						apiResponses.addApiResponse("204", createApiResponse("Objeto Excluído!"));
						apiResponses.addApiResponse("400", createApiResponse("Erro na Requisiçãao!"));
						apiResponses.addApiResponse("401", createApiResponse("Acesso não Autorizado!"));
						apiResponses.addApiResponse("403", createApiResponse("Acesso Proibido!"));
						apiResponses.addApiResponse("404", createApiResponse("Objeto não Ecnontrado!"));
						apiResponses.addApiResponse("500", createApiResponse("Erro na Aplicação!"));
						
					})
					);
		};
	}
	private ApiResponse createApiResponse(String message) {
		return new ApiResponse().description(message);
	}
	
}
