package eu.accesa.springtraining.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreeting() {
        return "Hello people from service!";
    }
}
