package boundary;

import entity.MaintenanceWindow;

public class MaintenancePage {

    // Displays available maintenance management options to the user
    public void displayMaintenanceOptions() {
        System.out.println("\nMaintenance Management\n");
        System.out.println("1. Schedule Maintenance Window\n");
        System.out.println("2. Edit Existing Maintenance Window\n");
    }

    // Displays details of the selected maintenance window
    public void showMaintenanceWindow(MaintenanceWindow window) {
        if (window == null) {
            System.out.println("No maintenance window selected.");
            return;
        }

        System.out.println("Maintenance Details:");
        System.out.println(window.getSummary());
    }

    // Confirms that the maintenance window was saved successfully
    public void confirmSave() {
        System.out.println("Maintenance window saved successfully.");
    }

    // Displays an error message related to maintenance operations
    public void showError(String message) {
        System.out.println("Error: " + message);
    }
}