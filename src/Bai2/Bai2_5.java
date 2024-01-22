package Bai2;
import java.util.Scanner;
public class Bai2_5 {
	public static void main(String[] args) {
		// Nhập chu vi. Xuất Diện tích
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập chu vi hình chữ nhật: ");
		double chuVi = input.nextDouble();
		double chieuRong;
		chieuRong = (chuVi/2)/2.5;
		double chieuDai = chieuRong*1.5;
		double dienTich = chieuRong * chieuDai;
		System.out.print("Diện tích hình chữ nhật = "+dienTich);
	}
}
