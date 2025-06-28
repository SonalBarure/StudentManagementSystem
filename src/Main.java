import java.util.Scanner;

public class Main {

    //Disclaimer: This project includes code generated with the assistance of ChatGPT (OpenAI) for learning and development purposes.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();
        int choice;

        do {
            System.out.println("Welcome................\n");

            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    sm.addStudent(new Student(roll, name, course));
                    break;
                case 2:
                    sm.viewStudents();
                    break;
                case 3:
                    System.out.print("Enter Roll No to search: ");
                    sm.searchStudent(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Roll No to update: ");
                    int r = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("New Course: ");
                    String newCourse = sc.nextLine();
                    sm.updateStudent(r, newName, newCourse);
                    break;
                case 5:
                    System.out.print("Enter Roll No to delete: ");
                    sm.deleteStudent(sc.nextInt());
                    break;
                case 0:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}
