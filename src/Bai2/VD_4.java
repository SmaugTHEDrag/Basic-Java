package Bai2;

import java.util.Scanner;

public class VD_4 {

	public static void main(String[] args) {
		// Nhập tên sản phẩm, đơn giá, dvt và Xuất thông tin sản phẩm
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập tên sản phẩm: ");
		String ten_sp = input.nextLine();
		System.out.print("Đơn giá: ");
		float donGia = input.nextFloat();
		System.out.print("Nhập đơn vị tính: ");
		String dvt = input.next();
		System.out.println("Tên sản phẩm: "+ten_sp+" - Đơn giá: "+donGia+" - Đơn vị tính:"+dvt);
		input.close();
	}

}
