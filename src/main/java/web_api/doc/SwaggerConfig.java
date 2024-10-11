package web_api.doc;


import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Contact;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private Contact contato (){
        return new Contact(
                "Mateus",
                "www.mateus.ai",
                "mateus111@gmail.com"
        );
    }
}
