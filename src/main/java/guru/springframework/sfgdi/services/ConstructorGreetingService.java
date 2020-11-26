package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/*This is a Spring Managed Component it will bring into the Spring Context */
/*We want to have this injected into the ConstructorInjectedController*/
@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
