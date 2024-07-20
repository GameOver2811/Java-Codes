import java.util.Scanner;

public class ArrayQuesions {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter no. of Subjects : ");
            int subCount = sc.nextInt();

            int[] subjectMarks = new int[subCount];
            System.out.println("Enter Marks for each subjects : ");
            for(int i = 0; i < subjectMarks.length; i++) {
                subjectMarks[i] = sc.nextInt();
            }

            int totalMarks = 0;
            for(int i : subjectMarks) {
                totalMarks += i;
            }
            System.out.println(totalMarks +" "+ subCount);
            double per = (10*totalMarks)/(subCount);
            System.out.println("Percentage for this student id : "+ per);
        }

    }
}
