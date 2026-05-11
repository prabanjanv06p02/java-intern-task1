import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] studentIds = new int[100];
        String[] studentNames = new String[100];
        int[] studentMarks = new int[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    studentIds[count] = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    studentNames[count] = sc.nextLine();

                    System.out.print("Enter Student Marks: ");
                    studentMarks[count] = sc.nextInt();

                    count++;

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("\n--- Student List ---");

                        for (int i = 0; i < count; i++) {
                            System.out.println("ID: " + studentIds[i]);
                            System.out.println("Name: " + studentNames[i]);
                            System.out.println("Marks: " + studentMarks[i]);
                            System.out.println("-------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (studentIds[i] == searchId) {
                            System.out.println("Student Found!");
                            System.out.println("ID: " + studentIds[i]);
                            System.out.println("Name: " + studentNames[i]);
                            System.out.println("Marks: " + studentMarks[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }

                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}