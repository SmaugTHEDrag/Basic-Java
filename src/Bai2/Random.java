package Bai2;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        // Math.random() generates random number from 0.0 to 0.999
        // Hence, Math.random()*5 will be from 0.0 to 4.999
        double doubleRandomNumber = Math.random() * 5;
        System.out.println("doubleRandomNumber = " + doubleRandomNumber);
        // cast the double to whole number
        int randomNumber = (int)doubleRandomNumber;
        System.out.println("randomNumber = " + randomNumber);
    }
}
