
import java.util.Scanner;

public class CircularQueue {
    int[] queue;
    int front, rear, size, capacity;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full!");
            return;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;

        System.out.println(value + " inserted.");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }

        System.out.println("Removed: " + queue[front]);

        front = (front + 1) % capacity;
        size--;

        if (size == 0) {
            front = -1;
            rear = -1;
        }
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.println("Front: " + queue[front]);
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }

        System.out.print("Queue: ");

        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CircularQueue cq = new CircularQueue(5);
        int choice;

        do {
            System.out.println("\n--- Circular Queue ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    cq.enqueue(value);
                    break;

                case 2:
                    cq.dequeue();
                    break;

                case 3:
                    cq.peek();
                    break;

                case 4:
                    cq.display();
                    break;

                case 5:
                    System.out.println(cq.isEmpty());
                    break;

                case 6:
                    System.out.println(cq.isFull());
                    break;

                case 0:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}
