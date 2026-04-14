package logic;

public class IntrusionDetection {

    // Detects if failed login attempts exceed the allowed threshold
    public boolean detectRepeatedFailedAttempts(int failedAttempts) {
        return failedAttempts >= 3;
    }

    // Detects unauthorized access to restricted locations based on role
    public boolean detectUnauthorizedLocation(String role, String location) {
        if (role == null || location == null) {
            return false;
        }

        return role.equalsIgnoreCase("Student") && location.equalsIgnoreCase("Admin Office");
    }

    // Detects access attempts outside normal operating hours
    public boolean detectUnusualAccessTime(int hour) {
        return hour < 6 || hour > 22;
    }

    // Triggers an alert when suspicious activity is detected
    public void triggerIntrusionAlert(String reason) {
        System.out.println("Intrusion alert triggered: " + reason);
    }
}