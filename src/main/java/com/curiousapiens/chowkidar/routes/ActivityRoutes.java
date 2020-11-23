package com.curiousapiens.chowkidar.routes;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import java.util.UUID;

@Configuration
public class ActivityRoutes {

    /* Define all activity microservice related routes here */

    @Bean
    public RouteLocator activityRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("ping",r -> r.path("/ping")
                        .and()
                        .method(HttpMethod.GET)
                        .filters(f->
                                f.addRequestHeader("uuid", UUID.randomUUID().toString())
                        )
                        .uri("http://localhost:9000"))
                .build();
    }

}
