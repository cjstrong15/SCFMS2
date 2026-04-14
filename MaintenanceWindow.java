package entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MaintenanceWindow {

    private int maintenanceID;
    private String facilityName;
    private String area;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String allowedUsers;

    public MaintenanceWindow() {
    }

    // Creates a maintenance window with all scheduling details
    public MaintenanceWindow(int maintenanceID, String facilityName, String area,
                             String description, LocalDateTime startTime,
                             LocalDateTime endTime, String allowedUsers) {
        this.maintenanceID = maintenanceID;
        this.facilityName = facilityName;
        this.area = area;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.allowedUsers = allowedUsers;
    }

    public int getMaintenanceID() {
        return maintenanceID;
    }

    public void setMaintenanceID(int maintenanceID) {
        this.maintenanceID = maintenanceID;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getAllowedUsers() {
        return allowedUsers;
    }

    public void setAllowedUsers(String allowedUsers) {
        this.allowedUsers = allowedUsers;
    }

    // Returns a formatted summary of the maintenance schedule
    public String getSummary() {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");

    	return description + " | " + facilityName + " | " + area +
    	       " | " + startTime.format(formatter) + " to " + endTime.format(formatter);
    }
}