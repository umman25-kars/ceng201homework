public class treatmentrequest {
    int patientId;
    long arrivetime;
    boolean priority;

    public treatmentrequest(int patientId) {
        this.patientId = patientId;
        this.priority = false;
        this.arrivetime = System.currentTimeMillis();
    }

    public treatmentrequest(int patientId, boolean priority) {
        this.patientId = patientId;
        this.priority = priority;
        this.arrivetime = System.currentTimeMillis();
    }

    public void printorder() {
        System.out.println("PatientID: " + patientId + ", Priority: " + priority + ", Time: " + arrivetime);
    }//Using other tasks to perform task 4
}
