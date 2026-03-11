import java.util.*;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age);
    }
}

public class StudentApp {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n----- Student Management System -----");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("Exiting Program...");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    static void addStudent() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        students.add(new Student(id, name, age));

        System.out.println("Student Added Successfully");
    }

    static void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }

    static void searchStudent() {

        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();

        boolean found = false;

        for (Student s : students) {
            if (s.id == id) {
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }
    }

    static void updateStudent() {

        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();

        for (Student s : students) {

            if (s.id == id) {

                System.out.print("Enter new name: ");
                s.name = sc.next();

                System.out.print("Enter new age: ");
                s.age = sc.nextInt();

                System.out.println("Student Updated Successfully");
                return;
            }
        }

        System.out.println("Student not found");
    }

    static void deleteStudent() {

        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        boolean removed = students.removeIf(s -> s.id == id);

        if (removed) {
            System.out.println("Student Deleted Successfully");
        } else {
            System.out.println("Student not found");
        }
    }
}



    
