public class Main2 {
    public static void main(String[] args) {
        System.out.println("Queue Treatment");

        queuetreatment queue = new queuetreatment();//adding treatments to our queue

        queue.enqueue(new queuetreatment(1));
        queue.enqueue(new queuetreatment(2));
        queue.enqueue(new queuetreatment(3));
        queue.enqueue(new queuetreatment(4));
        queue.enqueue(new queuetreatment(5));
        queue.enqueue(new queuetreatment(6));
        queue.enqueue(new queuetreatment(7));
        queue.enqueue(new queuetreatment(8));

        System.out.println("8 Request added to queue:");
        queue.printqueue();

        System.out.println("Deque 3 requests:");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("Queues remain:");
        queue.printqueue();
    }
}