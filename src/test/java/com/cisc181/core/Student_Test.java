package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	public static Date date(int year, int month, int day) {
		Calendar theDate = Calendar.getInstance();
		theDate.set(year, month, day);
		return theDate.getTime();
		
	}
	

	@BeforeClass
	public static void setup() {
		ArrayList<Course> courses = new ArrayList<Course>();
		ArrayList<Semester> semester = new ArrayList<Semester>();
		ArrayList<Section> section = new ArrayList<Section>();
		ArrayList<Student> student = new ArrayList<Student>();
		ArrayList<Enrollment> enrollment = new ArrayList<Enrollment>();
		
		Course Chemistry = new Course(UUID.randomUUID(),"Chemistry I",2,eMajor.CHEM);
		courses.add(Chemistry);
		Course Nursing = new Course(UUID.randomUUID(),"Nursing II",4,eMajor.NURSING);
		courses.add(Nursing);
		Course Physics = new Course(UUID.randomUUID(),"Physics I",3,eMajor.PHYSICS);
		courses.add(Physics);
	
		Semester Fall = new Semester(UUID.randomUUID(), date (2017,8,30), date(2017,12,19));
		semester.add(Fall);
		Semester Spring = new Semester(UUID.randomUUID(),date(2018,2,6),date(2018,5,19)); 
		semester.add(Spring);
		
		Section Chemistry_fall = new Section(Chemistry.getCourseID(),Fall.getSemesterID(),105);
		section.add(Chemistry_fall);
		Section Nursing_fall = new Section(Nursing.getCourseID(),Fall.getSemesterID(),222);
		section.add(Nursing_fall);
		Section Physics_fall = new Section(Physics.getCourseID(),Fall.getSemesterID(),102);
		section.add(Physics_fall);
		
		Section Chemistry_spring = new Section(Chemistry.getCourseID(),Fall.getSemesterID(),305);
		section.add(Chemistry_spring);
		Section Nursing_spring = new Section(Nursing.getCourseID(),Fall.getSemesterID(),220);
		section.add(Nursing_spring);
		Section Physics_spring = new Section(Physics.getCourseID(),Fall.getSemesterID(),107);
		section.add(Physics_spring);
		
		Student student0 = new Student("Gregory","","Seiverd",date(1996,10,31),eMajor.NURSING,"3205 Woolen Way"
				+ "Newark,DE","(302) 727-5888","gseiverd@udel.edu");
		student.add(student0);
		Enrollment NursingF17_S0 = new Enrollment(Nursing_fall.getSectionID(),student0.getStudentID());
		NursingF17_S0.setGrade(2.7);
		Enrollment ChemistryF17_S0 = new Enrollment(Chemistry_fall.getSectionID(),student0.getStudentID());
		ChemistryF17_S0.setGrade(4.0);
		Enrollment PhysicsF17_S0 = new Enrollment(Physics_fall.getSectionID(),student0.getStudentID());
		PhysicsF17_S0.setGrade(4.0);
		Enrollment NursingS18_S0 = new Enrollment(Nursing_spring.getSectionID(),student0.getStudentID());
		NursingS18_S0.setGrade(2.0);
		Enrollment ChemistryS18_S0 = new Enrollment(Chemistry_spring.getSectionID(),student0.getStudentID());
		ChemistryS18_S0.setGrade(4.0);
		Enrollment PhysicsS18_S0 = new Enrollment(Physics_spring.getSectionID(),student0.getStudentID());
		PhysicsS18_S0.setGrade(3.3);
		
		double GPAstudent0 = ((NursingF17_S0.getGrade()
				+ChemistryF17_S0.getGrade()
				+PhysicsF17_S0.getGrade()
				+NursingS18_S0.getGrade()
				+ChemistryS18_S0.getGrade()
				+PhysicsS18_S0.getGrade())/6);
		assertEquals("GPA for student is:",GPAstudent0==3.33);
		
		Student student1 = new Student("Colleen","","Meeley",date(1996,2,21),eMajor.CHEM,"3206 Woolen Way"
				+ "Newark,DE","(302) 727-5889","cmeeley@udel.edu");
		student.add(student1);
		Enrollment NursingF17_S1 = new Enrollment(Nursing_fall.getSectionID(),student1.getStudentID());
		NursingF17_S1.setGrade(3.7);
		Enrollment ChemistryF17_S1 = new Enrollment(Chemistry_fall.getSectionID(),student1.getStudentID());
		ChemistryF17_S1.setGrade(3.0);
		Enrollment PhysicsF17_S1 = new Enrollment(Physics_fall.getSectionID(),student1.getStudentID());
		PhysicsF17_S1.setGrade(3.0);
		Enrollment NursingS18_S1 = new Enrollment(Nursing_spring.getSectionID(),student1.getStudentID());
		NursingS18_S1.setGrade(3.1);
		Enrollment ChemistryS18_S1 = new Enrollment(Chemistry_spring.getSectionID(),student1.getStudentID());
		ChemistryS18_S1.setGrade(3.0);
		Enrollment PhysicsS18_S1 = new Enrollment(Physics_spring.getSectionID(),student1.getStudentID());
		PhysicsS18_S1.setGrade(3.5);
		
		double GPAstudent1 = ((NursingF17_S1.getGrade()
				+ChemistryF17_S1.getGrade()
				+PhysicsF17_S1.getGrade()
				+NursingS18_S1.getGrade()
				+ChemistryS18_S1.getGrade()
				+PhysicsS18_S1.getGrade())/6);
		assertEquals("GPA for student is:",GPAstudent1== 3.21);
		
		Student student2 = new Student("Bo","","Jackson",date(1950,10,1),eMajor.PHYSICS,"3207 Woolen Way"
				+ "Newark,DE","(302) 727-5880","bjackson@udel.edu");
		student.add(student2);
		Enrollment NursingF17_S2 = new Enrollment(Nursing_fall.getSectionID(),student2.getStudentID());
		NursingF17_S2.setGrade(1.8);
		Enrollment ChemistryF17_S2 = new Enrollment(Chemistry_fall.getSectionID(),student2.getStudentID());
		ChemistryF17_S2.setGrade(4.0);
		Enrollment PhysicsF17_S2 = new Enrollment(Physics_fall.getSectionID(),student2.getStudentID());
		PhysicsF17_S2.setGrade(2.2);
		Enrollment NursingS18_S2 = new Enrollment(Nursing_spring.getSectionID(),student2.getStudentID());
		NursingS18_S2.setGrade(1.2);
		Enrollment ChemistryS18_S2 = new Enrollment(Chemistry_spring.getSectionID(),student2.getStudentID());
		ChemistryS18_S2.setGrade(3.8);
		Enrollment PhysicsS18_S2 = new Enrollment(Physics_spring.getSectionID(),student2.getStudentID());
		PhysicsS18_S2.setGrade(3.3);
		
		double GPAstudent2 = ((NursingF17_S2.getGrade()
				+ChemistryF17_S2.getGrade()
				+PhysicsF17_S2.getGrade()
				+NursingS18_S2.getGrade()
				+ChemistryS18_S2.getGrade()
				+PhysicsS18_S2.getGrade())/6);
		assertEquals("GPA for student is:",GPAstudent2== 2.7);
		
		Student student3 = new Student("Michael","","Terry",date(1980,10,31),eMajor.NURSING,"3207 Woolen Way"
				+ "Newark,DE","(302) 727-5881","mterry@udel.edu");
		student.add(student3);
		Enrollment NursingF17_S3 = new Enrollment(Nursing_fall.getSectionID(),student3.getStudentID());
		NursingF17_S3.setGrade(3.7);
		Enrollment ChemistryF17_S3 = new Enrollment(Chemistry_fall.getSectionID(),student3.getStudentID());
		ChemistryF17_S3.setGrade(2.0);
		Enrollment PhysicsF17_S3 = new Enrollment(Physics_fall.getSectionID(),student3.getStudentID());
		PhysicsF17_S3.setGrade(2.0);
		Enrollment NursingS18_S3 = new Enrollment(Nursing_spring.getSectionID(),student3.getStudentID());
		NursingS18_S3.setGrade(3.0);
		Enrollment ChemistryS18_S3 = new Enrollment(Chemistry_spring.getSectionID(),student3.getStudentID());
		ChemistryS18_S3.setGrade(2.7);
		Enrollment PhysicsS18_S3 = new Enrollment(Physics_spring.getSectionID(),student3.getStudentID());
		PhysicsS18_S3.setGrade(3.1);
		
		double GPAstudent3 = ((NursingF17_S3.getGrade()
				+ChemistryF17_S3.getGrade()
				+PhysicsF17_S3.getGrade()
				+NursingS18_S3.getGrade()
				+ChemistryS18_S3.getGrade()
				+PhysicsS18_S3.getGrade())/6);
		assertEquals("GPA for student is:",GPAstudent3== 2.75);
		
		Student student4 = new Student("Aaron","","Michael",date(1996,11,1),eMajor.COMPSI,"3209 Woolen Way"
				+ "Newark,DE","(302) 727-5882","amichael@udel.edu");
		student.add(student4);
		Enrollment NursingF17_S4 = new Enrollment(Nursing_fall.getSectionID(),student4.getStudentID());
		NursingF17_S4.setGrade(1.5);
		Enrollment ChemistryF17_S4 = new Enrollment(Chemistry_fall.getSectionID(),student4.getStudentID());
		ChemistryF17_S4.setGrade(3.5);
		Enrollment PhysicsF17_S4 = new Enrollment(Physics_fall.getSectionID(),student4.getStudentID());
		PhysicsF17_S4.setGrade(2.5);
		Enrollment NursingS18_S4 = new Enrollment(Nursing_spring.getSectionID(),student4.getStudentID());
		NursingS18_S4.setGrade(2.5);
		Enrollment ChemistryS18_S4 = new Enrollment(Chemistry_spring.getSectionID(),student4.getStudentID());
		ChemistryS18_S4.setGrade(4.0);
		Enrollment PhysicsS18_S4 = new Enrollment(Physics_spring.getSectionID(),student4.getStudentID());
		PhysicsS18_S4.setGrade(2.3);
		
		double GPAstudent4 = ((NursingF17_S4.getGrade()
				+ChemistryF17_S4.getGrade()
				+PhysicsF17_S4.getGrade()
				+NursingS18_S4.getGrade()
				+ChemistryS18_S4.getGrade()
				+PhysicsS18_S4.getGrade())/6);
		assertEquals("GPA for student is:",GPAstudent4 == 2.71);
		
		Student student5 = new Student("Joe","","Biden",date(1996,11,2),eMajor.NURSING,"3200 Woolen Way"
				+ "Newark,DE","(302) 727-5883","jbiden@udel.edu");
		student.add(student5);
		Enrollment NursingF17_S5 = new Enrollment(Nursing_fall.getSectionID(),student5.getStudentID());
		NursingF17_S5.setGrade(2.1);
		Enrollment ChemistryF17_S5 = new Enrollment(Chemistry_fall.getSectionID(),student5.getStudentID());
		ChemistryF17_S5.setGrade(3.1);
		Enrollment PhysicsF17_S5 = new Enrollment(Physics_fall.getSectionID(),student5.getStudentID());
		PhysicsF17_S5.setGrade(3.1);
		Enrollment NursingS18_S5 = new Enrollment(Nursing_spring.getSectionID(),student5.getStudentID());
		NursingS18_S5.setGrade(4.0);
		Enrollment ChemistryS18_S5 = new Enrollment(Chemistry_spring.getSectionID(),student5.getStudentID());
		ChemistryS18_S5.setGrade(4.0);
		Enrollment PhysicsS18_S5 = new Enrollment(Physics_spring.getSectionID(),student5.getStudentID());
		PhysicsS18_S5.setGrade(2.3);
		
		double GPAstudent5 = ((NursingF17_S5.getGrade()
				+ChemistryF17_S5.getGrade()
				+PhysicsF17_S5.getGrade()
				+NursingS18_S5.getGrade()
				+ChemistryS18_S5.getGrade()
				+PhysicsS18_S5.getGrade())/6);
		assertEquals("GPA for student is:",GPAstudent5== 3.1);
		
		Student student6 = new Student("Aaron","","Judge",date(1996,11,9),eMajor.NURSING,"2200 Woolen Way"
				+ "Newark,DE","(302) 727-5777","thejudge@udel.edu");
		student.add(student6);
		Enrollment NursingF17_S6 = new Enrollment(Nursing_fall.getSectionID(),student6.getStudentID());
		NursingF17_S6.setGrade(3.0);
		Enrollment ChemistryF17_S6 = new Enrollment(Chemistry_fall.getSectionID(),student6.getStudentID());
		ChemistryF17_S6.setGrade(3.0);
		Enrollment PhysicsF17_S6 = new Enrollment(Physics_fall.getSectionID(),student6.getStudentID());
		PhysicsF17_S6.setGrade(3.0);
		Enrollment NursingS18_S6 = new Enrollment(Nursing_spring.getSectionID(),student6.getStudentID());
		NursingS18_S6.setGrade(3.0);
		Enrollment ChemistryS18_S6 = new Enrollment(Chemistry_spring.getSectionID(),student6.getStudentID());
		ChemistryS18_S6.setGrade(3.0);
		Enrollment PhysicsS18_S6 = new Enrollment(Physics_spring.getSectionID(),student6.getStudentID());
		PhysicsS18_S6.setGrade(3.0);
		
		double GPAstudent6 = ((NursingF17_S6.getGrade()
				+ChemistryF17_S6.getGrade()
				+PhysicsF17_S6.getGrade()
				+NursingS18_S6.getGrade()
				+ChemistryS18_S6.getGrade()
				+PhysicsS18_S6.getGrade())/6);
		assertEquals("GPA for student is:",GPAstudent6== 3.0);

		
		Student student7 = new Student("Jimmy","","Diesel",date(1996,11,3),eMajor.NURSING,"3201 Woolen Way"
				+ "Newark,DE","(302) 727-5884","jdiesel@udel.edu");
		student.add(student7);
		Enrollment NursingF17_S7 = new Enrollment(Nursing_fall.getSectionID(),student7.getStudentID());
		NursingF17_S7.setGrade(2.8);
		Enrollment ChemistryF17_S7 = new Enrollment(Chemistry_fall.getSectionID(),student7.getStudentID());
		ChemistryF17_S7.setGrade(3.1);
		Enrollment PhysicsF17_S7 = new Enrollment(Physics_fall.getSectionID(),student7.getStudentID());
		PhysicsF17_S7.setGrade(4.0);
		Enrollment NursingS18_S7 = new Enrollment(Nursing_spring.getSectionID(),student7.getStudentID());
		NursingS18_S7.setGrade(2.2);
		Enrollment ChemistryS18_S7 = new Enrollment(Chemistry_spring.getSectionID(),student7.getStudentID());
		ChemistryS18_S7.setGrade(3.0);
		Enrollment PhysicsS18_S7 = new Enrollment(Physics_spring.getSectionID(),student7.getStudentID());
		PhysicsS18_S7.setGrade(2.1);
		
		double GPAstudent7 = ((NursingF17_S1.getGrade()
				+ChemistryF17_S7.getGrade()
				+PhysicsF17_S7.getGrade()
				+NursingS18_S7.getGrade()
				+ChemistryS18_S7.getGrade()
				+PhysicsS18_S7.getGrade())/6);
		assertEquals("GPA for student is:",GPAstudent7== 2.86);
		
		Student student8 = new Student("Judd","","Williams",date(1996,11,5),eMajor.NURSING,"3202 Woolen Way"
				+ "Newark,DE","(302) 727-5885","jwilliams@udel.edu");
		student.add(student8);
		Enrollment NursingF17_S8 = new Enrollment(Nursing_fall.getSectionID(),student8.getStudentID());
		NursingF17_S8.setGrade(3.0);
		Enrollment ChemistryF17_S8 = new Enrollment(Chemistry_fall.getSectionID(),student8.getStudentID());
		ChemistryF17_S8.setGrade(2.0);
		Enrollment PhysicsF17_S8 = new Enrollment(Physics_fall.getSectionID(),student8.getStudentID());
		PhysicsF17_S8.setGrade(4.0);
		Enrollment NursingS18_S8 = new Enrollment(Nursing_spring.getSectionID(),student8.getStudentID());
		NursingS18_S8.setGrade(3.0);
		Enrollment ChemistryS18_S8 = new Enrollment(Chemistry_spring.getSectionID(),student8.getStudentID());
		ChemistryS18_S8.setGrade(1.8);
		Enrollment PhysicsS18_S8 = new Enrollment(Physics_spring.getSectionID(),student8.getStudentID());
		PhysicsS18_S8.setGrade(2.2);
		
		double GPAstudent8 = ((NursingF17_S1.getGrade()
				+ChemistryF17_S8.getGrade()
				+PhysicsF17_S8.getGrade()
				+NursingS18_S8.getGrade()
				+ChemistryS18_S8.getGrade()
				+PhysicsS18_S8.getGrade())/6);
		assertEquals("GPA for student is:",GPAstudent8== 2.66);
		
		Student student9 = new Student("Michael","","Johnson",date(1996,11,6),eMajor.NURSING,"3203 Woolen Way"
				+ "Newark,DE","(302) 727-5886","mjohnson@udel.edu");
		student.add(student9);
		Enrollment NursingF17_S9 = new Enrollment(Nursing_fall.getSectionID(),student9.getStudentID());
		NursingF17_S9.setGrade(4.0);
		Enrollment ChemistryF17_S9 = new Enrollment(Chemistry_fall.getSectionID(),student9.getStudentID());
		ChemistryF17_S9.setGrade(4.0);
		Enrollment PhysicsF17_S9 = new Enrollment(Physics_fall.getSectionID(),student9.getStudentID());
		PhysicsF17_S9.setGrade(4.0);
		Enrollment NursingS18_S9 = new Enrollment(Nursing_spring.getSectionID(),student9.getStudentID());
		NursingS18_S9.setGrade(4.0);
		Enrollment ChemistryS18_S9 = new Enrollment(Chemistry_spring.getSectionID(),student9.getStudentID());
		ChemistryS18_S9.setGrade(4.0);
		Enrollment PhysicsS18_S9 = new Enrollment(Physics_spring.getSectionID(),student9.getStudentID());
		PhysicsS18_S9.setGrade(4.0);
		
		double GPAstudent9 = ((NursingF17_S1.getGrade()
				+ChemistryF17_S9.getGrade()
				+PhysicsF17_S9.getGrade()
				+NursingS18_S9.getGrade()
				+ChemistryS18_S9.getGrade()
				+PhysicsS18_S9.getGrade())/6);
		assertEquals("GPA for student is:",GPAstudent9== 4.0);
		
		
		double NursingAvg = ((NursingF17_S0.getGrade()+NursingS18_S0.getGrade()+
				  NursingF17_S1.getGrade()+NursingS18_S1.getGrade()+
				  NursingF17_S2.getGrade()+NursingS18_S2.getGrade()+
				  NursingF17_S3.getGrade()+NursingS18_S3.getGrade()+
				  NursingF17_S4.getGrade()+NursingS18_S4.getGrade()+
				  NursingF17_S5.getGrade()+NursingS18_S5.getGrade()+
				  NursingF17_S6.getGrade()+NursingS18_S6.getGrade()+
				  NursingF17_S7.getGrade()+NursingS18_S7.getGrade()+
				  NursingF17_S8.getGrade()+NursingS18_S8.getGrade()+
				  NursingF17_S9.getGrade()+NursingS18_S9.getGrade())/20);
		assertEquals("Nursing Average",NursingAvg== 2.815);
		
		double ChemistryAvg = ((ChemistryF17_S0.getGrade()+ChemistryS18_S0.getGrade()+
				ChemistryF17_S1.getGrade()+ChemistryS18_S1.getGrade()+
				ChemistryF17_S2.getGrade()+ChemistryS18_S2.getGrade()+
				ChemistryF17_S3.getGrade()+ChemistryS18_S3.getGrade()+
				ChemistryF17_S4.getGrade()+ChemistryS18_S4.getGrade()+
				ChemistryF17_S5.getGrade()+ChemistryS18_S5.getGrade()+
				ChemistryF17_S6.getGrade()+ChemistryS18_S6.getGrade()+
				ChemistryF17_S7.getGrade()+ChemistryS18_S7.getGrade()+
				ChemistryF17_S8.getGrade()+ChemistryS18_S8.getGrade()+
				ChemistryF17_S9.getGrade()+ChemistryS18_S9.getGrade())/20);
		assertEquals("Chemistry Average",ChemistryAvg== 3.25);
		
		double PhysicsAvg = ((PhysicsF17_S0.getGrade()+PhysicsS18_S0.getGrade()+
				PhysicsF17_S1.getGrade()+PhysicsS18_S1.getGrade()+
				PhysicsF17_S2.getGrade()+PhysicsS18_S2.getGrade()+
				PhysicsF17_S3.getGrade()+PhysicsS18_S3.getGrade()+
				PhysicsF17_S4.getGrade()+PhysicsS18_S4.getGrade()+
				PhysicsF17_S5.getGrade()+PhysicsS18_S5.getGrade()+
				PhysicsF17_S6.getGrade()+PhysicsS18_S6.getGrade()+
				PhysicsF17_S7.getGrade()+PhysicsS18_S7.getGrade()+
				PhysicsF17_S8.getGrade()+PhysicsS18_S8.getGrade()+
				PhysicsF17_S9.getGrade()+PhysicsS18_S9.getGrade())/20);
		assertEquals("Physics Average",PhysicsAvg== 3.04);
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}