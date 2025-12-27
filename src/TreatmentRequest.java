public class TreatmentRequest {//main class
    int patientID;
    boolean priority;
    long orderTime; //Time that when is patient came to the order.

    public TreatmentRequest(int patientID , boolean priority) {//constructor
        this.patientID = patientID;
        this.orderTime = System.currentTimeMillis();//Fınd'S the arrive time with this
    }

    public void printtreatment() {
        System.out.println("Patients Id:" + patientID + "Order time:" + orderTime );//Showing request patient's infos.
    }
}
