import java.util.Scanner;

public class PenDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPens = sc.nextInt();
        int totalStudents = sc.nextInt();

        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;

        System.out.println("The Pen Per Student is " + pensPerStudent +
                " and the remaining pen not distributed is " + remainingPens);
    }
}