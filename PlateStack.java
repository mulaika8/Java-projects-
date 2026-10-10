
public class PlateStack {
    static int[] plates = new int[5];
    static int top = -1;

    // Add a plate to the stack
    static void push(int plate) {
        if (top == plates.length - 1) {
            System.out.println("Stack Overflow: No space for plates");
        } else {
            top++;
            plates[top] = plate;
            System.out.println("Plate " + plate + " added");
        }
    }

    // Remove the top plate
    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow: No plates available");
        } else {
            System.out.println("Plate " + plates[top] + " removed");
            top--;
        }
    }

    // Show the top plate
    static void peek() {
        if (top == -1) {
            System.out.println("No plates available");
        } else {
            System.out.println("Top plate: " + plates[top]);
        }
    }

    // Display all plates from top to bottom
    static void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Plates from top to bottom:");

            for (int i = top; i >= 0; i--) {
                System.out.println(plates[i]);
            }
        }
    }

    public static void main(String[] args) {
        push(101);
        push(102);
        push(103);

        display();
        peek();

        pop();

        display();
    }
}

