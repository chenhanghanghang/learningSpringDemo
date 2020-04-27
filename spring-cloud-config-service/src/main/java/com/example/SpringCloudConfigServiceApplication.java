package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * /{application}/{profile}[/{label}]
 * /{application}-{profile}.yml
 * /{label}/{application}-{profile}.yml
 * /{application}-{profile}.properties
 * /{label}/{application}-{profile}.properties
 * http://localhost:3301/config-single-client/dev/master
 *
 * http://localhost:3301/config-single-client/prod
 *
 * http://localhost:3301/config-single-client-dev.yml
 *
 * http://localhost:3301/config-single-client-prod.yml
 *
 * http://localhost:3301/master/config-single-client-prod.yml
 */
@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServiceApplication.class, args);
    }

}
