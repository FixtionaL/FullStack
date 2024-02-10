package com.birthday.harxh.config;

import static com.birthday.harxh.utils.MyConstant.*;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.security.SecurityScheme.Type;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerApiConfig {

    @Bean
    public OpenAPI openAPI()
    {
        return new OpenAPI()
        .servers(List.of(new Server().url(SWAGGER_LOCALHOST_URL)))
        .addSecurityItem(new SecurityRequirement()
            .addList(SWAGGER_SECURITY_SCHEME_NAME))
        .components(new Components()
            .addSecuritySchemes(SWAGGER_SECURITY_SCHEME_NAME, 
                new SecurityScheme().name(SWAGGER_SECURITY_SCHEME_NAME)
                    .type(Type.HTTP)
                    .scheme(SWAGGER_SCHEME)
                    .description(SWAGGER_DESCRIPTION)
                    .bearerFormat(SWAGGER_BEARER_FORMAT)));
    }
}
