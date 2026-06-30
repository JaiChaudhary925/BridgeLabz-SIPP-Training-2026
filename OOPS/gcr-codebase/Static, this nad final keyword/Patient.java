class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    String name;
    int age;
    String ailment;
    final int patientID;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayPatient() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("Rahul", 25, "Fever", 501);

        if (patient1 instanceof Patient) {
            patient1.displayPatient();
        }

        getTotalPatients();
    }
}