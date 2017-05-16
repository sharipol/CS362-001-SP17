package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeoutException;


import com.sun.corba.se.impl.orbutil.closure.Future;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.model.TestTimedOutException;



import static org.junit.Assert.*;

public class CalDayTest {
	
	
	private final CountDownLatch latch = new CountDownLatch(1);

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
		 assertTrue(today.iterator().hasNext());
	 }
	
	
	
	@Test
	public void test02()  throws Throwable  {
		//Create an invalid appointment
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
		assertFalse(today.iterator().hasNext());
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
		assertNull(today.iterator());
	}
	
	
	
	
	
	@Test
	public void test05()  throws Throwable  {
		//Create uninitiated CalDay
		CalDay today = new CalDay();
		//Assertions
		assertFalse(today.isValid());
		//Create Appointment list
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
		//Change CalDay variables
		today.day = 11;
		today.month = 4;
		today.year = 2017;
		today.appts = listAppts;
		today.valid = true;
		//Second assertion
		assertTrue(today.isValid());
		assertEquals(11, today.getDay());
		assertEquals(4, today.getMonth());
		assertEquals(2017, today.getYear());
		assertEquals(1, today.getSizeAppts());
		assertNotEquals(0, today.getSizeAppts());
	}
	
	
	
	
	
	@Test
	public void test06()  throws Throwable  {
		CalDay calDay = new CalDay();
		Iterator itr = calDay.iterator();
		String test = calDay.toString();
		assertFalse(calDay.isValid());
		try {
			assertNull(itr);
			if ( itr == null ) {
				throw new RuntimeException();
			}
		}
		catch (RuntimeException e) {
			
		}
			
	}
	
	
	@Test
	public void test07()  throws Throwable  {
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
		startHour=15;
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
		CalDay today = new CalDay (new GregorianCalendar(2017,4,11));
		//Set the calender appointments
		today.addAppt(appt1);
		today.addAppt(appt2);
		//Assertions
		assertTrue(today.isValid());
		assertEquals(11, today.getDay());
		assertEquals(4, today.getMonth());
		assertEquals(2017, today.getYear());
		assertEquals(2, today.getSizeAppts());
		assertEquals("\t --- 4/11/2017 --- \n" +
				" --- -------- Appointments ------------ --- \n" +
				"\t4/11/2017 at 3:30pm ,Birthday Party, This is my birthday party.\n" +
				" \t4/11/2017 at 3:30pm ,Class, Rescheduled class.\n" +
				" \n", today.toString());
		assertTrue(today.iterator().hasNext());
		assertNotNull(today.iterator());
	}
	
	
	
	
	
	
	@Test
	public void test08()  throws Throwable  {
		//Construct a new Appointment object
		Appt appt1 = new Appt(10,
				30 ,
				5 ,
				8 ,
				2017 ,
				"",
				"");
		//Construct a new Appointment object
		Appt appt2 = new Appt(10,
				20 ,
				5 ,
				8 ,
				2017 ,
				"appt2",
				"");
		//Create CalDay objects
		CalDay today = new CalDay (new GregorianCalendar(2017,8,5));
		assertFalse(today.iterator().hasNext());
		//Set the calender appointments
		today.addAppt(appt1);
		today.addAppt(appt2);
		//Assertions
		assertTrue(today.isValid());
		assertEquals(2, today.getSizeAppts());
		Assert.assertEquals("\t8/5/2017 at 10:30am ,, \n", today.getAppts().getFirst().toString());
	}
	
	

}

