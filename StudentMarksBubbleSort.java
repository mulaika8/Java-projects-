
public class StudentMarksBubbleSort {
    public static void main(String[] args) {
        int[] marks = {75, 45, 90, 60, 30};

        System.out.println("Original Marks:");

        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = 0; j < marks.length - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted Marks:");

        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
