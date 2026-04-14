package control;

import entity.SecurityAlert;
import java.time.LocalDateTime;

public class SecurityMonitoring {

    // Detects suspicious activity and creates a corresponding security alert
    public SecurityAlert detectSuspiciousActivity(String alertType, String location, String description) {
        return new SecurityAlert(
                0,
                alertType,
                "HIGH",
                location,
                description,
                LocalDateTime.now()
        );
    }

    // Sends or displays the generated security alert
    public void sendAlert(SecurityAlert alert) {
        if (alert != null) {
            System.out.println("\nALERT SENT: " + alert.getSummary());
        }
    }

    // Simulates continuous monitoring of system activity
    public void monitorActivity() {
        System.out.println("Monitoring live access activity...");
    }

    // Records or responds to a detected security incident
    public void respondToIncident(String responseDetails) {
        System.out.println("Incident response recorded: " + responseDetails);
    }
}