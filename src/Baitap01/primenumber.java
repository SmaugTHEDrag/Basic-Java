package Baitap01;

import java.util.Scanner;

public class primenumber {
	public static boolean isPrime(int n) {
		if(n<2) return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = input.nextInt();
		for(int i=0;i<=n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
