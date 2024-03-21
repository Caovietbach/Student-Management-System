import java.util.Scanner;

public class Student {
    private int id;
    private String name;

    public Student(){

    }
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void createNewStudentInformation(Scanner sc) {
        System.out.print("\tNhap id của học sinh: ");
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a number!");
            System.out.print("\tNhap id của học sinh: ");
            sc.next();
        }
        id = sc.nextInt();
        System.out.print("\tNhap ten của học sinh: ");
        sc.nextLine();
        name = sc.nextLine();
    }
    public void displayStudentInformation() {
        System.out.println("\tId của học sinh: " + id);
        System.out.println("\tTên của học sinh: " + name);
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getID(){
        return id;
    }


}
