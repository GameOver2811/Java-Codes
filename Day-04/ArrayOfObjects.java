import java.util.Arrays;
import java.util.Scanner;

class Students {
    private int id;
    private String name;

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{id=" + id + ", name='" + name + "'}";
    }

}

public class ArrayOfObjects {

    public static void main(String[] args) {
        System.out.println("Enter Number of Students you want to enter");
        Scanner sc = new Scanner(System.in);
        int noOfStudents = sc.nextInt();
        Students[] jpr = new Students[noOfStudents];
        for(int i = 0; i < noOfStudents; i++) {
            System.out.println("Enter Id : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name : ");
            String name = sc.nextLine();
            jpr[i] = new Students(id, name);
        }
        System.out.println(Arrays.toString(jpr));
    }

}
