package Baitap01;

import java.util.Scanner;

public class giaithua {
	
	public static long Giaithua(int n) {
		int S=1;
		for(int i=1;i<=n;i++) {
			S*=i;
		}
		return S;
	}
	public static void main(String[] args) {
		System.out.print("Nhập n: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long giaithua = Giaithua(n);
		System.out.println("Giai thừa: "+giaithua);
	}

}
