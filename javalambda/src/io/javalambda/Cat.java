package io.javalambda;

public class Cat {

	private String name;
	private int age;
	
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
}
