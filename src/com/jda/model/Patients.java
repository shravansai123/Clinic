package com.jda.model;

public class Patients {
String name;
String Id;
String mobile;
String age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
@Override
public String toString() {
	return "\n {\n" +"\"Name\" : \"" + name + "\"\n" +"\"Id\"  : \"" + Id + "\"\n" +"\"Mobile\"  :\"" + mobile +"\"\n" +"\"Age\"  : \""
			+ age + "\"\n}\n";
}
}
