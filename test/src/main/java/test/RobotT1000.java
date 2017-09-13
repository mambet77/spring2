package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component

public class RobotT1000 implements Robot {

	public String name = "T!===";
	public int id = 222;
	public int year = 120;

	@Autowired
	private Leg leg;

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void name() {
		System.out.println("I am " + name);
		System.out.println("my id " + id);
		System.out.println("my leg " + leg.getLeg());
	}

	@Bean
	private Leg test(@Qualifier("legBean") Leg mLeg) {
		System.out.println("ich bins");
		return new Leg();
	}

	@Bean
	@Qualifier("mLeg")
	public Leg leg() {
		return new Leg();
	}
}
