package com.example.microsweeper.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;



/* @Health
@ApplicationPath("/api")
public class RestApplication extends Application implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.named("basic-check").up().build();
	}

}  */
// uncomment

@ApplicationPath("/api")
public class RestApplication extends Application {
}