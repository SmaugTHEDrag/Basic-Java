package Bai7;
import java.util.Scanner;
public class VD1 {
	//Phương thức không trả về kết quả
	// static: gọi pt thông qua tên class chứa nó
	public static void kiemTraSoNT(int x) {
		boolean soNT=true;
		if(x<2) soNT=false;
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				soNT=false;
				break;
			}
		}
		System.out.println((soNT==true)?"Là số nguyên tố":"Không là số nguyên tố");
	}
	//Phương thức CÓ trả về kết quả 
	public static boolean soNguyenTo(int x) {
		boolean soNT=true;
		if(x<2) soNT=false;
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				soNT=false;
				break;
			}
		}
		return soNT;
	}
	public static void main(String[] args) {
		// Nhập vào số nguyên x. Cho biết x có phải số nguyên tố không?
		// Số NT là số chỉ chia hết cho 1 và chính nó
		// x=5->5 chia hết cho 1 và cho 5 -> 5 là số NT
		// x=4->4 chia hết cho 1,2 và 4 -> 4 không là sô NT
		// x=1->1 không là sô NT
		Scanner input=new Scanner(System.in);
		System.out.print("Nhập x: ");
		int x=input.nextInt(); //x=5
		// kiemTraSoNT(x); // gọi pt không trả về kết quả
		boolean soNT=soNguyenTo(x); //gọi pt CÓ trả về kết quả
		System.out.println((soNT==true)?"Là số nguyên tố":"Không là số nguyên tố");
		input.close();
	}

}
