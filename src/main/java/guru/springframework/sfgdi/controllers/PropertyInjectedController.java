package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    //this method will return method from the GreetingService
    public String getGreeting() {
       return greetingService.sayGreeting();
    }
}
