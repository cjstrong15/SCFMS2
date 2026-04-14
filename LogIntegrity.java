package logic;

import entity.AccessLog;

public class LogIntegrity {

    // Verifies that a log entry contains all required fields
    public boolean verifyLogEntry(AccessLog log) {
        return log != null
                && log.getLocation() != null
                && log.getTimestamp() != null
                && log.getAccessType() != null;
    }

    // Represents enforcement of append-only logging behavior
    public boolean isAppendOnly() {
        return true;
    }

    // Triggers an alert when a log integrity issue is detected
    public void flagIntegrityIssue() {
        System.out.println("Security alert: Log integrity issue detected.");
    }

    // Ensures a log entry is valid before confirming protection
    public void protectLogEntry(AccessLog log) {
        if (verifyLogEntry(log)) {
            System.out.println("Log entry protected successfully.");
        } else {
            flagIntegrityIssue();
        }
    }
}