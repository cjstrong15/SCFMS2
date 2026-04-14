package logic;

public class RoleAuthorization {

    // Checks if a user role has the required permission
    public boolean checkUserPermissions(String role, String requiredPermission) {
        if (role == null || requiredPermission == null) {
            return false;
        }

        if (role.equalsIgnoreCase("Admin")) {
            return true;
        }

        if (role.equalsIgnoreCase("Security") && requiredPermission.equalsIgnoreCase("MONITOR")) {
            return true;
        }

        if (role.equalsIgnoreCase("Student") && requiredPermission.equalsIgnoreCase("VIEW_LOGS")) {
            return true;
        }

        return false;
    }

    // Assigns default permissions based on the user's role
    public String assignDefaultPermissions(String role) {
        if (role == null) {
            return "No permissions assigned";
        }

        if (role.equalsIgnoreCase("Admin")) {
            return "FULL_ACCESS";
        }
        else if (role.equalsIgnoreCase("Security")) {
            return "MONITOR, VIEW_LOGS, RESPOND_ALERTS";
        }
        else if (role.equalsIgnoreCase("Student")) {
            return "VIEW_LOGS, VIEW_PERMISSIONS";
        }

        return "BASIC_ACCESS";
    }

    // Retrieves and displays policies associated with a role
    public void retrieveRolePolicies(String role) {
        System.out.println("Retrieving policies for role: " + role);
    }
}