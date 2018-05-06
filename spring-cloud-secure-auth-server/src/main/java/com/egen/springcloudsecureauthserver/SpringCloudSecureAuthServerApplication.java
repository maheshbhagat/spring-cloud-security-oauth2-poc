package com.egen.springcloudsecureauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class SpringCloudSecureAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSecureAuthServerApplication.class, args);
    }
}
