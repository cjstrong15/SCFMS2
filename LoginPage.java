package boundary;

import control.Authentication;
import entity.UserAccount;

public class LoginPage {

    // Displays the login prompt to the user
    public void displayLoginScreen() {
        System.out.println("   SCFMS Login   \n");
        System.out.println("Enter username and password.\n");
    }

    // Submits entered login credentials to the Authentication control class
    public boolean submitLogin(Authentication authentication, UserAccount user,
                               String enteredUsername, String enteredPassword) {

        if (authentication == null) {
            System.out.println("Authentication system unavailable.");
            return false;
        }

        boolean success = authentication.login(user, enteredUsername, enteredPassword);

        if (success) {
            System.out.println("\nLogin successful.");
        } else {
            System.out.println("\nError: Incorrect Login Credentials, Try Again.");
            authentication.handleFailedLogin(user);
        }

        return success;
    }
}