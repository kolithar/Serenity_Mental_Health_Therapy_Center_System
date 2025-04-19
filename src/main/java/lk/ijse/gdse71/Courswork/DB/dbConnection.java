package lk.ijse.gdse71.Courswork.DB;

import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

    private static dbConnection instance;

    private final Connection connection;

    private dbConnection() throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/Serenity_Mental_Health_Therapy_Center?createDatabaseIfNotExist=true";
        String USER = "root";
        String PASSWORD = "12345";
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static dbConnection getInstance() throws SQLException {
        return instance == null ? instance = new dbConnection() : instance;
    }

    // Lombok usage
//    public Connection getConnection(){
//        return connection;
//    }
}




