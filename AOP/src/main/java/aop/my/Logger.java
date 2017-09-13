package aop.my;

import org.springframework.stereotype.Component;

@Component
public class Logger {

	public void init() {

		System.out.println("Logger.init()");
	}

	public void init_around(Object obj) {

		System.out.println("test " + obj);

	}
}
