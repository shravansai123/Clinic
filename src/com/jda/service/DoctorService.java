package com.jda.service;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public interface DoctorService {
public void addDoctors() throws IOException, ParseException;
public void searchDoctorById() throws IOException;
public void searchDoctorByName() throws IOException;
public void removeDoctors() throws IOException;
public void printAll();
}
