import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String correctUser = "admin";
        String correctPass = "1234";

        Scanner sc = new Scanner(System.in);

        System.out.print("Username: ");
        String user = sc.nextLine();

        System.out.print("Password: ");
        String pass = sc.nextLine();

        if(user.equals(correctUser) && pass.equals(correctPass)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Login");
        }

        sc.close();
    }
}