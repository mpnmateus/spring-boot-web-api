package web_api.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;


@Configuration
public class SwaggerConfig {

    // Método para configurar as informações de contato
    private Contact contato() {
        return new Contact()
                .name("Mateus")
                .url("www.mateus.ai")
                .email("mateus111@gmail.com");
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Title - Rest API")
                        .description("API exemplo de uso de Springboot REST API")
                        .version("1.0")
                        .termsOfService("Termo de uso: Open Source")
                        .license(new License()
                                .name("Licença - Sua Empresa")
                                .url("http://www.seusite.com.br"))
                        .contact(contato()))
                .externalDocs(new ExternalDocumentation()
                        .description("Documentação Externa")
                        .url("https://github.com/mateus111"));
    }
}