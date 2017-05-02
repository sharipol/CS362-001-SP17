package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.*;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {
	
	@Test
	public void test01()  throws Throwable  {
		//Create list of appointments
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		//Create Appointment
		int startHour=15;
		int startMinute=30;
		int startDay=11;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		listAppts.add(appt);
		// create another appointment
		startHour=14;
		startMinute=30;
		startDay=12;
		startMonth=4;
		startYear=2017;
		title="Class";
		description="Rescheduled class.";
		//Construct a new Appointment object with the initial data
		appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		listAppts.add(appt);
		// create another appointment
		startHour=13;
		startMinute=30;
		startDay=11;
		startMonth=4;
		startYear=2017;
		title="Meeting Today";
		description="Meeting with the students.";
		//Construct a new Appointment object with the initial data
		appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		listAppts.add(appt);
		//Create GregortianCalender objects
		GregorianCalendar firstDay = new GregorianCalendar(2017,4,11);
		GregorianCalendar lastDay = new GregorianCalendar(2017,4,13);
		//Create TimeTable
		TimeTable timeTable=new TimeTable();
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		calDays=timeTable.getApptRange(listAppts,firstDay,lastDay);
		//Assertions
		assertEquals(2, calDays.size());
		assertEquals("\t --- 4/11/2017 --- \n" +
				" --- -------- Appointments ------------ --- \n" +
				"\t4/11/2017 at 1:30pm ,Meeting Today, Meeting with the students.\n" +
				" \t4/11/2017 at 3:30pm ,Birthday Party, This is my birthday party.\n" +
				" \n", calDays.get(0).toString());
		assertEquals("\t --- 4/12/2017 --- \n" +
				" --- -------- Appointments ------------ --- \n" +
				"\t4/12/2017 at 2:30pm ,Class, Rescheduled class.\n" +
				" \n", calDays.get(1).toString());
	}
	
	
	
	
	@Test
	public void test02()  throws Throwable  {
		//Create list of appointments
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		//Create Appointment
		int startHour=15;
		int startMinute=30;
		int startDay=11;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		listAppts.add(appt);
		// create another appointment
		startHour=14;
		startMinute=30;
		startDay=12;
		startMonth=4;
		startYear=2017;
		title="Class";
		description="Rescheduled class.";
		//Construct a new Appointment object with the initial data
		appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		listAppts.add(appt);
		// create another appointment
		startHour=13;
		startMinute=30;
		startDay=11;
		startMonth=4;
		startYear=2017;
		title="Meeting Today";
		description="Meeting with the students.";
		//Construct a new Appointment object with the initial data
		appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		listAppts.add(appt);
		//Create GregortianCalender objects
		GregorianCalendar firstDay = new GregorianCalendar(2017,4,13);
		GregorianCalendar lastDay = new GregorianCalendar(2017,4,11);
		//Create TimeTable
		TimeTable timeTable=new TimeTable();
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		try {
			calDays=timeTable.getApptRange(listAppts,firstDay,lastDay);
			fail("Expecting exception: IllegalArgumentException");
			
		} catch(IllegalArgumentException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}
	
	
	
	@Test
	public void test03()  throws Throwable  {
		//Create list of appointments
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		//Create Appointment
		int startHour=15;
		int startMinute=30;
		int startDay=11;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		listAppts.add(appt);
		// create another appointment
		startHour=14;
		startMinute=30;
		startDay=12;
		startMonth=4;
		startYear=2017;
		title="Class";
		description="Rescheduled class.";
		// create another appointment
		startHour=13;
		startMinute=30;
		startDay=11;
		startMonth=4;
		startYear=2017;
		title="Meeting Today";
		description="Meeting with the students.";
		//Construct a new Appointment object with the initial data
		appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		listAppts.add(appt);
		//Create GregorianCalender objects
		GregorianCalendar firstDay = new GregorianCalendar(2017,4,11);
		GregorianCalendar lastDay = new GregorianCalendar(2017,4,13);
		//Create TimeTable
		TimeTable timeTable=new TimeTable();
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		calDays=timeTable.getApptRange(listAppts,firstDay,lastDay);
		//Assertions
		assertEquals(2, calDays.size());
		assertEquals("\t --- 4/11/2017 --- \n" +
				" --- -------- Appointments ------------ --- \n" +
				"\t4/11/2017 at 1:30pm ,Meeting Today, Meeting with the students.\n" +
				" \t4/11/2017 at 3:30pm ,Birthday Party, This is my birthday party.\n" +
				" \n", calDays.get(0).toString());
		
		//Delete an appointment
		LinkedList<Appt> listUpdatedAppts=timeTable.deleteAppt(listAppts, appt);
		calDays = new LinkedList<CalDay>();
		assertEquals(0, calDays.size());
		calDays = timeTable.getApptRange(listAppts, firstDay, lastDay);
		assertEquals(2, calDays.size());
		//Second assertions
		assertEquals("\t --- 4/11/2017 --- \n" +
				" --- -------- Appointments ------------ --- \n" +
				"\t4/11/2017 at 3:30pm ,Birthday Party, This is my birthday party.\n" +
				" \n", calDays.get(0).toString());
	}
	
	
	
	
	
	@Test
	public void test04()  throws Throwable  {
		//Create list of appointments
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		GregorianCalendar firstDay = new GregorianCalendar(2017,4,11);
		GregorianCalendar lastDay = new GregorianCalendar(2017,4,13);
		Appt appt = new Appt(1,1,1,1,1,null, null);
		//Create TimeTable
		TimeTable timeTable=new TimeTable();
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		calDays=timeTable.getApptRange(listAppts,firstDay,lastDay);
		//Assertions
		assertEquals(null, timeTable.deleteAppt(listAppts,appt));
		assertEquals("\t --- 4/11/2017 --- \n" +
				" --- -------- Appointments ------------ --- \n" +
				"\n", calDays.get(0).toString());
	}
	
	
	
	
	
	@Test
	public void test05()  throws Throwable  {
		//Create list of appointments
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		GregorianCalendar firstDay = new GregorianCalendar(2017,4,11);
		GregorianCalendar lastDay = new GregorianCalendar(2017,4,13);
		Appt appt = new Appt(-1,0,0,0,0,null, null);
		listAppts.add(appt);
		//Create TimeTable
		TimeTable timeTable=new TimeTable();
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		calDays=timeTable.getApptRange(listAppts,firstDay,lastDay);
		//Assertions
		assertEquals(null, timeTable.deleteAppt(listAppts,appt));
	}
	
	@Test
	public void test06()  throws Throwable  {
		//Create list of appointments
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		GregorianCalendar firstDay = new GregorianCalendar(2017,4,11);
		GregorianCalendar lastDay = new GregorianCalendar(2017,4,13);
		Appt appt = new Appt(1,1,1,1,1,null, null);
		listAppts.add(appt);
		//Create TimeTable
		TimeTable timeTable=new TimeTable();
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		LinkedList<Appt> listUpdatedAppts=timeTable.deleteAppt(listAppts, appt);
		assertEquals(null, timeTable.deleteAppt(listAppts,appt));
	}
	
}
