import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Enter grade");
        Scanner Grade = new Scanner(System.in);
        double Grade1 = Grade.nextDouble();

        if (Grade1 >100 || Grade1 <0){
            GradeTest(Grade1);



        } else {
            System.out.printf("The grade is %s.%n", Grade1);
        }

	// write your code here
    }
    public static double GradeTest (double Grade1) {
        Scanner GradeR = new Scanner(System.in);
        double Grade1R = GradeR.nextDouble();
        System.out.printf("Not a real grade. Please try again.");


        while (Grade1R > 100 || Grade1R < 0) {

            System.out.printf("Not a real grade. Please try again.");

        }

           if (Grade1R > 100 || Grade1R < 0){

               System.out.printf("The grade is %s%n",Grade1);
               Grade1 = Grade1R;
           }
           return Grade1;


    }



}
