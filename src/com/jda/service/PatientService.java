package com.jda.service;

import java.io.IOException;

public interface PatientService {
	public void addPatients() throws IOException;
	public void searchPatientsById() throws IOException;
	public void searchPatientByName() throws IOException;
	public void removePatients() throws IOException;
	public void printAll();
}
