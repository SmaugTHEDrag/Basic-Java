package Bai5;
import java.util.Scanner;
public class VD3 {

	public static void main(String[] args) {
		// Nhập các điểm số >= 0 cho đến khi nhập số -1 thì dừng 
		// Tính tổng các điểm số>=0
		Scanner input = new Scanner(System.in);
		int diem = 0, tong = 0;
//		while (diem>=0) { // đk dừng: điểm < 0
//			tong+=diem; //tong = 5+7+8
//			System.out.println("Nhập điểm >= 0(nhập -1 thì dừng): ");
//			diem = input.nextInt(); // diem = 5 7 8 -1
////			if(diem<0) break;
////			tong +=diem; // tong = 5+7+8
//		}
		
		while (true) {
			tong+=diem; // tong=5+7+8
			System.out.print("Nhập điểm>=0(nhập -1 dừng): ");
			diem = input.nextInt(); //diểm = 5 7 8 -1
			if(diem<0) break;
		}
		System.out.println("Tổng điểm="+ tong);
		input.close();
		}
	}

