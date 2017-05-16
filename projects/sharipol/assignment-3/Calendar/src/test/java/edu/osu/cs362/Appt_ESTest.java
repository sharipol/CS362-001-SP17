/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 03:36:51 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.osu.cs362.Appt;


public class Appt_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(4, 4, 4, 4, 4, (String) null, (String) null);
      String string0 = appt0.toString();
      assertNotNull(string0);
      assertEquals("\t4/4/4 at 4:4am ,, \n", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt0 = new Appt(15, 31, 15, 15, 0, "InvalidFractional", "InvalidFractional");
      assertEquals(15, appt0.getStartDay());
      
      appt0.setStartDay(31);
      assertEquals("InvalidFractional", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Appt appt0 = new Appt(12, 59, 59, 1124, 1306, "2pA>j_z2R9", "2pA>j_z2R9");
      assertEquals(59, appt0.getStartDay());
      assertEquals("2pA>j_z2R9", appt0.getDescription());
      assertEquals(59, appt0.getStartMinute());
      assertEquals("2pA>j_z2R9", appt0.getTitle());
      assertEquals(1124, appt0.getStartMonth());
      assertEquals(1306, appt0.getStartYear());
      assertEquals(12, appt0.getStartHour());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Appt appt0 = new Appt(23, 650, 23, 23, 650, "g<RRhBbnP\"", "g<RRhBbnP\"");
      assertEquals(650, appt0.getStartMinute());
      assertEquals(650, appt0.getStartYear());
      assertEquals(23, appt0.getStartMonth());
      assertEquals(23, appt0.getStartHour());
      assertEquals("g<RRhBbnP\"", appt0.getTitle());
      assertEquals("g<RRhBbnP\"", appt0.getDescription());
      assertFalse(appt0.getValid());
      assertEquals(23, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, 12, 12, (String) null, (String) null);
      boolean boolean0 = appt0.getValid();
      assertEquals(12, appt0.getStartDay());
      assertTrue(boolean0);
      assertEquals(12, appt0.getStartMinute());
      assertEquals(12, appt0.getStartMonth());
      assertEquals(12, appt0.getStartHour());
      assertEquals(12, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Appt appt0 = new Appt((-1572), (-854), (-1572), (-854), (-1572), "*BDCJz<", "*BDCJz<");
      String string0 = appt0.getTitle();
      assertEquals("*BDCJz<", string0);
      assertFalse(appt0.getValid());
      assertEquals(-1572, appt0.getStartDay());
      assertEquals(-854, appt0.getStartMinute());
      assertEquals(-854, appt0.getStartMonth());
      assertEquals(-1572, appt0.getStartHour());
      assertEquals("*BDCJz<", appt0.getDescription());
      assertEquals(-1572, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appt appt0 = new Appt((-553), (-553), 0, 109, 0, "z`F\b*Yk:l$", "z`F\b*Yk:l$");
      int int0 = appt0.getStartYear();
      assertEquals(0, int0);
      assertEquals(-553, appt0.getStartHour());
      assertEquals(0, appt0.getStartDay());
      assertEquals(-553, appt0.getStartMinute());
      assertEquals("z`F\b*Yk:l$", appt0.getDescription());
      assertEquals("z`F\b*Yk:l$", appt0.getTitle());
      assertEquals(109, appt0.getStartMonth());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, (-492), 0, 77, "", "");
      int int0 = appt0.getStartYear();
      assertFalse(appt0.getValid());
      assertEquals(77, int0);
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(-492, appt0.getStartDay());
      assertEquals(0, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Appt appt0 = new Appt(0, 1494, 0, 0, 0, (String) null, ">&^^N<b.+0y");
      int int0 = appt0.getStartMonth();
      assertEquals(">&^^N<b.+0y", appt0.getDescription());
      assertEquals(0, int0);
      assertEquals(1494, appt0.getStartMinute());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertEquals("", appt0.getTitle());
      assertEquals(0, appt0.getStartDay());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Appt appt0 = new Appt(1113, 0, 1113, (-1225), 1113, "Month", "Month");
      int int0 = appt0.getStartMonth();
      assertFalse(appt0.getValid());
      assertEquals(1113, appt0.getStartHour());
      assertEquals(1113, appt0.getStartYear());
      assertEquals("Month", appt0.getTitle());
      assertEquals("Month", appt0.getDescription());
      assertEquals(1113, appt0.getStartDay());
      assertEquals(0, appt0.getStartMinute());
      assertEquals((-1225), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, (-882), (-882), 11, "\t", "\t");
      int int0 = appt0.getStartMinute();
      assertEquals("\t", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(-882, appt0.getStartMonth());
      assertEquals("\t", appt0.getDescription());
      assertEquals(-882, appt0.getStartDay());
      assertEquals(11, appt0.getStartHour());
      assertEquals(11, int0);
      assertEquals(11, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Appt appt0 = new Appt(1, 999, 1, 1, 999, "^jq^cDos", "V{JV#8Yz)nH[X[");
      int int0 = appt0.getStartHour();
      assertEquals(1, appt0.getStartMonth());
      assertEquals(1, appt0.getStartDay());
      assertEquals("V{JV#8Yz)nH[X[", appt0.getDescription());
      assertEquals(1, int0);
      assertEquals(999, appt0.getStartYear());
      assertEquals(999, appt0.getStartMinute());
      assertEquals("^jq^cDos", appt0.getTitle());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "", "");
      int int0 = appt0.getStartDay();
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, int0);
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, (-1891), 59, (-1731), "", "");
      int int0 = appt0.getStartDay();
      assertEquals((-1891), int0);
      assertEquals(59, appt0.getStartMonth());
      assertEquals(-1731, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Appt appt0 = new Appt(15, 31, 15, 15, 0, "InvalidFractional", "InvalidFractional");
      appt0.getDescription();
      assertEquals("InvalidFractional", appt0.getTitle());
      assertEquals(15, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(31, appt0.getStartMinute());
      assertEquals(15, appt0.getStartMonth());
      assertEquals(0, appt0.getStartYear());
      assertEquals(15, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Appt appt0 = new Appt((-1572), (-854), (-1572), (-854), (-1572), "*BDCJz<", "*BDCJz<");
      appt0.setDescription("*BDCJz<");
      assertEquals("*BDCJz<", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals("*BDCJz<", appt0.getDescription());
      assertEquals(-1572, appt0.getStartDay());
      assertEquals(-854, appt0.getStartMinute());
      assertEquals(-854, appt0.getStartMonth());
      assertEquals(-1572, appt0.getStartYear());
      assertEquals(-1572, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, 12, 12, (String) null, (String) null);
      appt0.setDescription((String) null);
      assertTrue(appt0.getValid());
      assertEquals(12, appt0.getStartYear());
      assertEquals(12, appt0.getStartMinute());
      assertEquals(12, appt0.getStartMonth());
      assertEquals(12, appt0.getStartDay());
      assertEquals(12, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, 12, 12, (String) null, (String) null);
      appt0.setTitle("peAk");
      assertEquals("peAk", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, (-297), 0, 0, "yw#@gTB", "yw#@gTB");
      assertEquals("yw#@gTB", appt0.getTitle());
      
      appt0.setTitle((String) null);
      assertEquals(0, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, 12, 12, (String) null, (String) null);
      String string0 = appt0.toString();
      assertNotNull(string0);
      assertEquals("\t12/12/12 at 12:12pm ,, \n", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Appt appt0 = new Appt((-3701), (-3701), (-3701), (-3701), (-3701), "`0Vnyq", "`0Vnyq");
      String string0 = appt0.toString();
      assertEquals(-3701, appt0.getStartMonth());
      assertEquals(-3701, appt0.getStartMinute());
      assertEquals(-3701, appt0.getStartYear());
      assertEquals(-3701, appt0.getStartDay());
      assertEquals("`0Vnyq", appt0.getDescription());
      assertEquals(-3701, appt0.getStartHour());
      assertEquals("`0Vnyq", appt0.getTitle());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, "[~4M%,h", "[~4M%,h");
      String string0 = appt0.toString();
      assertNotNull(string0);
      assertEquals("\t11/11/11 at 11:11am ,[~4M%,h, [~4M%,h\n", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, (-1), (-1), (String) null, (String) null);
      int int0 = appt0.getStartMinute();
      assertEquals(0, appt0.getStartHour());
      assertEquals(-1, appt0.getStartMonth());
      assertEquals(0, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(0, int0);
      assertEquals(-1, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Appt appt0 = new Appt(13, 646, 13, 13, 646, "?g(", "?g(");
      assertEquals(646, appt0.getStartMinute());
      
      appt0.setStartMinute(13);
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Appt appt0 = new Appt(0, 1494, 0, 0, 0, (String) null, ">&^^N<b.+0y");
      int int0 = appt0.getStartHour();
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartDay());
      assertEquals("", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(">&^^N<b.+0y", appt0.getDescription());
      assertEquals(1494, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, "[~4M%,h", "[~4M%,h");
      appt0.setStartMinute((-56));
      assertEquals(-56, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Appt appt0 = new Appt(61, 61, 61, 61, 61, "", "");
      appt0.getTitle();
      assertEquals(61, appt0.getStartDay());
      assertEquals(61, appt0.getStartMinute());
      assertEquals(61, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(61, appt0.getStartYear());
      assertEquals(61, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Appt appt0 = new Appt(616, 1691, (-3578), 616, (-3578), "Day", "Day");
      int int0 = appt0.getStartYear();
      assertEquals(616, appt0.getStartHour());
      assertEquals((-3578), int0);
      assertEquals(616, appt0.getStartMonth());
      assertEquals("Day", appt0.getDescription());
      assertEquals("Day", appt0.getTitle());
      assertEquals(1691, appt0.getStartMinute());
      assertEquals(-3578, appt0.getStartDay());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Appt appt0 = new Appt(18, 18, 18, (-16), (-16), "{b", "{b");
      int int0 = appt0.getStartDay();
      assertEquals(18, appt0.getStartMinute());
      assertEquals(18, int0);
      assertEquals("{b", appt0.getTitle());
      assertEquals(-16, appt0.getStartMonth());
      assertEquals(18, appt0.getStartHour());
      assertEquals(-16, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals("{b", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Appt appt0 = new Appt((-1), 3765, (-1833), (-6), (-6), "", "");
      int int0 = appt0.getStartHour();
      assertEquals(-6, appt0.getStartMonth());
      assertEquals(-6, appt0.getStartYear());
      assertEquals(3765, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals((-1), int0);
      assertEquals(-1833, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Appt appt0 = new Appt(1080, 1080, 1080, 1080, 1080, "", "");
      appt0.getDescription();
      assertEquals(1080, appt0.getStartDay());
      assertEquals(1080, appt0.getStartMonth());
      assertEquals(1080, appt0.getStartMinute());
      assertEquals(1080, appt0.getStartYear());
      assertEquals(1080, appt0.getStartHour());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Appt appt0 = new Appt(24, 1, 24, 1, 400, "", "Timezone");
      int int0 = appt0.getStartMonth();
      assertEquals(400, appt0.getStartYear());
      assertEquals("Timezone", appt0.getDescription());
      assertEquals(24, appt0.getStartHour());
      assertEquals(24, appt0.getStartDay());
      assertEquals("", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(1, appt0.getStartMinute());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Appt appt0 = new Appt((-1572), (-854), (-1572), (-854), (-1572), "*BDCJz<", "*BDCJz<");
      appt0.setStartYear((-1572));
      assertEquals(-1572, appt0.getStartDay());
      assertEquals(-854, appt0.getStartMinute());
      assertEquals("*BDCJz<", appt0.getDescription());
      assertEquals("*BDCJz<", appt0.getTitle());
      assertEquals(-1572, appt0.getStartHour());
      assertEquals(-1572, appt0.getStartYear());
      assertEquals(-854, appt0.getStartMonth());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Appt appt0 = new Appt((-3701), (-3701), (-3701), (-3701), (-3701), "`0Vnyq", "`0Vnyq");
      appt0.setStartHour((-3701));
      assertEquals(-3701, appt0.getStartMonth());
      assertEquals(-3701, appt0.getStartMinute());
      assertEquals("`0Vnyq", appt0.getDescription());
      assertEquals(-3701, appt0.getStartHour());
      assertEquals(-3701, appt0.getStartYear());
      assertEquals("`0Vnyq", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(-3701, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Appt appt0 = new Appt((-1572), (-854), (-1572), (-854), (-1572), "*BDCJz<", "*BDCJz<");
      boolean boolean0 = appt0.getValid();
      assertEquals("*BDCJz<", appt0.getTitle());
      assertEquals(-1572, appt0.getStartYear());
      assertEquals(-854, appt0.getStartMonth());
      assertEquals(-1572, appt0.getStartHour());
      assertFalse(boolean0);
      assertEquals(-854, appt0.getStartMinute());
      assertEquals(-1572, appt0.getStartDay());
      assertEquals("*BDCJz<", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, "[~4M%,h", "[~4M%,h");
      appt0.setStartMonth((-56));
      assertEquals(-56, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Appt appt0 = new Appt((-3701), (-3701), (-3701), (-3701), (-3701), "`0Vnyq", "`0Vnyq");
      int int0 = appt0.getStartMinute();
      assertEquals((-3701), int0);
      assertEquals(-3701, appt0.getStartMonth());
      assertEquals(-3701, appt0.getStartHour());
      assertEquals(-3701, appt0.getStartYear());
      assertEquals("`0Vnyq", appt0.getDescription());
      assertEquals("`0Vnyq", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(-3701, appt0.getStartDay());
  }
}