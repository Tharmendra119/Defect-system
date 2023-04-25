package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee1")
public class Employee {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY )
private int id;
@Column(name="age")
private int age;
@Column(name="name")
private String name;
@Column(name="city")
private String city;
public Employee() {
	super();
}
public Employee(int age, String name, String city) {
	super();
	this.age = age;
	this.name = name;
	this.city = city;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", city=" + city + "]";
}


}
