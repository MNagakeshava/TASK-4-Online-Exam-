import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class online_exam {

    private static String loggedInUser;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz App!");
        login(scanner);

        updateProfile(scanner);
        changePassword(scanner);

        selectAnswersForMCQs(scanner);

        timerAndAutoSubmit();

        logout();
    }

    private static void login(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if ("user123".equals(username) && "password123".equals(password)) {
            loggedInUser = username;
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials. Exiting...");
            System.exit(0);
        }
    }

    private static void updateProfile(Scanner scanner) {
        System.out.println("Updating profile for user: " + loggedInUser);

        System.out.print("Enter your new profile information: ");
        String newProfileInfo = scanner.nextLine();

        System.out.println("Profile updated successfully!");
    }

    private static void changePassword(Scanner scanner) {
        System.out.println("Changing password for user: " + loggedInUser);

        System.out.print("Enter your new password: ");
        String newPassword = scanner.nextLine();

        System.out.println("Password changed successfully!");
    }

    private static void selectAnswersForMCQs(Scanner scanner) {
        System.out.println("MCQ Quiz:");
        System.out.println("1. How many states in INDIA ?");
        System.out.println("a) 28  b) 26  c) 27  d) None of the Above ");

        System.out.print("Your answer: ");
        String userAnswer = scanner.nextLine();
        if ("a".equals(userAnswer)){
            System.out.println("1 Point");
        } else {
            System.out.println("wrong");
        }
        

        System.out.println("2. who is the PrimeMinister of INDIA at 2023 ?");
        System.out.println("a) SONIA  b) RAHUL GANDHI  c) GANDHI  d) MODI ");

        System.out.print("Your answer: ");
        String userAnswer1 = scanner.nextLine();
        if ("d".equals(userAnswer1)){
            System.out.println("1 Point");
        } else {
            System.out.println("wrong");
        }
        
        System.out.println("Your answer is: " + userAnswer);
        System.out.println("Your answer is: " + userAnswer1); 

        
    }

    private static void timerAndAutoSubmit() {
        System.out.println("Quiz starting. You have 5 seconds.");

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Time's up! Auto-submitting.");
    }

    private static void logout() {
        System.out.println("Logout successful!");
    }
}
