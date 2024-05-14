package epicode.it.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import epicode.it.pizza.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@Slf4j
public class PizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PizzaApplication.class);

		Menu m = (Menu) ctx.getBean("menu");

		m.printMenu();
		ctx.close();
	}

}
