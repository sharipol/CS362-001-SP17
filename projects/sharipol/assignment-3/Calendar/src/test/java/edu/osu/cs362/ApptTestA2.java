package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(4, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
		 assertEquals("\t4/10/2017 at 1:30pm ,Birthday Party, This is my birthday party.\n", appt.toString());
	 }
	
	
	
	
	
	
	@Test
	public void test02()  throws Throwable  {
		int startHour=-13;
		int startMinute=30;
		int startDay=10;
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
		// assertions
		assertFalse(appt.getValid());
		assertEquals(-13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(4, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
		assertNotEquals("\t4/10/2017 at 1:30pm ,Birthday Party, This is my birthday party.\n", appt.toString());
	}
	
	
	
	
	
	@Test
	public void test03()  throws Throwable  {
		int startHour=-13;
		int startMinute=-30;
		int startDay=-10;
		int startMonth=-4;
		int startYear=-2017;
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
		// assertions
		assertFalse(appt.getValid());
		assertNotEquals(13, appt.getStartHour());
		assertNotEquals(30, appt.getStartMinute());
		assertNotEquals(10, appt.getStartDay());
		assertNotEquals(4, appt.getStartMonth());
		assertNotEquals(2017, appt.getStartYear());
		assertNotEquals("Birthday Party!", appt.getTitle());
		assertNotEquals("This is my birthday party", appt.getDescription());
		assertNotEquals("\t4/10/2017 at 1:30pm ,Birthday Party, This is my birthday party.\n", appt.toString());
		//Change Appointment detaila
		appt.setStartHour(2);
		appt.setStartMinute(15);
		appt.setStartDay(8);
		appt.setStartMonth(7);
		appt.setStartYear(2017);
		appt.setTitle("Birthday Party!");
		appt.setDescription("This is my birthday party, lets get lit fam!!!");
		// Second assertions
		assertTrue(appt.getValid());
		assertEquals(2, appt.getStartHour());
		assertEquals(15, appt.getStartMinute());
		assertEquals(8, appt.getStartDay());
		assertEquals(7, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party!", appt.getTitle());
		assertEquals("This is my birthday party, lets get lit fam!!!", appt.getDescription());
		assertEquals("\t7/8/2017 at 2:15am ,Birthday Party!, This is my birthday party, lets get lit fam!!!\n", appt.toString());
		
	 }
	
	
	
	
	
	
	
	
	@Test
	public void test04()  throws Throwable  {
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=-4;
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
		// assertions
		assertFalse(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertNotEquals(4, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertNotEquals("Bithday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
		assertNotEquals("\t4/10/2017 at 1:30pm ,Birthday Party, This is my birthday party.\n", appt.toString());
		//Change Appointment detaila
		appt.setStartHour(14);
		appt.setStartMonth(7);
		appt.setStartYear(2017);
		appt.setTitle("Birthday Party!");
		// Second assertions
		assertTrue(appt.getValid());
		assertNotEquals(2, appt.getStartHour());
		assertEquals(7, appt.getStartMonth());
		assertEquals("Birthday Party!", appt.getTitle());
		
		
		
		
		
	}
	
	@Test
	public void test05()  throws Throwable  {
		int startHour=0;
		int startMinute=30;
		int startDay=10;
		int startMonth=13;
		int startYear=2017;
		String title=null;
		String description=null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertFalse(appt.getValid());
		assertEquals(0, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(13, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("", appt.getTitle());
		assertEquals("", appt.getDescription());
		assertEquals(null, appt.toString());
		//Change Appointment details
		appt.setStartHour(-2);
		appt.setStartMinute(15);
		appt.setStartDay(8);
		appt.setStartMonth(7);
		appt.setStartYear(2017);
		appt.setTitle("dude");
		appt.setDescription("guy");
		// Second assertions
		assertFalse(appt.getValid());
		assertNotEquals(2, appt.getStartHour());
		assertEquals(15, appt.getStartMinute());
		assertEquals(8, appt.getStartDay());
		assertEquals(7, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("dude", appt.getTitle());
		assertEquals("guy", appt.getDescription());
		assertEquals(null, appt.toString());
	}
	
	
	
	@Test
	public void test06()  throws Throwable {
		int startHour = -13;
		int startMinute = -30;
		int startDay = -10;
		int startMonth = 0;
		int startYear = 0;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		// assertions
		assertFalse(appt.getValid());
		appt.setStartHour(13);
		assertFalse(appt.getValid());
		appt.setStartMinute(30);
		assertFalse(appt.getValid());
		appt.setStartDay(10);
		assertFalse(appt.getValid());
		appt.setStartMonth(4);
		assertTrue(appt.getValid());
		appt.setStartYear(2017);
		assertTrue(appt.getValid());
		appt.setStartHour(-13);
		assertFalse(appt.getValid());
	}
	
	
	
}
