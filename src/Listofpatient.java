public class Listofpatient {
    public class Node {
        Patient data;
        Node next;

        Node(Patient data) {
            this.data = data;
            this.next = null;
        }
    }

     Node head;

    public Listofpatient() {
        head = null;
    }

    // Adding patient to the end of the list
    public void addPatient(Patient p) {
        Node newNode = new Node(p);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Remove patient by their ID's
    public void removePatient(int id) {
        if (head == null) {
            System.out.println("No one in the list!");

        }

        if (head.data.id == id) {
            head = head.next;
            System.out.println("Removed patient: " + id);
            return;
        }

        Node pre = head;
        Node cur = head.next;

        while (cur != null) {
            if (cur.data.id == id) {
                pre.next = cur.next;
                System.out.println("Patient removed: " + id);
                return;
            }
            pre = cur;
            cur = cur.next;
        }

        System.out.println("There is no patient: " +  id);
    }

    // Finding patient by their ID's
    public Patient findPatient(int id) {
        Node temp = head;

        while (temp != null) {
            if (temp.data.id == id) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    // Printing patients
    public void printList() {
        if (head == null) {
            System.out.println("No patients in list");

        }

        Node current = head;
        while (current != null) {
            current.data.showpatient();
            current = current.next;
        }
    }
}

