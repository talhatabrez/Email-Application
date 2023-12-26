package EmailApplication.src.emailapp;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "beamer.com";

    //constructor for names
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email created: " + this.firstName + " " + this.lastName);
        
        //to return the department
        this.department = setDept();
        //System.out.println("Department: " +this.department);

        //to return a rand password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Password: " +this.password);

        //to generate email
        email = firstName.toLowerCase() + "." +lastName.toLowerCase() + "@" + department.toLowerCase() + "."+ companySuffix; 
        //System.out.println("Your email is: " +email);
    }

    //department name
    private String setDept(){
        System.out.print("Hola! " +firstName +". Enter your department code \n\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\n\nEnter the department: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if(deptChoice == 1) {return "Sales"; }
        else if (deptChoice == 2) {return "Development"; }
        else if (deptChoice == 3) {return "Accounting"; }
        else {return "None"; }
    }

    //generate rndm password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
            
        }
        return new String(password);
    }

    //set alternate email
    public void setAltEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //set mailbox capacity
    public void setMailCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    //change password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailCapacity() { return mailboxCapacity; }
    public String getAltEmail() { return alternateEmail; } 
    public String getPassword() { return password; }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAIL CAPACITY: " + mailboxCapacity + "MB";
    }
}
