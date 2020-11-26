package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/*This is a Spring Managed Component it will bring into the Spring Context */
@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
