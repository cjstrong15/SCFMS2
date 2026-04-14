package control;

import entity.MaintenanceWindow;
import java.time.LocalDateTime;

public class Maintenance {

    // Creates and returns a new maintenance window
    public MaintenanceWindow scheduleMaintenance(String facilityName, String area,
                                                 String description,
                                                 LocalDateTime startTime,
                                                 LocalDateTime endTime,
                                                 String allowedUsers) {
        return new MaintenanceWindow(
                0,
                facilityName,
                area,
                description,
                startTime,
                endTime,
                allowedUsers
        );
    }

    // Updates the details of an existing maintenance window
    public void updateMaintenanceWindow(MaintenanceWindow window, String newDescription,
                                        LocalDateTime newStartTime, LocalDateTime newEndTime,
                                        String newAllowedUsers) {
        if (window != null) {
            window.setDescription(newDescription);
            window.setStartTime(newStartTime);
            window.setEndTime(newEndTime);
            window.setAllowedUsers(newAllowedUsers);
        }
    }

    // Checks if the current time falls within the maintenance window
    public boolean isMaintenanceActive(MaintenanceWindow window, LocalDateTime currentTime) {
        if (window == null || currentTime == null) {
            return false;
        }

        return !currentTime.isBefore(window.getStartTime())
                && !currentTime.isAfter(window.getEndTime());
    }

    // Applies maintenance restrictions and displays confirmation
    public void enforceMaintenance(MaintenanceWindow window) {
        if (window != null) {
        }
    }
}