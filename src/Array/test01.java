package Array;

import java.util.Arrays;
import java.util.Scanner;

public class test01 {

    public static void Xuat(String arr[]) {
    Scanner input = new Scanner(System.in);
	for(String car:arr) {
		System.out.println(car);
	}
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input number of cars: ");
		Scanner input = new Scanner(System.in);
		String[]cars = new String[] {"BMW", "Toyota", "Chervolet", "Ferrari"};
		Arrays.sort(cars);
		Xuat(cars);
	}
}
