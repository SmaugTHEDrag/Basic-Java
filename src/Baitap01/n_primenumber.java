package Baitap01;

import java.util.Scanner;

public class n_primenumber {
	
	public static void main(String[] args) {
		// Nhập n, Xuất n số nguyên tố đầu tiên
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = input.nextInt();
		int count=1;
		  for(int i = 0;count<=n;i++) {
			if(primenumber.isPrime(i)) {
				System.out.print(i+" ");
				count++;
			}
		  }
	}
}
