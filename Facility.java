package entity;

public class Facility {

    private int facilityID;
    private String facilityName;
    private String buildingName;
    private String location;
    private int numberOfRooms;

    public Facility() {
    }

    // Creates a facility with its main identifying details
    public Facility(int facilityID, String facilityName, String buildingName,
                    String location, int numberOfRooms) {
        this.facilityID = facilityID;
        this.facilityName = facilityName;
        this.buildingName = buildingName;
        this.location = location;
        this.numberOfRooms = numberOfRooms;
    }

    public int getFacilityID() {
        return facilityID;
    }

    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    // Returns a short description of the facility
    public String getSummary() {
        return facilityName + " - " + buildingName + " located at " + location;
    }
}