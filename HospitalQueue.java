
public class HospitalQueue {
    static class Node {
        String patient;
        Node next;

        Node(String patient) {
            this.patient = patient;
        }
    }

    static Node front = null;
    static Node rear = null;

    static void enqueue(String patient) {
        Node newNode = new Node(patient);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(patient + " added to queue");
    }

    static void dequeue() {
        if (front == null) {
            System.out.println("No patients waiting");
        } else {
            System.out.println(front.patient + " is being served");
            front = front.next;

            if (front == null) {
                rear = null;
            }
        }
    }

    static void display() {
        Node current = front;

        if (current == null) {
            System.out.println("Queue is empty");
            return;
        }

        while (current != null) {
            System.out.println(current.patient);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        enqueue("Ali");
        enqueue("Sara");
        enqueue("Ahmed");

        System.out.println("Waiting Patients:");
        display();

        dequeue();

        System.out.println("Remaining Patients:");
        display();
    }
}
