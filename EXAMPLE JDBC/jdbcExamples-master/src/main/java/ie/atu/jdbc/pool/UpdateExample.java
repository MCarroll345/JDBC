package ie.atu.jdbc.pool;

import java.sql.*;

public class UpdateExample {
    public static void main(String[] args) {
        String updateSQL = "UPDATE people SET name = 'Nathanial' WHERE id = 1";

        try (Connection connection = DatabaseUtils.getConnection();
             Statement statement = connection.createStatement()) {
            int rowsUpdated = statement.executeUpdate(updateSQL);
            System.out.println("Rows updated: " + rowsUpdated);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}