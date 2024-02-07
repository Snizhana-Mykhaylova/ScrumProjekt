import java.sql.Connection;

import model.database.dbFunctions;
import model.login.UserLogin;

public class App {
    public static void main(String[] args) throws Exception {
        
        Connection connect = dbFunctions.connectToDb();
        
        UserLogin login = new UserLogin();
        login.CheckUser();

        
        
    }
}
