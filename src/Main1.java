public class Main1 {
    public static void main(String [] args) {
        Listofpatient list = new Listofpatient();//Testing task 1

        list.addPatient(new Patient(12, "Nathan Collins" ,  5 ,   24));//adding patients to our list
        list.addPatient(new Patient(9, "Benjamin Arthur",   3,   19));
        list.addPatient(new Patient(7, "Jordan Henderson ",    6,   35));
        list.addPatient(new Patient(4, "James Garner",   4,   57));
        list.addPatient(new Patient(14, "Tynan Thompson",   8,   42));

        System.out.println("List of patients");
        list.printList();

        System.out.println("Remove Patients");
        list.removePatient(7);

        System.out.println("Find Patients");
        Patient p = list.findPatient(7);
        if (p != null) {
            p.showpatient();
            System.out.println("An patient founded");
        }

        System.out.println("End of the list");
    }
}
