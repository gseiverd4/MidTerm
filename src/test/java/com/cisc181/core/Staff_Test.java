package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		ArrayList<Staff> newStaff = new ArrayList<Staff>();
		Staff Greg = new Staff(eTitle.MR);
		Staff Colleen = new Staff(eTitle.MS);
		Staff Katie = new Staff(eTitle.MRS);
		Staff Haley = new Staff(eTitle.MS);
		Staff Shane = new Staff(eTitle.MR);
		
		newStaff.add(Greg);
		newStaff.add(Colleen);
		newStaff.add(Katie);
		newStaff.add(Haley);
		newStaff.add(Shane);
		
		Greg.setSalary(90000);
		Colleen.setSalary(45000);
		Katie.setSalary(69000);
		Haley.setSalary(8000);
		Shane.setSalary(250000);
		
		double AverageSalary = 0;
		for (Staff staff: newStaff) {
			AverageSalary += staff.getSalary();
				
		}
		AverageSalary /= 5;
		assertTrue(AverageSalary == 92400);
		assertFalse(AverageSalary == 280000);
	}
	public static void test_dateOfBirth() throws PersonException {
		Calendar birthdate = Calendar.getInstance();
		Date DOB = birthdate.getTime();
		Staff Michael = new Staff(eTitle.MR);
		// B-date should be (Y,M,D)
		birthdate.set(1996, 10, 1);
		Michael.setDOB(DOB);
		
		Staff Jason = new Staff(eTitle.MR);
		birthdate.set(1990, 12, 25);
		Jason.setDOB(DOB);
	}
	public static void test_phoneNumber() throws PersonException {
		Staff Diesel = new Staff(eTitle.MR);
		Diesel.getPhone();
		Diesel.setPhone("(302) 433-8257");
		
		Staff Elise = new Staff(eTitle.MS);
		Elise.getPhone();
		Elise.setPhone("(455) 4443-23111");
		//Invalid Phone number
		
	}
	
	

}
