package Bai4;

import java.util.Scanner;

public class Bai4_4 {

	public static void main(String[] args) {
		// Nhập năm dương lịch. Tính năm âm lịch
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập năm dương lịch: ");
		int nam = input.nextInt();
		String can="", chi="";
		switch(nam%10) {
		case 0: can="Canh"; break;
		case 1: can="Tân"; break;
		case 2: can="Nhâm"; break;
		case 3: can="Quý"; break;
		case 4: can="Giáp"; break;
		case 5: can="Ất"; break;
		case 6: can="Bính"; break;
		case 7: can="Đinh"; break;
		case 8: can="Mậu"; break;
		case 9: can="Kỷ"; break;
		}
		switch(nam%12) {
		case 0: chi="Thân"; break;
		case 1: chi="Dậu"; break;
		case 2: chi="Tuất"; break;
		case 3: chi="Hợi"; break;
		case 4: chi="Tý"; break;
		case 5: chi="Sửu"; break;
		case 6: chi="Dần"; break;
		case 7: chi="Mẹo"; break;
		case 8: chi="Thìn"; break;
		case 9: chi="Tỵ"; break;
		case 10: chi="Ngọ"; break;
		case 11: chi="Mùi"; break;
		}
		System.out.println("Năm âm lịch: "+can+" "+chi);
		input.close();
	}

}
