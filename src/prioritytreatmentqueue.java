public class prioritytreatmentqueue {
    private queuetreatment priorityqueue;
    private queuetreatment normalqueue;

    public prioritytreatmentqueue() {
        priorityqueue = new queuetreatment();
        normalqueue = new queuetreatment();
    }

    public void enqueue(treatmentorder order) {
        if (order.priority) {
            priorityqueue.enqueue(order);
        } else {
            normalqueue.enqueue(order);
        }
    }

    public treatmentorder dequeue() {
        if (priorityqueue.size() > 0) {
            return priorityqueue.dequeue();
        }
        return normalqueue.dequeue();
    }

    public void printQueue() {
        System.out.println("Priority Order:");
        priorityqueue.printqueue();
        System.out.println("Normal Order:");
        normalqueue.printqueue();
    }
}
