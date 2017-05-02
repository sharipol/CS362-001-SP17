package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
	 	//Create Appointment
		 int startHour=15;
		 int startMinute=30;
		 int startDay=11;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt1 = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);
		 // create another appointment
		 startHour=14;
		 startMinute=30;
		 startDay=11;
		 startMonth=4;
		 startYear=2017;
		 title="Class";
		 description="Rescheduled class.";
		 //Construct a new Appointment object with the initial data
		 Appt appt2 = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);
		 // create another appointment
		 startHour=13;
		 startMinute=30;
		 startDay=11;
		 startMonth=4;
		 startYear=2017;
		 title="Meeting Today";
		 description="Meeting with the students.";
		 //Construct a new Appointment object with the initial data
		 Appt appt3 = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);
		 //Create CalDay objects
		 CalDay today = new CalDay (new GregorianCalendar(2017,4,11));
		 //Set the calender appointments
		 today.addAppt(appt1);
		 today.addAppt(appt2);
		 today.addAppt(appt3);
		 //Assertions
		 assertTrue(today.isValid());
		 assertEquals(11, today.getDay());
		 assertEquals(4, today.getMonth());
		 assertEquals(2017, today.getYear());
		 assertEquals(3, today.getSizeAppts());
		 assertEquals("\t --- 4/11/2017 --- \n" +
				 " --- -------- Appointments ------------ --- \n" +
				 "\t4/11/2017 at 1:30pm ,Meeting Today, Meeting with the students.\n" +
				 " \t4/11/2017 at 2:30pm ,Class, Rescheduled class.\n" +
				 " \t4/11/2017 at 3:30pm ,Birthday Party, This is my birthday party.\n" +
				 " \n", today.toString());
	 }
	
	
	
	@Test
	public void test02()  throws Throwable  {
		//Create Appointment
		int startHour=-15;
		int startMinute=30;
		int startDay=11;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt1 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// create another appointment
		startHour=14;
		startMinute=30;
		startDay=11;
		startMonth=4;
		startYear=2017;
		title="Class";
		description="Rescheduled class.";
		//Construct a new Appointment object with the initial data
		Appt appt2 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// create another appointment
		startHour=13;
		startMinute=30;
		startDay=11;
		startMonth=4;
		startYear=2017;
		title="Meeting Today";
		description="Meeting with the students.";
		//Construct a new Appointment object with the initial data
		Appt appt3 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		//Create CalDay objects
		CalDay today = new CalDay (new GregorianCalendar(2017,4,11));
		//Set the calender appointments
		today.addAppt(appt1);
		today.addAppt(appt2);
		today.addAppt(appt3);
		//Assertions
		assertTrue(today.isValid());
		assertEquals(11, today.getDay());
		assertEquals(4, today.getMonth());
		assertEquals(2017, today.getYear());
		assertEquals(2, today.getSizeAppts());
		assertEquals("\t --- 4/11/2017 --- \n" +
				" --- -------- Appointments ------------ --- \n" +
				"\t4/11/2017 at 1:30pm ,Meeting Today, Meeting with the students.\n" +
				" \t4/11/2017 at 2:30pm ,Class, Rescheduled class.\n" +
				" \n", today.toString());
	}
	
	
	@Test
	public void test03()  throws Throwable  {
		//Create Appointment
		int startHour=-15;
		int startMinute=30;
		int startDay=11;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt1 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// create another appointment
		startHour=14;
		startMinute=-30;
		startDay=11;
		startMonth=4;
		startYear=2017;
		title="Class";
		description="Rescheduled class.";
		//Construct a new Appointment object with the initial data
		Appt appt2 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// create another appointment
		startHour=13;
		startMinute=30;
		startDay=-11;
		startMonth=4;
		startYear=2017;
		title="Meeting Today";
		description="Meeting with the students.";
		//Construct a new Appointment object with the initial data
		Appt appt3 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		//Create CalDay objects
		CalDay today = new CalDay (new GregorianCalendar(-2017,-4,-11));
		//Set the calender appointments
		today.addAppt(appt1);
		today.addAppt(appt2);
		today.addAppt(appt3);
		//Assertions
		assertTrue(today.isValid());
		assertNotEquals(-11, today.getDay());
		assertNotEquals(-4, today.getMonth());
		assertNotEquals(-2017, today.getYear());
		assertEquals(0, today.getSizeAppts());
		assertNotEquals("\t --- -4/-11/-2017 --- \n" +
				" --- -------- Appointments ------------ --- \n" +
				" \n", today.toString());
	}
	
	
	
	@Test
	public void test04()  throws Throwable  {
	 	//Create uninitiated CalDay
		CalDay today = new CalDay();
		//Assertions
		assertFalse(today.isValid());
	}
}
