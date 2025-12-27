
public class DischargeRecord {
    int patientId;
    long dischargetime;

    public DischargeRecord(int patientId) {
        this.patientId = patientId;
        this.dischargetime = System.currentTimeMillis();//time that patient discharged from hospital.
    }

    public void printregistry() {
        System.out.println("Patient ID: " +  patientId  + ", Discharge Time: " +  dischargetime);

    }
}