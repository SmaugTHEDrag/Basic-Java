package Bai5;
import java.util.Scanner;

public class Bai5_4 {

	public static void main(String[] args) {
		// Nhập vào điểm số>=0 khi nhập điểm -1 thì dừng
		//-> Tính điểm trung bình
		Scanner input = new Scanner(System.in);
		int diem=0, tong=0;
		int dem=0; //đếm số lượng điểm >=0
		System.out.print("Average of scores >=0 (Enter -1 to exit): ");
		while(diem>=0) {
			tong+=diem;
			System.out.println("Enter score(Enter -1 to exit): ");
			diem=input.nextInt(); //diem=-1
			dem++;
		}
		if(dem>1) {
			float diemTB = (float)tong/(dem-1);
			System.out.println("Average="+String.format("%.2f",diemTB));
		}
		System.out.println("End");
		input.close();
	}
}
