package org.example;
import java.util.Scanner;
import java.util.Calendar;

public class App 
{
    public static void main( String[] args )
    {
        int age, retirementAge, yearsUntilRetirement, retirementYear;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        Scanner input = new Scanner(System.in);
        System.out.print("What is your current age? ");
        age = input.nextInt();
        System.out.print("At what age would you like to retire? ");
        retirementAge = input.nextInt();
        yearsUntilRetirement = retirementAge - age;
        retirementYear = currentYear + yearsUntilRetirement;
        System.out.println("You have " + yearsUntilRetirement + " years until you can retire.");
        System.out.println("It's " + currentYear + ", so you can retire in " + retirementYear + ".");


    }
}
