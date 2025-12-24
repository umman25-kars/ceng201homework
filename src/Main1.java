public class Main1 {
    public static void main(String [] args) {
        Listofpatient list = new Listofpatient();

        list.addPatient(new Patient(1, "Nathan Collins", 2, 24));//adding patients to our list
        list.addPatient(new Patient(2, "Benjamin Arthur", 3, 19));
        list.addPatient(new Patient(3, "Jordan Henderson ", 6, 35));
        list.addPatient(new Patient(4, "James Garner", 4, 57));
        list.addPatient(new Patient(5, "Tynan Thompson", 8, 42));

        System.out.println("List of patients");
        list.printList();

        System.out.println("Remove Patients");
        list.removePatient(5);

        System.out.println("Find Patients");
        Patient p = list.findPatient(4);
        if (p != null) {
            p.showpatient();
        }

        System.out.println("End of the list");
        list.printList();
    }
}
