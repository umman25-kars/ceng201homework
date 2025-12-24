public class Main4 {
    hospitalsystem system = new hospitalsystem();

    // Adding 10 patient
        system.addPatient(new Patient(1, "John", 8, 45));
        system.addPatient(new Patient(2, "Alice", 3, 30));
        system.addPatient(new Patient(3, "Michael", 9, 60));
        system.addPatient(new Patient(4, "Zoe", 5, 25));
        system.addPatient(new Patient(5, "Jack", 7, 40));
        system.addPatient(new Patient(6, "Sam", 4, 33));
        system.addPatient(new Patient(7, "Susan", 6, 50));
        system.addPatient(new Patient(8, "Dennis", 2, 19));
        system.addPatient(new Patient(9, "Celine", 10, 70));
        system.addPatient(new Patient(10, "Monica", 1, 28));

    // 5 normal patient + 3 priority patient
        system.addTreatmentOrder(new TreatmentOrder(1, false));
        system.addTreatmentOrder(new TreatmentOrder(2, true));
        system.addTreatmentOrder(new TreatmentOrder(3, true));
        system.addTreatmentOrder(new TreatmentOrder(4, false));
        system.addTreatmentOrder(new TreatmentOrder(5, false));
        system.addTreatmentOrder(new TreatmentOrder(6, true));
        system.addTreatmentOrder(new TreatmentOrder(7, false));
        system.addTreatmentOrder(new TreatmentOrder(8, false));

    // 4.process
        system.processTreatment();
        system.processTreatment();
        system.processTreatment();
        system.processTreatment();

        system.printSystemState();

}
