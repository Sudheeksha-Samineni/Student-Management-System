import java.util.Scanner;

class StudentApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String students[] = new String[100];
        int count = 0;

        while(true) {

            System.out.println("---- Student Management System ----");
            System.out.println("1.Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5.Exit");


            int choice = sc.nextInt();

            if(choice == 1) {
                System.out.println("Enter student name:");
                String name = sc.next();
                students[count] = name;
                count++;
                System.out.println("Student added successfully");
            }
            else if(choice == 2) {
                System.out.println("Student List:");
                for(int i=0; i<count; i++) {
                    System.out.println(students[i]);
                }
            }
            else if(choice == 3) {
                System.out.println("Enter name to search:");
                String search=sc.next();
                boolean found=false;
                for(int i=0;i<count;i++) {
                    if(students[i].equals(search)) {
                        System.out.println("Student found");
                        found=true;
                    }
                }
            }
            else if(choice == 4) {
            System.out.println("Enter name to delete:");
            String deleteName = sc.next();

    boolean deleted = false;

    for(int i=0; i<count; i++) {
        if(students[i].equals(deleteName)) {
            for(int j=i; j<count-1; j++) {
                students[j] = students[j+1];
            }
            count--;
            deleted = true;
            System.out.println("Student deleted");
            break;
        }
    }

    if(deleted == false) {
        System.out.println("Student not found");
    }
}

else if(choice == 5) {
    System.out.println("Exiting...");
    break;
}
            }
            sc.close();
        }
    }


    