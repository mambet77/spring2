package test;

import java.beans.ConstructorProperties;

public class RobotT1000 implements Robot {

	public String name;
	public int id;
	public int year;

	private Leg leg;

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	@ConstructorProperties("ids")
	public RobotT1000(int id) {
		this.id = id;

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

}
