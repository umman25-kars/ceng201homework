public class queuetreatment {
    private class Node {
        treatmentorder data;
        Node next;

        Node(treatmentorder data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;// the element who gets off fırst
    private Node rear; // the element who add last
    private int size;// number of the element

    public queuetreatment() {
        front = null;
        rear = null;
        size = 0;
    }

    // Adding treatment request to our queue
    public void enqueue(treatmentorder request) {
        Node newNode = new Node(request);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Removing the first treatment request
    public treatmentorder dequeue() {
        if (front == null) {
            System.out.println("No element in the queue");
            return null;
        }

        treatmentorder removed = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
        return removed;
    }

    public int size() {
        return size;
    }

    public void printqueue() {//printing the requests
        if (front == null) {
            System.out.println("There is no any treatment request.");
            return;
        }

        Node current = front;
        while (current != null) {
            current.data.printtreatment();
            current = current.next;//turning the queue
        }
    }
}
