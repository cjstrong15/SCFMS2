package control;

import entity.UserAccount;

public class Authentication {

    // Validates that username and password inputs are not null or empty
    public boolean validateCredentials(String username, String password) {
        return username != null && password != null
                && !username.isEmpty() && !password.isEmpty();
    }

    // Verifies login credentials against the stored user account
    public boolean login(UserAccount user, String enteredUsername, String enteredPassword) {
        if (user == null) {
            return false;
        }

        if (user.getUsername().equals(enteredUsername)
                && user.getPassword().equals(enteredPassword)) {
            return true;
        }

        return false;
    }

    // Displays the user's role (used for determining access level)
    public void classifyUserAccess(UserAccount user) {
        if (user != null) {
            System.out.println("User role: " + user.getRole());
        }
    }

    // Handles actions related to failed login attempts
    public void handleFailedLogin(UserAccount user) {
        System.out.println("Failed login attempt recorded.");
    }
}