package entity;

import java.time.LocalDateTime;

public class AuditLog {

    private int auditID;
    private String action;
    private String performedBy;
    private String details;
    private LocalDateTime timestamp;

    public AuditLog() {
    }

    // Creates a new audit log entry for tracking system actions
    public AuditLog(int auditID, String action, String performedBy, String details, LocalDateTime timestamp) {
        this.auditID = auditID;
        this.action = action;
        this.performedBy = performedBy;
        this.details = details;
        this.timestamp = timestamp;
    }

    public int getAuditID() {
        return auditID;
    }

    public void setAuditID(int auditID) {
        this.auditID = auditID;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getPerformedBy() {
        return performedBy;
    }

    public void setPerformedBy(String performedBy) {
        this.performedBy = performedBy;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    // Returns a formatted summary of the audit event
    public String getSummary() {
        return "[" + timestamp + "] " + performedBy +
               " performed action: " + action +
               " | Details: " + details;
    }
}