package Bai5;
import java.util.Scanner;
public class Bai5_1 {

	public static void main(String[] args) {
		// Nhập n>0. Xuất ra hình tam giác vuông có canh = n dấu *
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = input.nextInt();
		String chuoi = "";
		for(int i=1;i<=n;i++) { //i->n
			chuoi+="*";
			System.out.println(chuoi);
		}

//		for(int i=1;i<=n;i++) {
//			for(int j=1; j<=i;j++)
//			System.out.print("*");
//		System.out.println();
//	    }
		input.close();
	}
}
