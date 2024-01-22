package Bai8;
import java.util.Scanner;
public class VD3 {

	public static void main(String[] args) {
		// NumberFormatException
		Scanner input=new Scanner(System.in);
		System.out.print("Nhập tên sp: ");
		String ten=input.nextLine();
		System.out.print("Nhập đơn giá > 0: "); //->donGia<=0 -> thông báo lỗi
		// float donGia = input.nextFloat();
		try {
			float donGia=Float.parseFloat(input.nextLine());
			if(donGia<=0) throw new Exception();
			System.out.print("Nhập đơn vị tính: ");
			String dvt=input.nextLine();
			System.out.print("Sản phẩm: "+ten+" - đơn giá: "+donGia+" - dvt: "+dvt);
		}catch(NumberFormatException ex) {
			System.out.println("Nhập sai kiểu số!");
		}catch(Exception e) {
			System.out.println("Nhập đơn giá phải>0!");
		}
		input.close();
	}
}
