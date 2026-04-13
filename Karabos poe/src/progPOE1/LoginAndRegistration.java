package progPOE1;

public class LoginAndRegistration 
{
     String storedUsername;
     String storedPassword;

    public boolean checkUserName(String username) 
    {
        if(username.length() < 6 && username.contains("_")) 
        {
            System.out.println("Username is valid.");
            return true;
        }
        System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length");
        return false;
    }
    
    public boolean checkPasswordComplexity(String password) 
    { 
        if (password.length() >= 8 && password.matches(".*[A-Z].*") &&password.matches(".*[0-9].*") && password.matches(".*[!@#$%^&*()-+=].*")) 
        {
            System.out.println("Password successfully captured");
            return true;
        }
        System.out.println("password is not correctly formatted; please ensure that the password contains at last eight characters, a capital letter, a number, and a special character.");
        return false;
    }

    public boolean checkCellPhoneNumber(String phonenumber) 
    { 
        if (phonenumber.matches(".*[0-9].*") ) 
        {
            System.out.println("Cell phone number successfully added.");
            return true;
        }
        System.out.println("Cell phone number incorrectly formatted or does not contaun international code");
        return false;
    }
     public String registerUser(String username, String password) 
    {
        boolean isUsernameValid = checkUserName(username);
        boolean isPasswordValid = checkPasswordComplexity(password);

        if (!isUsernameValid) 
        {
            return "Username is incorrectly formatted.";
        } 
        else if (!isPasswordValid) 
        {
            return "Password does not meet complexity requirements.";
        } 
        else 
        {
            storedUsername = username;
            storedPassword = password;
            return "User registered successfully.";
        }
    }

    public boolean loginUser(String username, String password) 
    {
        return username.equals(storedUsername) && password.equals(storedPassword);
    }

    public String returnLoginStatus(boolean loginSuccess) 
    {
        if (loginSuccess) 
        {
            return "Login successful!";
        } 
        else 
        {
            return "Login failed. Incorrect username or password.";
        }
    }
 
}
