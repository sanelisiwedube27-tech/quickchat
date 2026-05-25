/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template;
/**
 *
 * @author Asus
 */
package quickchat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Login login = new Login();  

        System.out.println("=== Registration ===");

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter cell phone (+27...): ");
        String phone = input.nextLine();

        
        String registrationMessage = login.registerUser(username, password, phone, firstName, lastName);
        System.out.println(registrationMessage);

 
        if (registrationMessage.contains("Registration successful.")) {

            System.out.println("\n=== Login ===");

            System.out.print("Enter username: ");
            String loginUser = input.nextLine();

            System.out.print("Enter password: ");
            String loginPass = input.nextLine();

            boolean loginStatus = login.loginUser(loginUser, loginPass);
            System.out.print("Enter message text: ");
            String userMessage = input.nextLine();
            Message messageObj = new Message(1, phone, userMessage);
        System.out.println(messageObj.printMessages());
        }

        input.close();
    }
}
    
