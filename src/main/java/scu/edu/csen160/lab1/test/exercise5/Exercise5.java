package scu.edu.csen160.lab1.test.exercise5;

import java.util.Scanner;

public class Exercise5 {
	public static boolean isItALeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		// This method should check if the parameter year is a leap year and return a true.
		// Otherwise a false.

		// A leap year is a year that is divisible by 4 and not by hundred  OR
		// it is divisible by 400.

		// Complete the code segment. Fix any errors in the method signature.
	}

    public static void tester(){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        while(year != 0){
            System.out.println(isItALeapYear(year));
            year = sc.nextInt();
        }
    }

    public boolean leapYearInstance(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}