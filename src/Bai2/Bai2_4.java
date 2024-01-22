package Bai2;

import java.util.Scanner;

public class Bai2_4 {

	public static void main(String[] args) {
		// Nhập lãi suất một năm, số tiên gửi, số tháng gửi. Xuất tiền lãi, Tổng số tiên
		Scanner input = new Scanner(System.in);
		System.out.print("Lãi suất một năm: ");
		float laiSuat = input.nextFloat();
		System.out.print("Số tiền gửi: ");
		double tienGui = input.nextDouble();
		System.out.print("Số tháng gửi: ");
		int thangGui = input.nextInt();
		double tienLai = (tienGui*thangGui)*(laiSuat/100/12);
		double tongSoTien = tienGui + tienLai;
		System.out.println("Tiền lãi "+ String.format("%.2f", tienLai));
		System.out.println("Tổng số tiền = "+ String.format("%.2f", tongSoTien));
	}

}
