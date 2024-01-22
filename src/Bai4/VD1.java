package Bai4;
import java.util.Scanner;
public class VD1 {

	public static void main(String[] args) {
		// Nhập điểm trung bình - xét kết quả (Đậu/Rớt) - xếp loại (Xuất sác, Giổi, Khá, TB, yếu)
		Scanner input = new Scanner (System.in);
		System.out.print("Nhập điểm trung bình: ");
    	float diemTB = input.nextFloat();
//		String ketQua;
//		if (diemTB >= 5)
//			 ketQua = "Đậu";
//		else ketQua = "Rớt";
		String ketQua = (diemTB>=5)?"Đậu":"Rớt";
		System.out.println("Kết quả: "+ketQua);
		String loai;
		if(diemTB<5)
			loai = "Yếu";
		else if(diemTB<6)
			loai = "Trung bình";
		else if(diemTB<7)
			loai = "Trung bình khá";
		else if(diemTB<8)
			loai = "Khá";
		else if(diemTB<9)
			loai = "Giỏi";
		else loai ="Xuất sắc";
		System.out.println("Xếp loại: "+loai);
		input.close();
	}

}
