package ManagementSystem;

import java.util.Scanner;

public class UsingMenu {
    private static boolean isTVOn = false;
    private static boolean isFridgeOn = false;
    private static boolean isLampOn = false;

    public void display(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("\n=== Using Menu ===");
            System.out.println("1. TV (Current Status: " + (isTVOn ? "On" : "Off") + ")");
            System.out.println("2. Fridge (Current Status: " + (isFridgeOn ? "On" : "Off") + ")");
            System.out.println("3. Lamp (Current Status: " + (isLampOn ? "On" : "Off") + ")");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    toggleDevice(scanner, "TV");
                    break;
                case 2:
                    toggleDevice(scanner, "Fridge");
                    break;
                case 3:
                    toggleDevice(scanner, "Lamp");
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Method to toggle the device status (on/off)
    private void toggleDevice(Scanner scanner, String device) {
        System.out.println(device + " (Current Status: " + (isDeviceOn(device) ? "On" : "Off") + ")");
        System.out.println("1. Turn On");
        System.out.println("2. Turn Off");
        System.out.println("3. Go Back");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                turnOnDevice(device);
                break;
            case 2:
                turnOffDevice(device);
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid option. Please try again.");
        }

        // Wait for 3 seconds before returning to the menu
        try {
            Thread.sleep(3000); // Wait for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Turn the device on
    private void turnOnDevice(String device) {
        switch (device) {
            case "TV":
                if (!isTVOn) {
                    isTVOn = true;
                    System.out.println(device + " is now On.");
                } else {
                    System.out.println(device + " is already On.");
                }
                break;
            case "Fridge":
                if (!isFridgeOn) {
                    isFridgeOn = true;
                    System.out.println(device + " is now On.");
                } else {
                    System.out.println(device + " is already On.");
                }
                break;
            case "Lamp":
                if (!isLampOn) {
                    isLampOn = true;
                    System.out.println(device + " is now On.");
                } else {
                    System.out.println(device + " is already On.");
                }
                break;
        }
    }

    // Turn the device off
    private void turnOffDevice(String device) {
        switch (device) {
            case "TV":
                if (isTVOn) {
                    isTVOn = false;
                    System.out.println(device + " is now Off.");
                } else {
                    System.out.println(device + " is already Off.");
                }
                break;
            case "Fridge":
                if (isFridgeOn) {
                    isFridgeOn = false;
                    System.out.println(device + " is now Off.");
                } else {
                    System.out.println(device + " is already Off.");
                }
                break;
            case "Lamp":
                if (isLampOn) {
                    isLampOn = false;
                    System.out.println(device + " is now Off.");
                } else {
                    System.out.println(device + " is already Off.");
                }
                break;
        }
    }

    // Check if the device is on
    private boolean isDeviceOn(String device) {
        switch (device) {
            case "TV":
                return isTVOn;
            case "Fridge":
                return isFridgeOn;
            case "Lamp":
                return isLampOn;
            default:
                return false;
        }
    }
}
