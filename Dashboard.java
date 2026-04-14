package boundary;

import entity.UserAccount;

public class Dashboard {

    // Loads the dashboard for the logged-in user
    public void loadDashboard(UserAccount user) {
        if (user == null) {
            System.out.println("No user logged in.");
            return;
        }

        System.out.println("\nWelcome " + user.getUsername() + " (" + user.getRole() + ")");
        displayOptions(user);
    }

    // Displays available menu options based on the user's role
    public void displayOptions(UserAccount user) {
        String role = user.getRole();

        if (role == null) {
            System.out.println("No role assigned.");
            return;
        }

        System.out.println("\nAvailable Options:\n");

        if (role.equalsIgnoreCase("Student")) {
            System.out.println("- View Access Logs");
            System.out.println("- View Permissions");
        } else if (role.equalsIgnoreCase("Security")) {
            System.out.println("- View Access Logs");
            System.out.println("- Monitor Activity");
            System.out.println("- Respond to Alerts");
        } else if (role.equalsIgnoreCase("Admin")) {
            System.out.println("- Set Access Policies");
            System.out.println("- Generate Reports");
            System.out.println("- Emergency Override");
        } else {
            System.out.println("- Basic Access");
        }
    }

    // Simulates viewing access logs from the dashboard
    public void viewAccessLogs() {
        System.out.println("Displaying access logs...");
    }

    // Simulates viewing active security alerts
    public void viewAlerts() {
        System.out.println("Displaying security alerts...");
    }

    // Simulates viewing generated reports
    public void viewReports() {
        System.out.println("Displaying reports...");
    }
}