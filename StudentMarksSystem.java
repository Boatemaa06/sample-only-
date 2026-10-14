import java.util.Scanner;

public class StudentMarksSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        if (numberOfStudents <= 0) {
            System.out.println("The number of students must be greater than zero.");
            input.close();
            return;
        }

        int[] marks = new int[numberOfStudents];
        int total = 0;
        int highest = 0;
        int lowest = 100;

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter marks for student "
                    + (i + 1) + " (0-100): ");
            marks[i] = input.nextInt();

            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid mark. Enter a mark from 0 to 100: ");
                marks[i] = input.nextInt();
            }

            total = total + marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        double average = (double) total / numberOfStudents;

        System.out.println("\n--- STUDENT MARKS REPORT ---");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1)
                    + ": " + marks[i]);
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Average Mark: " + average);
        System.out.println("Highest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);

        input.close();
    }
}