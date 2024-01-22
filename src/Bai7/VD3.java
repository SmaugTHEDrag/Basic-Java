package Bai7;

public class VD3 {
	
	public static double diemTB(double... dsDiem) {//tham số không xác định
		double tong=0;
		for(double diem : dsDiem) {// duyệt từng giá trị điểm trong ds điểm
			tong+=diem;
		}
		return tong/dsDiem.length; //tổng/số lượng điểm
		
	}
	public static void main(String[] args) {
		// Tính điểm trung bình
		double diemTrungBinh=diemTB(10,5,6,7,8,9);
		System.out.println("Điểm trung bình = "+diemTrungBinh);
	}
}
