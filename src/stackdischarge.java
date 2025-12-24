public class stackdischarge {
    private class Node {
        dischargesystem data;
        Node next;

        Node(dischargesystem data) {
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
    public void push(dischargesystem record) {
        Node newNode = new Node(record);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Remove latest discharge
    public dischargesystem pop() {
        if (top == null) {
            System.out.println(" No element in this stack ");
            return null;
        }

        dischargesystem removed = top.data;
        top = top.next;
        size--;
        return removed;
    }

    // Look end of the discharge
    public dischargesystem peek() {
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

