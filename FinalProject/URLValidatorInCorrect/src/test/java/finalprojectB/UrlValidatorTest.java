/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package finalprojectB;

import junit.framework.TestCase;

import java.util.regex.Matcher;


/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest() {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   System.out.println(urlVal.isValid("https://www.google.com/search?q=url")); //should allow queries, but fails
	   assertTrue(urlVal.isValid("https://www.google.com/search?q=url"));
	   
	   System.out.println(urlVal.isValid("https://www.google.co.uk")); //valid URL extension, but fails
	   assertTrue(urlVal.isValid("https://www.google.co.uk"));
	   
	   System.out.println(urlVal.isValid("http://www.failedURL.shouldFail"));
	   assertFalse(urlVal.isValid("http://www.failedURL.shouldFail"));
	   
	   System.out.println(urlVal.isValid("dude://www.passingURL.org/shouldPass"));
	   assertTrue(urlVal.isValid("dude://www.passingURL.org/shouldPass"));
	   
	   System.out.println(urlVal.isValid("https://www.google.com:1000")); //valid url authority structure, but fails
	   assertTrue(urlVal.isValid("https://www.google.com:1000"));
	
   }
   
   
   public void testYourFirstPartition() {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   String inputUrl = "http://wzw.url.gov/%C2%A3";
	   
	
	   if (inputUrl instanceof String) {
		   boolean valid = urlVal.isValid(inputUrl);
		   if (valid) {
			   assertTrue(valid);
		   } else {
			   System.out.println("Failed");
			   assertFalse(valid);
		   }
	   } else {
		   System.out.println("the provided URL is not of type String");
		   assertFalse(urlVal.isValid(inputUrl));
	   }
   }
   
   public void testYourSecondPartition(){
   	String inputURL = "http://www.google.com";
   	String inputBadURL = "http://www.goo&gle.com";
   	UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
   	
   	if (urlVal.isValid(inputURL)) {
   		assertTrue(true);
    }
    
    else if (urlVal.isValid(inputBadURL)) {
	    assertFalse(false);
    }
   	
   }
   
   
   public void testIsValid()
   {
   	long options[] = {UrlValidator.ALLOW_ALL_SCHEMES, UrlValidator.ALLOW_2_SLASHES, UrlValidator.NO_FRAGMENTS,
		    UrlValidator.ALLOW_ALL_SCHEMES + UrlValidator.ALLOW_2_SLASHES,
		    UrlValidator.ALLOW_ALL_SCHEMES + UrlValidator.NO_FRAGMENTS, UrlValidator.ALLOW_2_SLASHES + UrlValidator.NO_FRAGMENTS,
		    UrlValidator.ALLOW_ALL_SCHEMES + UrlValidator.ALLOW_2_SLASHES + UrlValidator.NO_FRAGMENTS};
   	String inputUrls[] = {"http://www.google.com", "https:/amazon.com/cool", "dude://www.google.com",
		    "http://www.google.com//path", "http://www.google.com/ok#fragment"};
	   for(int i = 0;i<7;i++)
	   {
		   UrlValidator urlVal = new UrlValidator(null, null, options[i]);
		   for (int j = 0; j < inputUrls.length; j++) {
		   	if (urlVal.isValid(inputUrls[j])) {
		   		System.out.println("SUCCESS: The URL "+inputUrls[j]+" worked with options "+options[i]);
			    assertTrue(true);
		    }
		    else {
			    System.out.println("FAILED: The URL "+inputUrls[j]+" failed with options "+options[i]);
		   		assertFalse(false);
		    }
		   }
		   
	   }
   }
   
   public void testAnyOtherUnitTest()
   {
	   
   }
   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */
   

}
