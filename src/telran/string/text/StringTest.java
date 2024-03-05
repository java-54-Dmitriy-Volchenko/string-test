package telran.string.text;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	@DisplayName("test of the method concat")
	void concatTest() {
		String hello = "Hello";		
		assertEquals("Hello World", hello.concat(" World"));
	}
	@Test

	void containsTest() {
		String hello ="Hello";
		assertTrue(hello.contains("ell"));
		assertFalse(hello.contains("elo"));
	}
	@Test	
	   void compareToTest() {
	       
	        String one = "Hello";
	        String two = "Hello";
	        	       
	        assertTrue(one.compareTo(two) == 0);
	        assertFalse(one.compareTo(two) != 0);
	        
	        one = "Hello";
	        two = "Hallo";
	        
	        assertTrue(one.compareTo(two) > 0);
	        assertFalse(one.compareTo(two) <= 0);
	        
	        one = "Hello ";
	        two = "Hello";
	        
	        assertTrue(one.compareTo(two) > 0);
	        assertFalse(one.compareTo(two) <= 0);
	        
	        
	        one = "";
	        two = "1";

	        assertTrue(one.compareTo(two) < 0); 
	        assertFalse(one.compareTo(two) >= 0);
	        
	        one = "Hello";
	        two = "hello";

	        assertTrue(one.compareTo(two) < 0); 
	        assertFalse(one.compareTo(two) >= 0);
	    }
	

		@Test
		void compareToIgnoreCaseTest() {
			  String one = "Hello";
		      String two = "hello";

		        assertTrue(one.compareToIgnoreCase(two) == 0); 
		        assertFalse(one.compareToIgnoreCase(two) != 0);
		        
		        one = "Привет";
		        two = "привет";
		        
		        assertTrue(one.compareToIgnoreCase(two) == 0); 
		        assertFalse(one.compareToIgnoreCase(two) != 0);
			
		}}
