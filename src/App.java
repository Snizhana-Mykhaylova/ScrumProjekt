import java.sql.Connection;

import model.database.dbFunctions;

public class App {
    public static void main(String[] args) throws Exception {
        
        Connection connect = dbFunctions.connectToDb();
        
        dbFunctions.readCompleteTable(connect, "mitarbeiter");

        System.out.println();

        dbFunctions.readCompleteTable(connect, "dozenten");
    }
}
