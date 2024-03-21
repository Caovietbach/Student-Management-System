
import java.util.ArrayList;

import java.util.Scanner;

public class studentController {
    private ArrayList<Student> studentList;

    public studentController(){
        studentList = new ArrayList<>(10);
    }

    public void addStudent(Scanner sc){
        Student student;

        System.out.print("Nhap số lượng sinh viên: ");
        int n = sc.nextInt();

        System.out.println("Nhap danh sach sinh vien: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1) + " la:");
            student = new Student();
            student.addStudent(sc);
            studentList.add(student);
        }
    }

    public void viewStudent(){
        for(Student s: studentList){
            s.displayStudentInformation();
            System.out.println("+++++");
        }
    }

    public void editStudentInformation(String name){
        Scanner sc = new Scanner(System.in);
        for (Student student : studentList) {
            if (name.equals(student.getName())) {
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

    public void deleteStudentInformation(String name){
        Scanner sc = new Scanner(System.in);
        Student studentDel = null;
        for (Student student : studentList) {
            if (name.equals(student.getName())) {
                student.displayStudentInformation();
                System.out.println("Are you sure you want to delete this student? Press 1 to agree. Press others to cancel");
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
