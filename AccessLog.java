package entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AccessLog {

    private int logID;
    private int userID;
    private String location;
    private LocalDateTime timestamp;
    private String accessType; // ENTRY or EXIT
    private boolean accessGranted;
    private String reason;
    private String username;

    public AccessLog() {
    }

    // Creates a new access log entry with all relevant details
	    public AccessLog(int logID, int userID, String username, String location,
	            LocalDateTime timestamp, String accessType,
	            boolean accessGranted, String reason) {
	
	this.logID = logID;
	this.userID = userID;
	this.username = username;
	this.location = location;
	this.timestamp = timestamp;
	this.accessType = accessType;
	this.accessGranted = accessGranted;
	this.reason = reason;
	}

    public int getLogID() {
        return logID;
    }

    public void setLogID(int logID) {
        this.logID = logID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public boolean isAccessGranted() {
        return accessGranted;
    }

    public void setAccessGranted(boolean accessGranted) {
        this.accessGranted = accessGranted;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    // Returns a formatted summary of the access attempt
    public String getSummary() {
    	
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");

        return "Log Recorded: " + "" + username + " attempted " + accessType +
               " at " + location + " on " + timestamp.format(formatter) +
               " > " + (accessGranted ? "GRANTED" : "DENIED");
    }
}