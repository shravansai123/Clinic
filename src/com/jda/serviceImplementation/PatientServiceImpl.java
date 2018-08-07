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
import com.jda.model.Patients;
import com.jda.service.PatientService;
import com.jda.utility.Utility;

public class PatientServiceImpl implements PatientService {

	ArrayList<Patients> patientList = new ArrayList<Patients>();

	@Override
	public void addPatients() throws IOException {
		Utility util = new Utility();
		Patients person = new Patients();
		System.out.println("Enter the Name");
		String Name = util.getInputStringline();
		System.out.println("Enter the Id");
		String Id = util.getInputStringline();
		System.out.println("Enter the mobile");
		String mobile = util.getInputStringline();
		System.out.println("Enter the age");
		String age = util.getInputStringline();
		person.setMobile(mobile);
		person.setId(Id);
		person.setName(Name);
		person.setAge(age);
		patientList.add(person);

	}

	@Override
	public void searchPatientsById() throws IOException {
		Utility util = new Utility();
		System.out.println("Enter the Id");
		String id = util.getInputStringline();
		for (Patients p : patientList) {
			if (p.getId().equals(id)) {
				System.out.println(p.toString());
				break;
			}
		}
	}

	@Override
	public void searchPatientByName() throws IOException {
		Utility util = new Utility();
		System.out.println("Enter the Name");
		String firstName = util.getInputStringline();
		for (Patients p : patientList) {
			if (p.getName().equals(firstName)) {
				System.out.println(p.toString());
				break;
			}
		}
	}

	@Override
	public void removePatients() throws IOException {
		Utility util = new Utility();
		System.out.println("Enter the Name");
		String firstName = util.getInputStringline();
		for (Patients p : patientList) {
			if (p.getName().equals(firstName)) {
				patientList.remove(p);
				break;
			}
		}
	}
	public void getPatients() throws FileNotFoundException, IOException, ParseException {

		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("patients.json"));
		JSONObject jsonObject = (JSONObject) obj;
		JSONArray patientBook = (JSONArray) jsonObject.get("Patients");
		Patients person;
		for (Object pers : patientBook) {
			person = new Patients();
			person.setName((String) ((JSONObject) pers).get("Name"));
			person.setId((String) ((JSONObject) pers).get("Id"));
			person.setAge((String) ((JSONObject) pers).get("Age"));
			person.setMobile((String) ((JSONObject) pers).get("Mobile"));
			patientList.add(person);
		}
	}
	@Override
	public void printAll() {
		for (Patients p : patientList) {
			System.out.println(p.toString());
		}
	}

}
