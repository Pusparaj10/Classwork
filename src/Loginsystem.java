import java.util.Scanner;

public class Loginsystem {
    //Write a program using for loop to create a password checker giving user 5 tries.


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String Username = "Binayak";
            String Password = "#Nepal123";
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            for (int i = 1; i < 5 ; i++) {
                if (username.equals(Username) && password.equals(Password)) {
                    System.out.println( "Login successful!");
                } else {
                    System.out.println("Wrong entry try ag1ain Enter Username:");
                    String user_name = scanner.nextLine();


                    System.out.println("Password:");
                    String pass_word = scanner.nextLine();
                }
            }

        }

    }

