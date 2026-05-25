package com.spring;
public class Student {
	private long id;
	private String name;
	private double salary;
	public Student() {
		super();
	}
	public Student(long id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
