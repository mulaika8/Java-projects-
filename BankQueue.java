
public class BankQueue {
    static String[] queue = new String[5];
    static int front = -1;
    static int rear = -1;

    static void enqueue(String customer) {
        if (rear == queue.length - 1) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }

            queue[++rear] = customer;
            System.out.println(customer + " joined the line");
        }
    }

    static void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("No customers waiting");
        } else {
            System.out.println(queue[front] + " is being served");
            front++;

            if (front > rear) {
                front = rear = -1;
            }
        }
    }

    static void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        enqueue("Ali");
        enqueue("Sara");
        enqueue("Ahmed");

        System.out.println("Waiting customers:");
        display();

        dequeue();
        dequeue();
    }
}
