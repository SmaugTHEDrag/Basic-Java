package Baitap01;

import java.util.Scanner;


public class Fibonacci {
	public static long Fibo(int a0, int a1, int a2, int n) {
		System.out.print(a0+" "+a1+" "+a2+" ");
		for(int i=2;i<=n;i++) {
			a0=a1;
			a1=a2;
			a2=a0+a1;
			System.out.print(a2+" ");
		}
		return a2;
	}
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = input.nextInt();
		long fibo = Fibo(0,1,1,n);
	}
}
