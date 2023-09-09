package tech.escalab.spring_boot.tarea_final.aplication.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import io.swagger.v3.core.jackson.ModelResolver;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI myOpenAPI() {

        Server devServer = new Server();
        devServer.setUrl("http://localhost:8085/");
        devServer.setDescription("URL del servidor Local");

        Contact contact = new Contact();
        contact.setEmail("yannickvalderasm@gmail.com");
        contact.setName("Yannick Valderas");

        Info info = new Info()
                .title("Proyecto Final spring boot escalab")
                .version("1.0")
                .contact(contact)
                .description("Documento que expone las APIs construida en el curso de Spring Boot")
                .termsOfService("https://www.escalab.com/terms");

        return new OpenAPI()
                .info(info)
                .servers(List.of(devServer));
    }

    @Bean
    public ModelResolver modelResolver(ObjectMapper objectMapper) {

        return new ModelResolver(objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE));
    }

}
