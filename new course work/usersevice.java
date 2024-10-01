package services;

import database.DatabaseConnection;
import models.User;

import java.sql.*;

public class UserService {

    // Add a new user
    public void addUser(User user) {
        String sql = "INSERT INTO User (username, password, role, contactInfo) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getRole());
            stmt.setString(4, user.getContactInfo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

