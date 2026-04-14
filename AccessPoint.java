package boundary;

import control.Access;
import entity.AccessLog;

public class AccessPoint {

    // Simulates scanning a user's credential at the access point
    public void scanCredential() {
        System.out.println("\nScanning credentials...\n");
    }

    // Sends an entry request to the Access control class
    public AccessLog requestEntry(Access access, int userID, String username, String role, String location) {
        System.out.println("Requesting entry at " + location + "\n");
        return access.processEntry(userID, username, role, location);
    }

    // Sends an exit request to the Access control class
    public AccessLog requestExit(Access access, int userID, String username, String role, String location) {
        System.out.println("Requesting exit at " + location + "\n");
        return access.processExit(userID, username, role, location);
    }

    // Displays the result of the access attempt to the user
    public void displayAccessResult(AccessLog log) {
        if (log != null) {
            System.out.println(log.getSummary());
        }
    }
}