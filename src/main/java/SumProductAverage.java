
import java.util.Scanner;

public class SumProductAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // obtain number of runs
        System.out.print("How many times would you like to run the program? ");
        int numRuns = sc.nextInt();
        System.out.println();
         
        for (int j=0; j<numRuns; j++)
        {
            System.out.print("Enter three numbers:  ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double num3 = sc.nextDouble();
            System.out.println();

            // compute and output sum
            double sum = num1 + num2 + num3;
            System.out.println("The sum of your numbers is " + sum);

            // compute and output product
            double prod = num1 * num2 * num3;
            System.out.println("The product of your numbers is " + prod);

            // compute and output average
            double avg = sum / 3;
            System.out.println("The average of your numbers is " + avg);
            System.out.println();
        }
    }
}
