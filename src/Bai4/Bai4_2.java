package Bai4;
import java.util.Scanner;
public class Bai4_2 {

	public static void main(String[] args) {
		// Nhập số thứ nhất, toán tử (+,-,*,/) và số thứ hai
		// Hiển thị kết quả của phép tình 
		Scanner input = new Scanner (System.in);
		System.out.print("Nhấp số thứ 1: ");
		int so1 = input.nextInt();
		System.out.print("Nhập toán tử(+,-,*,/):");
		String toanTu = input.next();
		System.out.print("Nhấp số thứ 2: ");
		int so2 = input.nextInt();
		double ketQua=0;
		switch(toanTu) {
		case "+": ketQua = so1+so2; break;
		case "-": ketQua = so1-so2; break;
		case "*": ketQua = so1*so2; break;
		case "/": ketQua = so1/so2; break;
		default: System.out.println("Nhập sai toán tử (+,-,*,/)");
		return; //thoát
		}
		System.out.println(so1+toanTu+so2+"="+ketQua);
		input.close();
	}

}
