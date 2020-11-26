package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        //i'm mimicking what the Spring Frameworg would be doing,
        /*i'm actually creating the a new PropertyInjectedController obj,
        * i'm assigning that to the variable controller*/
        controller = new PropertyInjectedController();

        /*i'm setting the property directly by accessing that property directly
        * with the new GreetingServiceImpl*/
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}