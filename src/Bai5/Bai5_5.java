package Bai5;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Bai5_5 {

	public static void main(String[] args) {
	  // Viết chương trình tính tiền hóa đơn
		Scanner input = new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#,###");
		System.out.println("Bảng giá:\n 1.Orange juice: 20,000 \n 2.Apple juice: 25,000");
		System.out.println(" 3.Milk coffee: 20,000 \n 4.Coffee: 15,000");
		final int donGia_1=20000, donGia_2=25000, donGia_3=20000, donGia_4=15000;
		double thanhTien=0, tongThanhTien=0;
		int loai, soLuong, tiepTuc=1; //1: tiếp tục, 0: dừng
		
		while(tiepTuc==1) {
			System.out.print("Nhập loại (1/2/3/4): ");
			loai=input.nextInt();
			System.out.print("Nhập số lượng: ");
			soLuong= input.nextInt();
			switch(loai) {
			case 1: thanhTien=soLuong*donGia_1; break;
			case 2: thanhTien=soLuong*donGia_2; break;
			case 3: thanhTien=soLuong*donGia_3; break;
			case 4: thanhTien=soLuong*donGia_4; break;
			}
			tongThanhTien+=thanhTien;
			System.out.println("Thành tiền="+df.format(thanhTien));
			System.out.print("Continue?(1:Yes, 0:No)? ");
			tiepTuc=input.nextInt();
		}
		System.out.println("--------------------------------");
		System.out.println("Tổng thành tiền="+df.format(tongThanhTien));
		input.close();
	}

}
