package org.example.ch2.endOfChapterExercises;
import java.util.Scanner;
public class TwentyCalculateInterest {
//    Financial application: calculate interest) If you know the balance and the annual
//percentage interest rate, you can compute the interest on the next monthly payment using the following formula:
//interest = balance * (annualInterestRate/1200)
//Write a program that reads the balance and the annual percentage interest rate and
//displays the interest for the next month. Here is a sample run:
    public static void main(String[] args){
//Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
//The interest is 2.91667
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double interest = input.nextDouble();

        double interestForNextMonth = balance * (interest/1200);
        System.out.println("The interest is " + interestForNextMonth);
    }
}
