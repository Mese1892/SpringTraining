package eu.accesa.springtraining.api;

import eu.accesa.springtraining.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService service;

    @GetMapping("/greeting")
    public String greet(@RequestParam(name = "name", required = false, defaultValue = "World")String name) {
        return service.getGreeting();
    }
}
