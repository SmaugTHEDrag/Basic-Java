package Bai5;
import java.util.Scanner;
public class Bai5_3 {
	public static void main(String[] args) {
		// Nhập n. Xuất giá trị lớn nhất và nhỏ nhất của số nguyên dương
		System.out.print("Nhập n(n>0): ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int max=0, min=0;
		for(int i=1;i<=n;i++) {
			System.out.print("Nhập vào số nguyên thứ "+i+": " );
			int so=input.nextInt();
			if(i==1) {
				max=so;
				min=so;
			}
			if(so>max) max=so;
			if(so<min) min=so;
		}
		System.out.println("Max= "+max);
		System.out.println("Min= "+min);
	}
}
