package Bai9;

import java.util.Scanner;

public class VD4 {

	public static void main(String[] args) {
		// Đèn giao thông và số giây (XANH-30, VANG-5, DO-20)
		// Nhập đèn, xuất đèn và số giây của đèn. Xuất đèn chuyển tiếp đến tiếp theo và số giây của đèn
		Scanner input=new Scanner(System.in);
		System.out.print("Nhập đèn giao thông (XANH, VANG, DO): ");
		String denGT = input.nextLine(); // denGT = "XANH"
		DenGiaoThong den=DenGiaoThong.valueOf(denGT);
		System.out.println("Đèn: "+den.name()+"-Số giây: "+den.laySoGiay());
		int index = den.ordinal(); //index của hằng số
		if(index<2) index++;
		else index=0;
		DenGiaoThong denChuyenDen = DenGiaoThong.values()[index];
		System.out.println("Đèn chuyển đến: "+denChuyenDen.name()+"-số giây: "+denChuyenDen.laySoGiay());

		input.close();
	}

}
