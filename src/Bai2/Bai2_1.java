package Bai2;

import java.util.Scanner;
public class Bai2_1 {

	public static void main(String[] args) {
		// Nhập bán kính. Xuất chu vi và diện tích hình tròn
		System.out.print("Nhập bán kính: ");
		Scanner input = new Scanner(System.in);
		float ban_kinh = input.nextFloat();
	    final float PI = 3.1415f;
	    double chuVi = 2 * ban_kinh * PI;
		System.out.println("Chu Vi là "+(String.format("%.2f", chuVi)));
		double dienTich = PI * ban_kinh * ban_kinh;
		System.out.println("Diện tích là "+(String.format("%.2f", dienTich)));
	}

}
