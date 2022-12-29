package com.anudip;

public class Agent 
{
	//declare private data member
 private int id;
 private String name;
 private int comission;
 //default constructor
public Agent() {
	
	// TODO Auto-generated constructor stub
}
//constructor using fields
public Agent(int id, String name, int comission) {
	
	this.id = id;
	this.name = name;
	this.comission = comission;
}
//constructor for id and comission
public Agent(int id, int comission) {
	this.id = id;
	this.comission = comission;
}
//constructor for id
public Agent(int id) {
	
	this.id = id;
}
//getter and setter
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getComission() {
	return comission;
}
public void setComission(int comission) {
	this.comission = comission;
}
}
