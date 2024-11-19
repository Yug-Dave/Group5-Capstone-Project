package ManagementSystem;
import java.util.Scanner;

public class SmartHouseMenu {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        ChargingMenu chargingMenu = new ChargingMenu();
        UsingMenu usingMenu = new UsingMenu();

        boolean running = true;
        while (running) {
            System.out.println("\n=== Smart House Main Menu ===");
            System.out.println("1. Charging");
            System.out.println("2. Using");
            System.out.println("3. Batteries");
            System.out.println("4. Show Logs");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    chargingMenu.display(scanner); // Delegate to ChargingMenu
                    break;
                case 2:
                    usingMenu.display(scanner); // Delegate to UsingMenu
                    break;
                case 3:
                    batteriesMenu(scanner); // Placeholder
                    break;
                case 4:
                    showLogsMenu(scanner); // Placeholder
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    // Placeholder for Using Menu
    private static void usingMenu(Scanner scanner) {
        System.out.println("Using feature is under construction.");
    }

    // Placeholder for Batteries Menu
    private static void batteriesMenu(Scanner scanner) {
        System.out.println("Battery management feature is under construction.");
    }

    // Placeholder for Logs
    private static void showLogsMenu(Scanner scanner) {
        System.out.println("Showing logs: [Placeholder]");
    }
}
