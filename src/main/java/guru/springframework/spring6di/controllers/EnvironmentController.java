package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.EnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {
    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    private final EnvironmentService environmentService;

    public String getEnvironment() {
        return "you are in " + environmentService.getEnv() + " Environment";
    }
}
