package scu.edu.csen160.lab1.test.exercise7;

public class AMain {
    public static void main (String [] args){
        // Generate 10 numbers in the range of 0-10
        int[] list = new int[2];
        list[0] = 0;
        list[1] = 10;
        Exercise7.genRandNum(list, 10);
    }
}
