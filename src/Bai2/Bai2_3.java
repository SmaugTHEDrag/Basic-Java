package Bai2;

import java.util.Scanner;

public class Bai2_3 {
	public static void main(String[] args) {
		// Nhập chỉ số cũ, chỉ số mới. Xuất số điện tiêu thụ, tiền điện
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập chỉ số cũ: ");
		int chiSoCu = input.nextInt();
		System.out.print("Nhập chỉ số mới: ");
		int chiSoMoi = input.nextInt();
		long soDienTieuThu = chiSoMoi - chiSoCu;
		double tienDien = soDienTieuThu * 2500;
		System.out.println("Số điện tiêu thụ: "+soDienTieuThu);
		System.out.println("Tiền điện: "+tienDien);
		input.close();
	}
}
