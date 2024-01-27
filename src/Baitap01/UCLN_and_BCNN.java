package Baitap01;

import java.util.Scanner;

public class UCLN_and_BCNN {
	public static int UCLN(int a, int b) {
		if (b==0) return a;
		else return UCLN(b, (a%b));
	}
	public static int BCNN(int a, int b) {
		return (a*b)/UCLN(a,b);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập a: ");
		int a = input.nextInt();
		System.out.print("Nhập b: ");
		int b = input.nextInt();
		System.out.println("Ước chung lớn nhất: "+UCLN(a,b));
		System.out.println("Bội chung nhỏ nhất: "+BCNN(a,b));
	}

}
