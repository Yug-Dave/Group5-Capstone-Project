package ManagementSystem;
import java.util.Scanner;

import Batteries.*;
import EnergySources.*;

public class SmartHouseMenu {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        ChargingMenu chargingMenu = new ChargingMenu();
        UsingMenu usingMenu = new UsingMenu();
        
        
        EenergySource solar = new EenergySource();
        solar.setName("Solar");
        solar.setPower(50); // kW/h

        EenergySource wind = new EenergySource();
        wind.setName("Wind");
        wind.setPower(100); // kW/h

        EenergySource electricity = new EenergySource();
        electricity.setName("Electricity");
        electricity.setPower(150); // kW/h

        Battery battery1 = new Battery("Battery 1", 200);
        battery1.setCurrentCharge(50); // kW
        battery1.setEnergySource(solar);
        
        Battery battery2 = new Battery("Battery 2", 300);
        battery2.setCurrentCharge(150); // kW
        battery2.setEnergySource(wind); 

        Battery battery3 = new Battery("Battery 3", 400);
        battery3.setCurrentCharge(100); // kW
        battery3.setEnergySource(electricity);

        Battery battery4 = new Battery("Battery 4", 250);
        battery4.setCurrentCharge(0); // kW
        battery4.setEnergySource(solar); 
        

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
                    chargingMenu.display(scanner); // Goes to ChargingMenu to continue the code...
                    break;
                case 2:
                    usingMenu.display(scanner);// Goes to UsingMenu to continue the code...
                    break;
                case 3:
                    batteriesMenu(scanner);
                    break;
                case 4:
                    showLogsMenu(scanner);
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

    // Placeholder for Batteries Menu
    private static void batteriesMenu(Scanner scanner) {
        System.out.println("Battery management feature is under construction.");
    }

    // Placeholder for Logs
    private static void showLogsMenu(Scanner scanner) {
        System.out.println("Showing logs: [Placeholder]");
    }
}
