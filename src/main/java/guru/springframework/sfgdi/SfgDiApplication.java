package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication
				.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");

		System.out.println(i18nController.sayHello());

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println("------primaryGreetingService");

		System.out.println(controller.sayHello());

		System.out.println("-----propertyInjectedController");

		PropertyInjectedController propertyInjectedController
				= (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------SetterInjectedController");

		SetterInjectedController setterInjectedController
				= (SetterInjectedController) ctx.getBean("setterInjectedController");
		//setterInjectedController.setGreetingService(new GreetingServiceImpl());
		System.out.println(setterInjectedController.getGreetingService().sayGreeting());

		System.out.println("------constructorInjectedController");

		ConstructorInjectedController constructorInjectedController
				= (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
	}
}
