import java.util.Scanner;

public class Email {
    private String firstName;
    private String LastName;
    private String password;
    private String department;
    private String email;
    private int defaultpasswordlength = 10;
    private int mailboxCapacity = 500;
    private String alterneteEmail;
    private String companySuffix = "company.com";
    
    //constructer to receive first and last name

    public Email(String firstName, String lastName){
       this.firstName = firstName;
       this.LastName = lastName; 
       System.out.println("Email created:" + this.firstName + "" + this.LastName);
       //call  asking for department
       this.department = setDepartment();
      

       //call method that returns password
       this.password = randomPassword(defaultpasswordlength);
       System.out.println("Your password is:" + this.password);

       //combine to get email
       email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
       
       

    }

    //ask for department

    private String setDepartment(){
        System.out.print(" New Worker: " + firstName +"DEPARTMENT CODES: Enter the department\n1 for Sales\n2 for development\n3 Accounting\n0 for none\nEnter department code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if
        (depChoice == 1){return "sales";} 
        else if (depChoice == 2){return "dev";}  
        else if (depChoice == 3){ return "accounting";}
        else  { return ""; }
    }


    //generate random password
    private String randomPassword(int length){
        String passwordSet = "ABDCEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[]password = new char[length];
        for (int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
      return new String(password);
    }


    //set mail capacity
    public void setMailBoxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }


    // alt email

    public void setAlternatemail(String altEmail){
        this.alterneteEmail = altEmail;
    }

    //change password

    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity() { return mailboxCapacity;}
    public String getAlternateEmail(){ return alterneteEmail;}
    public String getPassword(){return password;}

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + "" + LastName +
        "\n COMPANY EMAIL: " + email +
        "\n MAILBOX CAPACITY: " + mailboxCapacity + "mb"; 
    }

}
