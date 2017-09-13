package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Robot robotT100 = (RobotT1000) context.getBean("robotT1000");
		Leg leg = (Leg) context.getBean("leg2");

		robotT100.name();
	}

}
