import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentController controller = new StudentController();

        int n = 0;
        int studentID;
        do {
            menu();
            n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    controller.addStudent(sc);
                    System.out.println("Please enter the number corresponding to the function");
                    break;
                case 2:
                    System.out.println("Please input ID of the student you want to edit");
                    while (!sc.hasNextInt()) {
                        System.out.println("Please enter a number!");
                        sc.next();
                    }
                    studentID = sc.nextInt();
                    controller.editStudentInformation(studentID);
                    break;
                case 3:
                    System.out.println("Please input the ID of the student you want to delete");
                    while (!sc.hasNextInt()) {
                        System.out.println("Please enter a number!");
                        sc.next();
                    }
                    studentID = sc.nextInt();
                    controller.deleteStudentInformation(studentID);
                    break;
                case 4:
                    controller.viewAllStudentInformation();
                    break;
                case 5:
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Input");
                    break;
            }
        } while (n != 5);
    }

    public static void menu() {
        System.out.println("Menu:");
        System.out.println("1.Add student");
        System.out.println("2.Edit student information");
        System.out.println("3.Delete student information");
        System.out.println("4.View all student information");
        System.out.println("5.Quit");
        System.out.println("Please enter the number correspond to the function");
    }
}