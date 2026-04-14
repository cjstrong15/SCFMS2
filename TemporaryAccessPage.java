package boundary;

public class TemporaryAccessPage {

    // Displays the form for creating a temporary access pass
    public void displayTemporaryAccessForm() {
        System.out.println("\nTemporary Access Pass Form\n");
        System.out.println("Enter guest information, allowed areas, and time window.\n");
    }

    // Confirms that a temporary access pass was created successfully
    public void confirmPassCreated() {
        System.out.println("\nTemporary access pass created successfully.");
    }

    // Confirms that a temporary access pass was updated successfully
    public void confirmPassUpdated() {
        System.out.println("\nTemporary access pass updated successfully.");
    }

    // Displays an error message related to temporary access operations
    public void showError(String message) {
        System.out.println("Error: " + message);
    }
}