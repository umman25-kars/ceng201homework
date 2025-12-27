
import java.util.HashMap;
public class hospitalsystem {
    private Listofpatient patientList;
    private prioritytreatmentqueue treatmentQueue;
    private stackdischarge dischargeStack;
    private HashMap<Integer, Patient> patientmap;

    public hospitalsystem() {
        patientList = new Listofpatient();
        treatmentQueue = new prioritytreatmentqueue();
        dischargeStack = new stackdischarge();
        patientmap = new HashMap<>();
    }

    public void addPatient(Patient p) {
        patientList.addPatient(p);
        patientmap.put(p.id,p);
    }

    public void addTreatmentOrder(TreatmentRequest order) {
        treatmentQueue.enqueue(order);
    }

    public void processTreatment() {
        TreatmentRequest order = treatmentQueue.dequeue();
        if (order == null) {
            System.out.println("No treatment order.");
            return;
        }else
        dischargeStack.push(new DischargeRecord(order.patientID));
        patientList.removePatient(order.patientID);
        patientmap.remove(order.patientID);
    }

    public void printSystemState() {
        System.out.println("Lıst of the patient");
        patientList.printList();
        System.out.println("Queue treatments");
        treatmentQueue.printQueue();
        System.out.println("Stack discharges");
        dischargeStack.printStack();
    }

}
