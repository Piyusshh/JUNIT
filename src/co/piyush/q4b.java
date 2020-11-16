package co.piyush;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class q4b {
	@Test
    public void testUsernameIsNull() {
         
        assertThrows(IllegalArgumentException.class, new Executable() {
             
            @Override
            public void execute() throws Throwable {
                q4a user = new q4a();
                user.setName(null);
            }
        });
    }
	
	@Test
	public void testUsernameIsNullb() {
	 
	    assertThrows(IllegalArgumentException.class, () -> {
	        q4a user = new q4a();
	        user.setName(null);
	    });
	}
	
	@Test
	public void testUsernameIsNullc() {
	 
	    Throwable exception = assertThrows(
	            IllegalArgumentException.class, () -> {
	                q4a user = new q4a();
	                user.setName(null);
	            }
	    );
	 
	    assertEquals("Username cannot be blank", exception.getMessage());
	}
	
	@Test
	public void testUsernameTooShort() {
	    Throwable exception = assertThrows(
	            IllegalArgumentException.class, () -> {
	                q4a user = new q4a();
	                user.setName("Jo");
	            }
	    );
	 
	    assertEquals("Username is too short", exception.getMessage());     
	}
	
	@Test
	public void testUsernameTooLong() {
	    Throwable exception = assertThrows(
	            IllegalArgumentException.class, () -> {
	                q4a user = new q4a();
	                user.setName("Pablo Diego Jose Franciso Picasso");
	            }
	    );
	 
	    assertEquals("Username is too long", exception.getMessage());      
	}
}
