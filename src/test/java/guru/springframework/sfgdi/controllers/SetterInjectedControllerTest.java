package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
    }

    @Test
    void getGreetingService() {
        controller.setGreetingService(new ConstructorGreetingService());
        System.out.println(controller.getGreetingService().sayGreeting());
    }
}