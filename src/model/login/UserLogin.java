package model.login;

import java.util.Scanner;

import model.database.dbFunctions;
// import model.tables.sacharbeiter;

public class UserLogin {

    public UserLogin(){
        // dbFunctions.readCompleteTable(null, "sacharbeiter");

    }

    
    // user.getScharbeiterUsername()

    private String username = "admin";
    private String password = "admin";
    private String usernameInput;
    private String usernamePassword;

    public void CheckUser(){

        Scanner input1 = new Scanner(System.in);
        System.out.println("enter username:");
        usernameInput = input1.nextLine();

        if(usernameInput.equals(username)){
            System.out.println("Richtig");
        }else{
            System.out.println("wrong username, Try again Please");
            System.exit(0);
        }

        Scanner input2 = new Scanner(System.in);
        System.out.println("enter password:");
        usernamePassword = input2.nextLine();

        if(usernamePassword.equals(password)){
            System.out.println("Richtig");
        }else{
            System.out.println("wrong username, Try again Please");
            System.exit(0);

        }
        


    }
}
