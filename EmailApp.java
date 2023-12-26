package EmailApplication.src.emailapp;
// EmailApp.java
import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Prompt the user for their last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Create an Email object with user input
        Email user = new Email(firstName, lastName);

        // Display user information
        System.out.println(user.showInfo());
        

        // Close the scanner
        scanner.close();
    }
}
