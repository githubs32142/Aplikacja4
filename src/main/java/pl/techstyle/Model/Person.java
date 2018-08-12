package pl.techstyle.Model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class Person {
	@NotNull
	private String name;
	@NotNull
	private String surName;
	@NotNull
	@Range(min=0,max=150)
	private  int  age;
	@NotNull
	@Range(min=0,max=200)
	private double weight;
	@NotNull
	@Range(min=0,max=200)
	private double height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surName == null) ? 0 : surName.hashCode());
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surName == null) {
			if (other.surName != null)
				return false;
		} else if (!surName.equals(other.surName))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", surName=" + surName + ", age=" + age + ", weight=" + weight + ", height="
				+ height + "]";
	}
	public Person(String name, String surName, int age, double weight, double height) {
		this.name = name;
		this.surName = surName;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	public Person() {
	
	}
}
