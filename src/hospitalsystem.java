
import java.util.HashMap;
public class hospitalsystem {
    private Listofpatient patientList;
    private prioritytreatmentqueue treatmentQueue;
    private stackdischarge dischargeStack;
    private HashMap<Integer, Patient> patientmap;

    public hospitalsystem() {
        patientList = new Listofpatient();
        prioritytreatmentqueue prioritytreatmentqueue = new prioritytreatmentqueue();
        dischargeStack = new stackdischarge();
        patientmap = new HashMap<>();
    }

    public void addPatient(Patient p) {
        patientList.addPatient(p);
        patientmap.put(p.id, p);
    }

    public void addTreatmentOrder(treatmentrequest order) {
        treatmentorder.enqueue(order);
    }

    public void processTreatment() {
        treatmentorder order = treatmentQueue.dequeue();
        if (order == null) {
            System.out.println("No treatment order.");
            return;
        }
        dischargeStack.push(new dischargesystem(order.patientId));
        patientList.removePatient(order.patientId);
        patientmap.remove(order.patientId);
    }

    public void printSystemState() {
        System.out.println("Lıst of the patient");
        patientList.printList();

        System.out.println("Queue treatments");
        treatmentQueue.printQueue();

        System.out.println("Stack dıscharges");
        dischargeStack.printStack();
    }

}
