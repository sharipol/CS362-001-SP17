package edu.osu.cs362;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
    private static final long TestTimeout = 10000; /* Timeout at 10 seconds */
	private static final int NUM_TESTS=100;
	
	/**
	 * Return a randomly selected method to be tests !.
	 */
	
	/**
	 * Generate Random Tests that tests Appt Class.
	 */
	@Test
	public void radnomtest()  throws Throwable  {
		
		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		
		
		System.out.println("Start testing...");
		
		
		for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			long randomseed =10;//System.currentTimeMillis();
			//			System.out.println(" Seed:"+randomseed );
			Random random = new Random(randomseed);
			
			
			//Create list of appointments
			LinkedList<Appt> listAppts = new LinkedList<Appt>();
			
			
			//Create GregortianCalender objects
			GregorianCalendar firstDay = new GregorianCalendar(2017,4,11);
			GregorianCalendar lastDay = new GregorianCalendar(2017,4,13);
			
			
			//Create TimeTable
			TimeTable timeTable=new TimeTable();
			assertNull(timeTable.deleteAppt(listAppts, null));
			assertNull(timeTable.deleteAppt(null, null));
			
			
			
			
			
			
			
			
			for (int i = 0; i < NUM_TESTS; i++) {
				//Create Appointment
				int startHour=ValuesGenerator.getRandomIntBetween(random, 0, 23);
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
				listAppts.add(appt1);
				
				
				// create another appointment
				Appt appt2 = new Appt(ValuesGenerator.getRandomIntBetween(random, -10, -1),
						startMinute ,
						startDay ,
						startMonth ,
						startYear ,
						title,
						description);
				listAppts.add(appt2);
				
				Appt appt3 = new Appt(startHour,
						ValuesGenerator.getRandomIntBetween(random, 0, 59) ,
						startDay ,
						startMonth ,
						startYear ,
						title,
						description);
				
				//Delete an appointment
				assertNotNull(timeTable.deleteAppt(listAppts, appt1));
				assertNull(timeTable.deleteAppt(listAppts, appt2));
				assertNull(timeTable.deleteAppt(listAppts, appt3));
				
			}
			
			elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			if((iteration%10000)==0 && iteration!=0 )
				System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			
		}
		
		
		System.out.println("Done testing...");
	}


	
}
