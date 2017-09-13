package aop.my;

import org.springframework.stereotype.Component;

@Component
public class Service {

	public void initService() {
		System.out.println("method init()");
	}

	public String retournObj() {
		System.out.println("retourningObj");
		return "return";
	}

}
