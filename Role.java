package entity;

public class Role {

    private int roleID;
    private String roleName;
    private String description;
    private String permissions;

    public Role() {
    }

    // Creates a role with its associated permissions and description
    public Role(int roleID, String roleName, String description, String permissions) {
        this.roleID = roleID;
        this.roleName = roleName;
        this.description = description;
        this.permissions = permissions;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    // Checks if the role contains a specific permission
    public boolean hasPermission(String permission) {
        if (permissions == null) return false;
        return permissions.contains(permission);
    }
}