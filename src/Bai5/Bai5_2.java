package Bai5;
import java.util.Scanner;

public class Bai5_2 {

	public static void main(String[] args) {
		// Nhập chiều dài chiều rộng hcn. Xuất hình chữ nhật có m dáu * và chiều rộng có n dấu *
		System.out.println("Nhập chiều dài và chiều rông hình chữ nhật");
		Scanner input = new Scanner(System.in);
		System.out.print("Chiều dài m = ");
		int m = input.nextInt();
		System.out.print("Chiều rộng n = ");
		int n = input.nextInt();
		for(int i=1;i<=n;i++) {
			String chuoi="";
			for(int j=1; j<=m; j++)
			 chuoi+="*";
			System.out.println(chuoi);
		}
		input.close();
	}
}
