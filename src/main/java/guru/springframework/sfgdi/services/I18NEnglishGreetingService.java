package guru.springframework.sfgdi.services;

public class I18NEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
