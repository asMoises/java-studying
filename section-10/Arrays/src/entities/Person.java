package entities;

public class Person {
	
	private String name;
	private int age;
	private double personHeight;
	
	public Person(String name, int age, double personHeight) {
		this.name = name;
		this.age = age;
		this.personHeight = personHeight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPersonHeight() {
		return personHeight;
	}

	public void setPersonHeight(double personHeight) {
		this.personHeight = personHeight;
	}
}
