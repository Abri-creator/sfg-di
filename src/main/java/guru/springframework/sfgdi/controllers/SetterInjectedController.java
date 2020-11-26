package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Controller;

@Controller/*A Spring managed component*/
public class SetterInjectedController {

    private GreetingService greetingService;

    /*Autowired is going to tell Spring Framework that we want a GreetingService injected into this bean*/
    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    //this method will return method from the GreetingService
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
