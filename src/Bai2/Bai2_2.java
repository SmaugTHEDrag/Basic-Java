package Bai2;

import java.util.Scanner;

public class Bai2_2 {

	public static void main(String[] args) {
		// Nhập diện tích hình tròn. Xuất bán kính 
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập diện tích hình tròn: ");
		double dienTich = input.nextDouble();
		// float ban_kinh = (float)Math.sqrt(dienTich); // chuyển tường mình double -> float
		double ban_kinh = Math.sqrt(dienTich/Math.PI);
		System.out.println("Bán kính = "+ String.format("%.2f", ban_kinh));
		input.close();
	}

}
