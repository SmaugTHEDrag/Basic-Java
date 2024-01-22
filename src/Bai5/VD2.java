package Bai5;
import java.util.Scanner;
public class VD2 {

	public static void main(String[] args) {
		// Nhập n -> Tính tổng từ 1 -> n
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n=input.nextInt(); //n =5
		int tong = 0;
		for (int i=1;i<=n;i++)
			tong += i;
		System.out.println("Tổng: "+tong);
		input.close();
	}

}
