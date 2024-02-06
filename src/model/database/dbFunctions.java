package model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbFunctions {

    public static String databaseName = "verwaltungssoftware";
    public static String databaseUser = "postgres";
    public static String databasePassword = "admin";
    public static String databaseUrl = "jdbc:postgresql://localhost:5432/";

    public static Connection connect;

    public static Connection connectToDb() {

        connect = null;

        try {
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection(databaseUrl + databaseName, databaseUser, databasePassword);
            
            if (connect != null) {
                System.out.println("Connection established");

            } else {
                System.out.println("Connection Failed");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return connect;
    }

    public static void readCompleteTable(Connection connect, String tableName) {

        Statement statement;
        ResultSet resultSet;

        try {
            String query = String.format("SELECT * FROM %s ;", tableName);
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                
                System.out.println();
            }
        
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
