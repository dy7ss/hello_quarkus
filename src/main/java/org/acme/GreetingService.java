package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService implements GreetingServiceImpl {

    @Override
    public String greeting(String name) {
        return "hello " + name;
    }

}
