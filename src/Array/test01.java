package Array;

import java.util.Arrays;
import java.util.Scanner;

public class test01 {

//    public static void Xuat(String arr[]) {
//    Scanner input = new Scanner(System.in);
//	for(String car:arr) {
//		System.out.println(car);
//	}
//   }
	public static void Nhapso(int number[], int n) {
		Scanner input = new Scanner(System.in);
		for(int i=0;i<=n;i++) {
			number[i]=input.nextInt();
		}
	}
	public static void Xuatso(int number[], int n) {
		Scanner input = new Scanner(System.in);
		for(int i=0;i<=n;i++) {
			System.out.println(number[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Input number of cars: ");
//		Scanner input = new Scanner(System.in);
//		String[]cars = new String[] {"BMW", "Toyota", "Chervolet", "Ferrari"};
//		Arrays.sort(cars);
//		Xuat(cars);
		
		System.out.println("Input the amount of numbers");
		Scanner input = new Scanner(System.in);
		int n= input.nextInt();
		int[] number = new int[n*2];
		Nhapso(number,n);
		Arrays.sort(number);
		Xuatso(number,n);
	}
}
