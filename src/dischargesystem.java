public class dischargesystem {
    int patientId;
    long dischargetime;

    public dischargesystem(int patientId) {
        this.patientId = patientId;
        this.dischargetime = System.currentTimeMillis();//time of the when patient discharged from hospital.
    }

    public void printregistry() {
        System.out.println(
                "Patient ID: " + patientId + ", Discharge Time: " + dischargetime);

    }
}