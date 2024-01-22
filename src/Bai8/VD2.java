package Bai8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VD2 {

	public static void main(String[] args) {
		// InputMisdmatchException
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập bán kính: ");
		float r=0;
		try {
			r=input.nextFloat();
		}catch(InputMismatchException ex) {
			System.out.println("Nhập sai kiểu dữ liệu!");
			return; //thoát
		}finally {
			
		}
		double chuVi = 2*Math.PI*r;
		double dienTich = Math.PI*r;
		System.out.println("Chu vi = "+String.format("%.2f", chuVi));
		System.out.println("Diện tích = "+String.format("%.2f", dienTich));
		input.close();
	}
}
