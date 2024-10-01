import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

Import database.DatabaseConnection;
Import models.Product;

Import java.sql.*;
Import java.util.ArrayList;
Import java.util.List;

Public class ProductService {

    // Add a new product
    Public void addProduct(Product product) {
        String sql = “INSERT INTO Product (name, category, price, quantity) VALUES (?, ?, ?, ?)”;
        Try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            Stmt.setString(1, product.getName());
            Stmt.setString(2, product.getCategory());
            Stmt.setDouble(3, product.getPrice());
            Stmt.setInt(4, product.getQuantity());
            Stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Get all products
    Public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        String sql = “SELECT * FROM Product”;
        Try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            While (rs.next()) {
                Product product = new Product(
                    Rs.getInt(“productID”),
                    Rs.getString(“name”),
                    Rs.getString(“category”),
                    Rs.getDouble(“price”),
                    Rs.getInt(“quantity”)
                );
                Products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Return products;
    }
}

