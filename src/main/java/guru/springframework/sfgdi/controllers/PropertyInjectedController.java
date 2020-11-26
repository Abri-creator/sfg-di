package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    /*this tell Spring that i want to go ahead and inject an instance of the GreetingService
    * Go ahead and manage the injection of GreetingService*/
    @Autowired
    public GreetingService greetingService;

    //this method will return method from the GreetingService
    public String getGreeting() {
       return greetingService.sayGreeting();
    }
}
