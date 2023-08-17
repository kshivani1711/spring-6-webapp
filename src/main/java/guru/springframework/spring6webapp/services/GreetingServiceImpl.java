package guru.springframework.spring6webapp.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreentingService {

    @Override
    public String sayGreeting() {
        return "Greetings everyone from Base service";
    }
}
