package edu.osu.cs362;


import org.junit.Test;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	
    /**
     * Generate Random Tests that tests CalDay Class.
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
			
			GregorianCalendar calendar = new GregorianCalendar();
			CalDay calDay = new CalDay(calendar);
			
			for (int i = 0; i < NUM_TESTS; i++) {
				int startHourGood= ValuesGenerator.getRandomIntBetween(random ,0, 23);
				int startHourHigh= ValuesGenerator.getRandomIntBetween(random ,24, 50);
				int startHourLow= ValuesGenerator.getRandomIntBetween(random ,-20, -1);
				int startMinute=30;
				int startDay=11;
				int startMonth=4;
				int startYear=2017;
				String title="Birthday Party";
				String description="This is my birthday party.";
				//Construct a new Appointment object with the initial data
				
				
				Appt appt1 = new Appt(startHourGood,
						startMinute ,
						startDay ,
						startMonth ,
						startYear ,
						title,
						description);
				
				Appt appt2 = new Appt(startHourHigh,
						startMinute ,
						startDay ,
						startMonth ,
						startYear ,
						title,
						description);
				
				Appt appt3 = new Appt(startHourLow,
						startMinute ,
						startDay ,
						startMonth ,
						startYear ,
						title,
						description);
				
				calDay.addAppt(appt1);
				assertTrue(calDay.isValid());
				
				calDay.addAppt(appt2);
				assertTrue(calDay.isValid());
				
				calDay.addAppt(appt3);
				assertTrue(calDay.isValid());
				
			}
			
			elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			if((iteration%10000)==0 && iteration!=0 )
				System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			
		}
		
		
		System.out.println("Done testing...");
	}


	
}
