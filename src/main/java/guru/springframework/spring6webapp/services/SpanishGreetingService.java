package guru.springframework.spring6webapp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola - ES";
    }
}
