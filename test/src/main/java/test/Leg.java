package test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("legBean")
public class Leg {

	String name = "Leg Component";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLeg() {
		// TODO Auto-generated method stub
		return "metal leg " + name;
	}

	@Bean
	@Qualifier("mLeg2")
	public Leg leg2() {
		return new Leg();
	}
}
