import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        // Example admin user
        User admin = new User("admin", "admin");
        userManager.addUser(admin);

        Scanner scanner = new Scanner(System.in);

        // CLI for demonstration, replace with UI logic
        System.out.println("Welcome! Choose an option:");
        System.out.println("1. Register");
        System.out.println("2. Login");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            System.out.print("Confirm password: ");
            String confirmPassword = scanner.nextLine();

            if (!password.equals(confirmPassword)) {
                System.out.println("Your passwords don't match.");
            } else {
                User user = new User(username, password);
                userManager.addUser(user);
                System.out.println("You have successfully registered. Please log in.");
            }
        } else if (choice == 2) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            User user = userManager.loginUser(username, password);
            if (user != null) {
                System.out.println("You have successfully logged in.");
            } else {
                System.out.println("Invalid credentials.");
            }
        }
    }
}
