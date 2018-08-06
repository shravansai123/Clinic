package com.jda.serviceImplementation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jda.model.Doctor;
import com.jda.service.DoctorService;

public class DoctorServiceImpl implements DoctorService {

	@Override
	public void addDoctors() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchDoctorById() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchDoctorByName() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeDoctors() {
		// TODO Auto-generated method stub
		
	}
	public void getDoctors() throws FileNotFoundException, IOException, ParseException{
		ArrayList<Doctor> doctorList=new ArrayList<Doctor>();
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("doctors.json"));
		JSONObject jsonObject = (JSONObject) obj;
		JSONArray doctorBook = (JSONArray) jsonObject.get("Doctors");
		Doctor person;
		for(Object pers:doctorBook){
			person=new Doctor();
			person.setName((String) ((JSONObject) pers).get("Name"));
			person.setId((String) ((JSONObject) pers).get("Id"));
			person.setSpecialization((String) ((JSONObject) pers).get("specialization"));
			person.setAvailability((String) ((JSONObject) pers).get("availability"));
			doctorList.add(person);
		}
	}

}
