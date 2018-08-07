package com.jda.controller;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.jda.serviceImplementation.DoctorServiceImpl;
import com.jda.serviceImplementation.PatientServiceImpl;
import com.jda.utility.Utility;

public class ClinicManagementMain {
	public static void main(String[] args) throws NumberFormatException, IOException, ParseException{
		Utility util=new Utility();
		int choice;
		do{
			DoctorServiceImpl doc=new DoctorServiceImpl();
			PatientServiceImpl patient=new PatientServiceImpl();
			System.out.println("enter the choice 1. Doctor Service 2.Patient Service 0. close program ");
			choice=Integer.parseInt(util.getInputStringline());
			switch(choice){
			case 1:doc.getDoctors();break;
			case 2:patient.getPatients();break;
			}
		}while (choice!=0);
}}
