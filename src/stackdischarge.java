public class stackdischarge {
    private class Node {
        DischargeRecord data;
        Node next;

        Node(DischargeRecord data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;//for connect data its private
    private int size;

    public stackdischarge() {
        top = null;
        size = 0;
    }

    // Adding discharge record
    public void push(DischargeRecord record) {
        Node newNode = new Node(record);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Remove latest discharge
    public DischargeRecord pop() {
        if (top == null) {
            System.out.println(" No any element in this stack ");
            return null;
        }

        DischargeRecord removed = top.data;
        top = top.next;
        size--;
        return removed;
    }

    // Look end of the discharge
    public DischargeRecord peek() {
        if (top == null) {
            return null;
        }
        return top.data;
    }

    public void printStack() {
        if (top == null) {
            System.out.println("No discharge records");
            return;
        }

        Node current = top;
        while (current != null) {
            current.data.printregistry();
            current = current.next;
        }
    }
}

