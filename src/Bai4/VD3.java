package Bai4;
import java.util.Scanner;
public class VD3 {

	public static void main(String[] args) {
		// Nhập loại phòng -> biết đơn giá của loại phòng đó
		// loại A: 800, loại B: 600, loại C: 400, loại D = 200
		Scanner input = new Scanner (System.in);
		System.out.print("Nhập loại phòng (A,B,C,D): ");
		String loai = input.nextLine(); // loai "A"
		double donGia=0;
		switch(loai) {
		case "A":
			donGia = 800; break;
		case "B":
			donGia = 600; break;
		case "C":
			donGia = 400; break;
		case "D":
			donGia = 200; break;
		default: 
			System.out.println("Nhập loại chưa đúng!");
		}
		System.out.println("Đơn giá="+donGia);
		input.close();
	}

}
