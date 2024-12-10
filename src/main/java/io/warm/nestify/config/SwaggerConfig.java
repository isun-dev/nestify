package io.warm.nestify.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Nestify API", version = "1.0", description = "주거 공간 마련"))
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi nestifyGroup() {
        return GroupedOpenApi.builder().group("nestify").packagesToScan("io.warm.nestify").build();
    }
}

