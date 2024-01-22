package Bai9;

import java.util.Scanner;

public class VD3 {

	public static void main(String[] args) {
		// Nhập vào 2 số nguyên. Tính tổng hiệu tích thương của 2 số nguyên
		Scanner input=new Scanner(System.in);
		System.out.print("Nhập vào số nguyên thứ 1: ");
		int so1=input.nextInt();
		System.out.print("Nhập vào số nguyên thứ 2: ");
		int so2=input.nextInt();

		PhepToan tong = PhepToan.TONG;
		double kqTong= tong.tinh(so1, so2);
		System.out.println("Tổng= "+kqTong);
		System.out.println("Hiệu= "+PhepToan.HIEU.tinh(so1, so2));
		System.out.println("Tích= "+PhepToan.TICH.tinh(so1, so2));
		System.out.println("Thương= "+PhepToan.THUONG.tinh(so1, so2));
		input.close();

	}

}
