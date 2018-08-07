package com.jda.model;

public class Doctor {
String name;
String Id;
String specialization;
String availability;
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
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public String getAvailability() {
	return availability;
}
public void setAvailability(String availability) {
	this.availability = availability;
}
@Override
public String toString() {
	return "\n {\n" +"\"Name\" : \"" + name + "\"\n" +"\"Id\"  : \"" + Id + "\"\n" +"\"specialization\"  :\"" + specialization +"\"\n" +"\"availability\"  : \""
			+ availability + "\"\n}\n";
}
}
