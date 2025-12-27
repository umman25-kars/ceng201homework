public class Main2 {
    public static void main(String[] args) {
        System.out.println("Queue Treatment");//Testing task 2

        queuetreatment queue = new queuetreatment();//adding treatments to our queue

        queue.enqueue(new TreatmentRequest(1,false));
        queue.enqueue(new TreatmentRequest(2,false));
        queue.enqueue(new TreatmentRequest(3,true));
        queue.enqueue(new TreatmentRequest(4,false));
        queue.enqueue(new TreatmentRequest(5,false));
        queue.enqueue(new TreatmentRequest(6,true));
        queue.enqueue(new TreatmentRequest(7,false));
        queue.enqueue(new TreatmentRequest(8,false));

        System.out.println("8 Request added to queue:");
        queue.printqueue();

        System.out.println("Deque 3 requests:");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("Priorities:" + " 3 , 6");

        System.out.println("Queues remain:");
        queue.printqueue();
    }
}