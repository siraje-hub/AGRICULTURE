
public class User {
    private int userID;
    private String username;
    private String password;
    private String role; // admin, seller, buyer
    private String contactInfo;

    public User(int userID, String username, String password, String role, String contactInfo) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.role = role;
        this.contactInfo = contactInfo;
    }

    // Getters and setters
    public int getUserID() { return userID; }
    public void setUserID(int userID) { this.userID = userID; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }
}
