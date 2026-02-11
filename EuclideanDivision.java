import java.sql.SQLOutput;
import java.util.Scanner;
/**
 * This program prompts the user for the dividend and divisor and displays the quotient
 * and remainder using Euclidean Division.
 * @author William & Vince
 */
public class EuclideanDivision {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int dividend;
        int divisor;
        int quotient;
        int remainder;
        System.out.println("Euclidean Division");
        System.out.println("Enter the dividend");
        dividend = input.nextInt();
        System.out.println("Enter the divisor");
        divisor = input.nextInt();
        quotient = dividend/divisor;
        remainder = dividend%divisor;
        System.out.println(dividend + " " + "=" + " " +
                                divisor + " " + "*" + " " + quotient + " "
                           + "+" + " " + remainder);

    }
}