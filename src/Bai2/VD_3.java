package Bai2;

import java.util.Scanner;

public class VD_3 {

	public static void main(String[] args) {
		// Nhập 2 số nguyên và tính tổng 
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập số nguyên thứ nhất: ");
		int so1 = input.nextInt();
		System.out.print("Nhập số nguyên thứ hai: ");
		int so2 = input.nextInt();
		long tong = so1 + so2;
		System.out.print("Tổng = " + tong);
		input.close();
	}
}
