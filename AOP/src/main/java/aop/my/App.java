package aop.my;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext appcontext = new ClassPathXmlApplicationContext("context.xml");
		Service service = (Service) appcontext.getBean("service");
		service.initService();
		service.retournObj();

	}

}
