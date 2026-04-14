package logic;

public class AlertThreshold {

    private int failedAttemptThreshold;
    private int unusualHourStart;
    private int unusualHourEnd;

    // Initializes default threshold values for alerts
    public AlertThreshold() {
        this.failedAttemptThreshold = 3;
        this.unusualHourStart = 6;
        this.unusualHourEnd = 22;
    }

    // Creates a custom alert threshold configuration
    public AlertThreshold(int failedAttemptThreshold, int unusualHourStart, int unusualHourEnd) {
        this.failedAttemptThreshold = failedAttemptThreshold;
        this.unusualHourStart = unusualHourStart;
        this.unusualHourEnd = unusualHourEnd;
    }

    public int getFailedAttemptThreshold() {
        return failedAttemptThreshold;
    }

    public void setFailedAttemptThreshold(int failedAttemptThreshold) {
        this.failedAttemptThreshold = failedAttemptThreshold;
    }

    public int getUnusualHourStart() {
        return unusualHourStart;
    }

    public void setUnusualHourStart(int unusualHourStart) {
        this.unusualHourStart = unusualHourStart;
    }

    public int getUnusualHourEnd() {
        return unusualHourEnd;
    }

    public void setUnusualHourEnd(int unusualHourEnd) {
        this.unusualHourEnd = unusualHourEnd;
    }

    // Checks if the number of failed attempts exceeds the defined threshold
    public boolean isFailedAttemptExceeded(int failedAttempts) {
        return failedAttempts >= failedAttemptThreshold;
    }

    // Determines if the given hour falls outside allowed access times
    public boolean isOutsideAllowedHours(int hour) {
        return hour < unusualHourStart || hour > unusualHourEnd;
    }
}