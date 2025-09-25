package scu.edu.csen160.lab1.test.exercise5;

public class AMain {
    public static void main(String[] args) {
        System.out.println(Exercise5.isItALeapYear(1716));
        System.out.println(Exercise5.isItALeapYear(1989));
        System.out.println(Exercise5.isItALeapYear(1992));
        System.out.println(Exercise5.isItALeapYear(2000));
        System.out.println(Exercise5.isItALeapYear(2010));
        System.out.println(Exercise5.isItALeapYear(2012));

//        Exercise5.tester();

        Exercise5 year = new Exercise5();
        System.out.println("-----------");
        System.out.println(year.leapYearInstance(1716));
        System.out.println(year.leapYearInstance(1989));
        System.out.println(year.leapYearInstance(1992));
        System.out.println(year.leapYearInstance(2000));
        System.out.println(year.leapYearInstance(2010));
        System.out.println(year.leapYearInstance(2012));
            // Insert code to check, by calling the method you have written,
            //  if the following years are leap years or not.
            // 1716,1989, 1992, 2000, 2010, 2012.
            // Test your code with other years of your choice.

            // This is a blub
    }
}
