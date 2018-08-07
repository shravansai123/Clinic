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
import com.jda.utility.Utility;

public class DoctorServiceImpl implements DoctorService {
	ArrayList<Doctor> doctorList = new ArrayList<Doctor>();

	@Override
	public void addDoctors() throws IOException, ParseException {
		Utility util = new Utility();
		Doctor person = new Doctor();
		System.out.println("Enter the Name");
		String Name = util.getInputStringline();
		System.out.println("Enter the Id");
		String Id = util.getInputStringline();
		System.out.println("Enter the Specialization");
		String Specialization = util.getInputStringline();
		System.out.println("Enter the availability");
		String availability = util.getInputStringline();
		person.setAvailability(availability);
		person.setId(Id);
		person.setName(Name);
		person.setSpecialization(Specialization);
		doctorList.add(person);
	}

	@Override
	public void searchDoctorById() throws IOException {
		Utility util = new Utility();
		System.out.println("Enter the Id");
		String id = util.getInputStringline();
		for (Doctor p : doctorList) {
			if (p.getId().equals(id)) {
				System.out.println(p.toString());
				break;
			}
		}
	}

	@Override
	public void searchDoctorByName() throws IOException {
		Utility util = new Utility();
		System.out.println("Enter the Name");
		String firstName = util.getInputStringline();
		for (Doctor p : doctorList) {
			if (p.getName().equals(firstName)) {
				System.out.println(p.toString());
				break;
			}
		}
	}

	@Override
	public void removeDoctors() throws IOException {
		Utility util = new Utility();
		System.out.println("Enter the Name");
		String firstName = util.getInputStringline();
		for (Doctor p : doctorList) {
			if (p.getName().equals(firstName)) {
				doctorList.remove(p);
				break;
			}
		}

	}

	public void getDoctors() throws FileNotFoundException, IOException, ParseException {

		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("doctors.json"));
		JSONObject jsonObject = (JSONObject) obj;
		JSONArray doctorBook = (JSONArray) jsonObject.get("Doctors");
		Doctor person;
		for (Object pers : doctorBook) {
			person = new Doctor();
			person.setName((String) ((JSONObject) pers).get("Name"));
			person.setId((String) ((JSONObject) pers).get("Id"));
			person.setSpecialization((String) ((JSONObject) pers).get("specialization"));
			person.setAvailability((String) ((JSONObject) pers).get("availability"));
			doctorList.add(person);
		}
	}

	@Override
	public void printAll() {
		for (Doctor p : doctorList) {
			System.out.println(p.toString());
		}
	}

}
