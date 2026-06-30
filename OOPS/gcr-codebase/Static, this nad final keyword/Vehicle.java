class Vehicle {
    static double registrationFee = 5000;

    String ownerName;
    String vehicleType;
    final String registrationNumber;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void displayVehicle() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Jai", "Car", "UP85AB1234");

        if (vehicle1 instanceof Vehicle) {
            vehicle1.displayVehicle();
        }

        updateRegistrationFee(6000);
        System.out.println("Updated Fee: " + registrationFee);
    }
}