import ManagementSystem.SmartHouseMenu;
import EnergySources.*;
import Batteries.*;

public static void main(String[] args) {
    SmartHouseMenu menu = new SmartHouseMenu();
    
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
    
    menu.main();
}
