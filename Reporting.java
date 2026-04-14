package control;

import entity.AccessLog;
import entity.SecurityAlert;
import java.util.ArrayList;

public class Reporting {

    // Generates and displays a report of all access logs
    public void generateAccessReport(ArrayList<AccessLog> accessLogs) {
        System.out.println("\nAccess Report\n");

        if (accessLogs == null || accessLogs.isEmpty()) {
            System.out.println("No access logs available.");
            return;
        }

        for (AccessLog log : accessLogs) {
            System.out.println(log.getSummary());
        }
    }

    // Generates and displays a report of all security alerts
    public void generateSecurityReport(ArrayList<SecurityAlert> alerts) {
        System.out.println("   Security Report   ");

        if (alerts == null || alerts.isEmpty()) {
            System.out.println("No security alerts available.");
            return;
        }

        for (SecurityAlert alert : alerts) {
            System.out.println(alert.getSummary());
        }
    }

    // Displays basic statistics for a given facility
    public void viewFacilityStatistics(String facilityName) {
        System.out.println("Displaying statistics for facility: " + facilityName);
    }

    // Simulates exporting a report
    public void exportReport(String reportType) {
        System.out.println(reportType + " report exported successfully.");
    }
}