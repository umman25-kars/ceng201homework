public class treatmentorder {
    public int patientId;
    public boolean priority;
    int ID;
    long ordertime; //Time that when is patient came to the order.

    public treatmentorder(int ID) {
        this.ID = ID;
        this.ordertime = System.currentTimeMillis();
    }

    public static void enqueue(treatmentrequest order) {

    }

    public void printtreatment() {
        System.out.println("Patients Id:" + ID + "Order time:" + ordertime );//Showing request patient's infos.
    }
}
