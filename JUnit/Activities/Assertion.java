package Examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class Assertion {
	
	@Test
	void firstNameStartsWithJ() {
		 Person person = new Person("John", "Doe");  
	    // Assertion
	    assertTrue(person.getFirstName().startsWith("J")); //Pass
	    assertFalse(person.getFirstName().startsWith("J")); // Fail
	}

}
