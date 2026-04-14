package entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SecurityAlert {

    private int alertID;
    private String alertType;
    private String severity;
    private String location;
    private String description;
    private LocalDateTime timestamp;

    public SecurityAlert() {
    }

    // Creates a new security alert with all relevant details
    public SecurityAlert(int alertID, String alertType, String severity,
                         String location, String description,
                         LocalDateTime timestamp) {
        this.alertID = alertID;
        this.alertType = alertType;
        this.severity = severity;
        this.location = location;
        this.description = description;
        this.timestamp = timestamp;
    }

    public int getAlertID() {
        return alertID;
    }

    public void setAlertID(int alertID) {
        this.alertID = alertID;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    // Returns a formatted summary of the alert
    public String getSummary() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");

        return "[" + severity + "] " + alertType + " at " + location +
               " (" + timestamp.format(formatter) + ")";
    }
}