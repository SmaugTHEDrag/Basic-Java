package Baitap01;

import java.util.Scanner;

public class Fibonacci_prime {
	public static void Fibo(int a0, int a1, int a2, int n) {
		for(int i=2;i<=n;i++) {
			a0=a1;
			a1=a2;
			a2=a0+a1;
			if(primenumber.isPrime(a2)&& a2<=n)
			System.out.print(a2+" ");
		}
	}
	public static void main(String[] args) {
		// Nhập n, Xuất các số fibonacci < n và là prime
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = input.nextInt();
        Fibo(0,1,1,n);
	}

}
