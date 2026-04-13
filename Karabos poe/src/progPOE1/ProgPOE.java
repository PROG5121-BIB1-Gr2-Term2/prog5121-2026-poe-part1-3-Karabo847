package progPOE1;
import java.util.Scanner;
/**
 *
 * @author cash
 */
public class ProgPOE 
{

    public static void main(String[] args) 
    {
        //imported a scanner, to read what ever the user inputs
        Scanner scan = new Scanner(System.in);
        //calling our subclass
        LoginAndRegistration validate = new LoginAndRegistration();
        
        String name;
        String surname;
        
        String username;
        String password;
        
        int phonenumber;
        
        String loginUsername;
        String loginPassword;
        
        System.out.println("REGISTER");
               
        System.out.print("Enter your name : ");
        name = scan.next();
        
        System.out.print("Enter your surname : ");
        surname = scan.next();
        
        System.out.print("Create Username : ");
        username = scan.next();        
        while(validate.checkUserName(username) == false)
        {
            System.out.println("");
            System.out.print("Create Username : ");
            username = scan.next();
        }
        System.out.println("");
        System.out.print("Create Password: ");
        password = scan.next();
        while (validate.checkPasswordComplexity(password)==false)
        {
            System.out.print("Create Password : ");
            password = scan.next();
        }

        System.out.print("Enter Phone Number (+27): ");
        phonenumber = scan.nextInt();
        
        System.out.println("");
        System.out.println("LOGIN");
        System.out.println("");
        
        System.out.print("Login Username: ");
        loginUsername = scan.next();
        
        System.out.print("Login Password: ");
        loginPassword = scan.next();
        
        // Register user and check result
        String regMessage = validate.registerUser(username, password);
        System.out.println(regMessage);
        
        while(loginUsername.equals(username) == false || loginPassword.equals(password) == false) 
        {
            System.out.println("Login failed");     
            System.out.println("Incorrect credentials. Please try again."); 
            
            System.out.println("");
            System.out.print("Login Username: ");
            loginUsername = scan.next();
            
            System.out.print("Login Password: ");
            loginPassword = scan.next();
        } 
        
        System.out.println("Welcome " + name + " " + surname + "!");
        
    }
    
}
