package karabos.poe;

import progPOE1.LoginAndRegistration;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginAndRegistrationTest {

    LoginAndRegistration instance = new LoginAndRegistration();


    @Test
    public void testValidUsername() {
        String username = "kyl_1";
        boolean result = instance.checkUserName(username);
        assertTrue(result);
    }

    @Test
    public void testUsernameTooLong() {
        String username = "kyle!!!!!!!";
        boolean result = instance.checkUserName(username);
        assertFalse(result);
    }

    @Test
    public void testUsernameNoUnderscore() {
        String username = "kyle";
        boolean result = instance.checkUserName(username);
        assertFalse(result);
    }


    @Test
    public void testValidPassword() {
        String password = "Ch&&sec@ke99!!";
        boolean result = instance.checkPasswordComplexity(password);
        assertTrue(result);
    }

    @Test
    public void testPasswordNoCapital() {
        String password = "password";
        boolean result = instance.checkPasswordComplexity(password);
        assertFalse(result);
    }

    @Test
    public void testPasswordTooShort() {
        String password = "Pass@1";
        boolean result = instance.checkPasswordComplexity(password);
        assertFalse(result);
    }

    @Test
    public void testPasswordNoSpecialCharacter() {
        String password = "Password123";
        boolean result = instance.checkPasswordComplexity(password);
        assertFalse(result);
    }


    @Test
    public void testValidPhoneNumber() {
        String phone = "+27838968976";
        boolean result = instance.checkCellPhoneNumber(phone);
        assertTrue(result);
        
    }

    
}
    

    
