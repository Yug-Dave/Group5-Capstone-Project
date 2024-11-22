package ManagementSystem;

import java.util.Scanner;
import ManagementSystem.SmartHouseMenu;

public class ChargingMenu {

	private boolean isSolarPanelOn = false;
	private boolean isWindTurbineOn = false;
	private boolean isUrbanElectricityOn = false;

	public void display(Scanner scanner) {
		boolean backToMain = false;
		
		SmartHouseMenu shm;

		while (!backToMain) {
			System.out.println("\n--- Charging Menu ---");
			// Display the status of each service (on/off)
			System.out.println("1. Sunny Weather (Solar Panel) - Status: " + (isSolarPanelOn ? "On" : "Off"));
			System.out.println("2. Windy Weather (Wind Turbine) - Status: " + (isWindTurbineOn ? "On" : "Off"));
			System.out.println(
					"3. Raining Weather (Urban Electricity) - Status: " + (isUrbanElectricityOn ? "On" : "Off"));
			System.out.println("4. Back to Main Menu");
			System.out.print("Choose an option: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			switch (choice) {
			case 1:
				// handleEnergySource(scanner, "Sunny Weather (Solar Panel)", isSolarPanelOn);
				break;
			case 2:
				// handleEnergySource(scanner, "Windy Weather (Wind Turbine)", isWindTurbineOn);
				break;
			case 3:
				// handleEnergySource(scanner, "Raining Weather (Urban Electricity)",
				// isUrbanElectricityOn);
				break;
			case 4:
				backToMain = true;
				break;
			default:
				System.out.println("Invalid option. Please try again.");
			}
		}
	}

	// Handle energy source (turning on/off and status update)
	private void handleEnergySource(Scanner scanner, String energySource, boolean currentStatus) {
		System.out.println("\n--- " + energySource + " ---");
		System.out.println("Current status: " + (currentStatus ? "On" : "Off"));

		// Ask if the user wants to turn it on/off (using a switch-case menu)
		boolean changeStatus = showYesNoMenu(scanner, "Do you want to turn it " + (currentStatus ? "off" : "on") + "?");

		if (changeStatus) {
			// Toggle the status of the energy source
			if (energySource.equals("Sunny Weather (Solar Panel)")) {
				isSolarPanelOn = !currentStatus;
			} else if (energySource.equals("Windy Weather (Wind Turbine)")) {
				isWindTurbineOn = !currentStatus;
			} else if (energySource.equals("Raining Weather (Urban Electricity)")) {
				isUrbanElectricityOn = !currentStatus;
			}
			System.out.println(energySource + " turned " + (currentStatus ? "off" : "on") + ".");
		} else {
			System.out.println(energySource + " remains " + (currentStatus ? "on" : "off") + ".");
		}

		// Wait for 3 seconds before going back to the previous menu
		try {
			Thread.sleep(3000); // 3000 milliseconds = 3 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Automatically return to the previous menu after 3 seconds
	}

	// Yes/No menu implementation using switch-case
	private boolean showYesNoMenu(Scanner scanner, String message) {
		while (true) {
			System.out.println(message);
			System.out.println("1. Yes");
			System.out.println("2. No");
			System.out.print("Choose an option: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			if (choice == 1) {
				return true;
			} else if (choice == 2) {
				return false;
			} else {
				System.out.println("Invalid option. Please try again.");
			}
		}
	}

}
