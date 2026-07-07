import java.util.ArrayList;

public class SmartParkingSlotManager {

    static ArrayList<String> parking = new ArrayList<>();

    public static void addVehicle(String vehicleNumber) {

        if (parking.contains(vehicleNumber)) {
            System.out.println(vehicleNumber + " is already parked.");
        } else {
            parking.add(vehicleNumber);
            System.out.println(vehicleNumber + " entered the parking.");
        }

    }

    public static void removeVehicle(String vehicleNumber) {

        if (parking.contains(vehicleNumber)) {
            parking.remove(vehicleNumber);
            System.out.println(vehicleNumber + " exited the parking.");
        } else {
            System.out.println(vehicleNumber + " not found in parking.");
        }

    }

    public static void searchVehicle(String vehicleNumber) {

        if (parking.contains(vehicleNumber)) {
            System.out.println(vehicleNumber + " is currently parked.");
        } else {
            System.out.println(vehicleNumber + " is not parked.");
        }

    }

    public static void displayVehicles() {

        System.out.println("\n----- Parked Vehicles -----");

        if (parking.isEmpty()) {
            System.out.println("Parking is Empty.");
        } else {

            for (String vehicle : parking) {
                System.out.println(vehicle);
            }

        }

        System.out.println("\nTotal Occupied Parking Slots : " + parking.size());

    }

    public static void main(String[] args) {

        addVehicle("UP85AB1234");
        addVehicle("DL01CD5678");
        addVehicle("HR26EF9999");
        addVehicle("UP85AB1234");

        System.out.println();

        searchVehicle("DL01CD5678");

        System.out.println();

        removeVehicle("HR26EF9999");

        System.out.println();

        displayVehicles();

    }

}
//tc= O(n) for add, remove, search, and display operations since we are using an ArrayList to store the parked vehicles.