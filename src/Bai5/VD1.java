package Bai5;
import java.util.Scanner;
public class VD1 {

	public static void main(String[] args) {
		// Nhâp n xuất 5 4 3 2 1
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = input.nextInt(); // n = 5 => 5,4,3,2,1
		for (int i=n;i>=0;i--)
			System.out.println(i); //5,4,3,2,1
//		do {
//			System.out.println(n);
//			n--;
//		}while(n>=1);
//		
//		while (n>=1) {
//			System.out.println(n); //5,4,3,2,1
//			n--;
//		}
//		input.close();
	}

}
