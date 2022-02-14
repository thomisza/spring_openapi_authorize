package com.example.openapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.OAuthFlow;
import io.swagger.v3.oas.annotations.security.OAuthFlows;
import io.swagger.v3.oas.annotations.security.OAuthScope;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@OpenAPIDefinition(info = @Info(title = "<TITRE>", version = "v1"))
@SecurityScheme(

        name = "Bearer",
        type = SecuritySchemeType.OAUTH2,
        flows = @OAuthFlows(
                authorizationCode = @OAuthFlow(
                        authorizationUrl = "https://login.microsoftonline.com/<TENANT_ID>/oauth2/v2.0/authorize",
                        tokenUrl = "https://login.microsoftonline.com/<TENANT_ID>/oauth2/v2.0/token",
                        scopes = @OAuthScope(
                                name = "<SCOPE>",
                                description = "<DESCRIPTION_SCOPE>")
                        )
                ),
        bearerFormat = "JWT",
        scheme = "bearer"
)
public class ConfigOpenApi {

}
