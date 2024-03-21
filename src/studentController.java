
import java.util.ArrayList;

import java.util.Scanner;

public class StudentController {
    private ArrayList<Student> studentList;

    public StudentController(){
        studentList = new ArrayList<>();
    }

    public void addStudent(Scanner sc){
        Student student;

        System.out.print("Nhap số lượng sinh viên: ");
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a number!");
            System.out.print("Nhap số lượng sinh viên: ");
            sc.next();
        }
        int n = sc.nextInt();

        System.out.println("Nhap danh sach sinh vien: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1) + " la:");
            student = new Student();
            student.createNewStudentInformation(sc);
            boolean idExists = false;
            for(Student s: studentList){
                if (s.getID() == student.getID()){
                    idExists = true;
                    break;
                }
            }

            if (!idExists) {
                studentList.add(student);
                System.out.println("Sinh vien da duoc them vao danh sach.");
            } else {
                System.out.println("Id này đã được sử dụng, vui lòng sử dụng ID khác.");
                i--;
            }
            System.out.println("+++++");

        }
    }

    public void viewAllStudentInformation(){
        for(Student s: studentList){
            s.displayStudentInformation();
            System.out.println("+++++");
        }
    }

    public void editStudentInformation(int id){
        Scanner sc = new Scanner(System.in);
        for (Student student : studentList) {
            if (id == student.getID()) {
                student.displayStudentInformation();
                System.out.println("The new student name:");
                String newName = sc.nextLine();
                student.setName(newName);
                System.out.println("Success");
            }
            else {
                System.out.println("Invalid");
            }
        }
    }

    public void deleteStudentInformation(int id){
        Scanner sc = new Scanner(System.in);
        Student studentDel = null;
        for (Student student : studentList) {
            if (id == student.getID()) {
                student.displayStudentInformation();
                System.out.println("Are you sure you want to delete this student? Press 1 to agree. Press other numbers to cancel");
                while (!sc.hasNextInt()) {
                    System.out.println("Please enter a number!");
                    System.out.println("Are you sure you want to delete this student? Press 1 to agree. Press other numbers to cancel");
                    sc.next();
                }
                int choice = sc.nextInt();
                if(choice == 1){
                    studentDel = student;
                } else {
                    System.out.println("The student information is remained.");
                }
            } else {
                System.out.println("Invalid");
            }
        }
        if (studentDel != null){
            studentList.remove(studentDel);
            System.out.println("Success");
        }
    }
}
