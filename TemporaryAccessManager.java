package control;

import java.time.LocalDateTime;

public class TemporaryAccessManager {

    // Creates a temporary access pass after validating input data
    public boolean createTemporaryPass(String guestName, String organization,
                                       String contactInfo, String allowedAreas,
                                       LocalDateTime startTime, LocalDateTime endTime) {

        if (guestName == null || guestName.isEmpty()) {
            return false;
        }

        if (allowedAreas == null || allowedAreas.isEmpty()) {
            return false;
        }

        if (startTime == null || endTime == null || endTime.isBefore(startTime)) {
            return false;
        }

        return true;
    }

    // Validates whether a temporary pass is still active
    public boolean validateTemporaryPass(String passID, LocalDateTime currentTime,
                                         LocalDateTime expirationTime) {

        if (passID == null || passID.isEmpty()) {
            return false;
        }

        if (currentTime == null || expirationTime == null) {
            return false;
        }

        return !currentTime.isAfter(expirationTime);
    }

    // Marks a temporary pass as expired
    public void expireTemporaryPass(String passID) {
        System.out.println("Temporary pass expired: " + passID);
    }

    // Updates an existing temporary pass with new information
    public void updateTemporaryPass(String passID, String updatedAreas,
                                    LocalDateTime newEndTime) {
        System.out.println("Temporary pass updated: " + passID);
    }
}