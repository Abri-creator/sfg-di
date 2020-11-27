package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*Beacuse of this Profile we are able to load which bean we want even if they have the same name*/
@Profile("IT")
/*In this way we are giving the name of the qualifier */
@Service("i18nService")
public class I18nItalianGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Ciao Mondo - IT";
    }
}
