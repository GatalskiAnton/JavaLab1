import java.util.Scanner;
import java.lang.Math;

public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        System.out.print("Enter precision: ");
        double precision = sc.nextDouble();
        double sum = 0;
        double currentTerm = 0;
        int k = 1;

        do {
            currentTerm = (Math.pow(-1,k) * Math.pow(x,k)) / Math.pow(k+1,2);
            sum += currentTerm;
            k += 2;
        }while (currentTerm >= precision);
        System.out.println(sum);
    }
}
