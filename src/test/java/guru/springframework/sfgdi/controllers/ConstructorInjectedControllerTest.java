package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    //this is a property
    ConstructorInjectedController controller;

    //we are acting the InversionControl
    @BeforeEach
    void setUp() {
        //here i'm mimicking what Spring Framework would be doing by instantiating this obj
        /*i'm creating a new ConstructorInjectedController and also at the same time
        * i'm creating that GreetingServiceImpl*/
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());

    }
}