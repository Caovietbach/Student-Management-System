import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        studentController controller = new studentController();

        int n = 0;
        String studentName;
        do {
            menu();
            n = sc.nextInt();
            sc.nextLine(); // Consume newline character
            switch (n) {
                case 1:
                    controller.addStudent(sc);
                    System.out.println("Please enter the number corresponding to the function");
                    break;
                case 2:
                    System.out.println("Please input the student name you want to edit");
                    studentName = sc.nextLine();
                    controller.editStudentInformation(studentName);
                    break;
                case 3:
                    System.out.println("Please input the student name you want to delete");
                    studentName = sc.nextLine();
                    controller.deleteStudentInformation(studentName);
                    break;
                case 4:
                    controller.viewStudent();
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