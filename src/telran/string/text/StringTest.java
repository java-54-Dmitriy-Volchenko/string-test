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
			
		}
		 @Test
		    void startsWithTest() {
		        String one = "Boogi-woogi";
		        String prefix = "oo";
		        int toffset = 7;		      
		        assertTrue(one.startsWith(prefix, toffset)); 
		        
		        toffset = 12;
		        assertFalse(one.startsWith(prefix, toffset));
		        
		        toffset = -1;
		        assertFalse(one.startsWith(prefix, toffset));
		        
		        toffset = -1;
		        assertFalse(one.startsWith(prefix, toffset));
		        
		        prefix = "oa";
		        toffset = 7;	
		        
		        assertFalse(one.startsWith(prefix, toffset));
		        
		        prefix = "Bo";
		      	
		        
		        assertTrue(one.startsWith(prefix));
		        
		    }
		 @Test
		    void endsWithTest() {
			 
			    String one = "Boogi-woogi";
		        String prefix = "gi";
		             
		        assertTrue(one.endsWith(prefix)); 
		        prefix = "Boogi-woogi";
		        assertTrue(one.endsWith(prefix)); 
		        prefix = "";
		        assertTrue(one.endsWith(prefix)); 
		        prefix = "ga";
		        assertFalse(one.endsWith(prefix));
		        
		      
}
		 	@Test
		    void equalsIgnoreCaseTest() {
		 		
		 		String one = "HeLlO25";
			    String two = "hElLo25";
			    

			        assertTrue(one.equalsIgnoreCase(two)); 
			        
			        two = "hElLo15";			        
			        assertFalse(one.equalsIgnoreCase(two));
			        
			        one = "hello25";
			        two = "hello25";			        
			        assertTrue(one.equalsIgnoreCase(two)); 
			        
			       
}
			@Test
		    void indexOfTest() {
				  String one = "Boogi-woogi";
			      String prefix = "oo";			       
			      assertTrue(one.indexOf(prefix)==1); 
			      prefix = "i";			       
			      assertTrue(one.indexOf(prefix)==4);
			      
			      prefix = "go";
			      assertTrue(one.indexOf(prefix)==-1);
			      prefix = "z";
			      assertTrue(one.indexOf(prefix)==-1);
			      
				
		 	
}
			@Test
		    void lastIndexOfTest() {
				  String one = "Boogi-woogi";
			      char ch = 'g';
			      int indexOfChar = 9;
			      int result=one.lastIndexOf(ch);
			      assertEquals(indexOfChar, result);      
			     
			      ch = 'o';
			      indexOfChar = 8;
			      result=one.lastIndexOf(ch);
			      assertEquals(indexOfChar, result);  
			      
			      ch = 'z';
			      indexOfChar = -1;
			      result=one.lastIndexOf(ch);
			      assertEquals(indexOfChar, result);  
		 	
}
}
