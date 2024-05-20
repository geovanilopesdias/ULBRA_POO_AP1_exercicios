import java.security.PublicKey;
import java.util.Scanner;

public class LoginSystem {
    private static final String LOGIN = "java8";
    private static final String PASSWORD = "java8";

    private static boolean checkLogin(){
        Scanner t = new Scanner(System.in);
        System.out.print("Insert login: ");
        String login = t.nextLine();
        System.out.print("Insert password: ");
        String password = t.nextLine();
        return login.equals(LOGIN) && password.equals(PASSWORD);
    }

    public static void exhibitLogin(){
        for (int i = 0; i < 3; i++) {
            if (checkLogin()){
                System.out.println("\tAccess granted!");
                break;
            }
            else
                if (i < 2) System.out.println("\tAccess denied! Try again:");
                else System.out.println("\tAccess denied! The system will shut down:");

        }
    }

}
