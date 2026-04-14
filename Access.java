package control;

import entity.AccessLog;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Access {

    private ArrayList<AccessLog> accessLogs;

    // Initializes the access log storage
    public Access() {
        accessLogs = new ArrayList<>();
    }

    // Checks if a user's role allows access to a specific location
    public boolean verifyRolePermissions(String role, String location) {
        return true; 
    }

    // Applies additional policies such as time-based restrictions
    public boolean enforceAccessPolicy(String role, String location, LocalDateTime time) {
        return true; 
    }

    // Processes a user entry request and creates a corresponding log
    public AccessLog processEntry(int userID, String username, String role, String location) {
        boolean allowed = verifyRolePermissions(role, location);
        String reason = allowed ? "Access Granted" : "Access Denied";

        AccessLog log = new AccessLog(
                accessLogs.size() + 1,
                userID,
                username,
                location,
                LocalDateTime.now(),
                "ENTRY",
                allowed,
                reason
        );

        logAccessEvent(log);
        return log;
    }

    // Processes a user exit request and creates a corresponding log
    public AccessLog processExit(int userID, String username, String role, String location) {
        boolean allowed = verifyRolePermissions(role, location);
        String reason = allowed ? "Exit Granted" : "Exit Denied";

        AccessLog log = new AccessLog(
                accessLogs.size() + 1,
                userID,
                username,
                location,
                LocalDateTime.now(),
                "EXIT",
                allowed,
                reason
        );

        logAccessEvent(log);
        return log;
    }

    // Stores the access log and displays confirmation
    public void logAccessEvent(AccessLog log) {
        accessLogs.add(log);
       
    }

    // Returns all stored access logs
    public ArrayList<AccessLog> getAccessLogs() {
        return accessLogs;
    }

    // Displays all recorded access logs
    public void displayAllLogs() {
        if (accessLogs.isEmpty()) {
            System.out.println("No access logs recorded.");
            return;
        }

        System.out.println("\nAll Access Logs\n");
        for (AccessLog log : accessLogs) {
            System.out.println(log.getSummary());
        }
    }
}