package Bai2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class VD_2 {
	public static void main(String[] args) throws IOException{
		// Nhập họ tên. Xuất chào họ tên cách 1
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Nhập họ và tên cách 1: ");
		String hoTen = input.readLine(); // Nhớ chọn Add throws -> throws IOException ở main()
		System.out.print("Chào mừng bạn "+hoTen+" đến với lớp lập trình Java!\n");
		
		//// Nhập họ tên. Xuất chào họ tên cách 2
		Scanner input2 = new Scanner(System.in);
		System.out.print("Nhập họ và tên cách 2: ");
		String hoTen2 = input2.nextLine();
		System.out.print("Chào mừng bạn "+hoTen2+" đến với lớp lập trình Java!");
	}
}
