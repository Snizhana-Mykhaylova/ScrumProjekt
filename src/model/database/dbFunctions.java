package model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int columnCount = resultSetMetaData.getColumnCount();

            String[] allColumnNames = new String[columnCount];

            for (int i = 1; i <= columnCount; i++) {
                String name = resultSetMetaData.getColumnName(i);
                allColumnNames[i - 1] = name;

                // System.out.print(name + " | ");
            }
            System.out.println();

            while (resultSet.next()){

                for (int i = 0; i < allColumnNames.length; i++) {
                    
                    if (i >= 0 && i < columnCount) {
                        System.out.print(resultSet.getString(allColumnNames[i]) + " | ");

                    } else {
                        System.out.println();
                    }
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void readDataFromId(Connection connect, String tableName, int id) {

    }
}
