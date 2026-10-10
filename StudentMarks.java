
public class StudentMarks {
    public static void main(String[] args) {
        int[] marks = {78, 85, 90, 67, 88};

        System.out.println("Student Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1)
                    + ": " + marks[i]);
        }

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        double average = (double) total / marks.length;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}
