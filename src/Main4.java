public class Main4 {
    public static void main(String[] args) {
        hospitalsystem system = new hospitalsystem();//Testing task 4

        // Adding 10 patient
        system.addPatient(new Patient(1 , " John", 8,  45));
        system.addPatient(new Patient(2 , " Alice", 3,  29));
        system.addPatient(new Patient(3 , " Michael", 9,  62));
        system.addPatient(new Patient(4 , " Zoe", 5,  22));
        system.addPatient(new Patient(5 , " Jack", 7,  47));
        system.addPatient(new Patient(6 , " Sam", 4,  33));
        system.addPatient(new Patient(7 , " Susan", 6,  51));
        system.addPatient(new Patient(8 , " Dennis", 2,  19));
        system.addPatient(new Patient(9 , " Celine", 10,  74));
        system.addPatient(new Patient(10 , " Bob", 1,  28));

        //We added 5 normal patient and 3 priority patient
        system.addTreatmentOrder(new TreatmentRequest(1, false));
        system.addTreatmentOrder(new TreatmentRequest(2, true));
        system.addTreatmentOrder(new TreatmentRequest(3, true));
        system.addTreatmentOrder(new TreatmentRequest(4, false));
        system.addTreatmentOrder(new TreatmentRequest(5, false));
        system.addTreatmentOrder(new TreatmentRequest(6, true));
        system.addTreatmentOrder(new TreatmentRequest(7, false));
        system.addTreatmentOrder(new TreatmentRequest(8, false));

        // 4-process
        system.processTreatment();
        system.processTreatment();
        system.processTreatment();
        system.processTreatment();

        system.printSystemState();
    }

}
