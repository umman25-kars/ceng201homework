public class prioritytreatmentqueue {
    private queuetreatment priorityqueue;
    private queuetreatment normalqueue;

    public prioritytreatmentqueue() {
        priorityqueue = new queuetreatment();
        normalqueue = new queuetreatment();
    }

    public void enqueue(TreatmentRequest order) {
        if (order.priority) {
            priorityqueue.enqueue(order);
        } else {
            normalqueue.enqueue(order);
        }
    }

    public TreatmentRequest dequeue() {
        if (priorityqueue.size() > 0) {
            return priorityqueue.dequeue();
        }else
            return normalqueue.dequeue();
    }

    public void printQueue() {
        System.out.println("normal order:");
        priorityqueue.printqueue();
        System.out.println("priority order:");
        normalqueue.printqueue();
    }
}
