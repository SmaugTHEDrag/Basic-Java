package Bai4;
import java.util.Scanner;
public class VD2 {

	public static void main(String[] args) {
		// Nhập a, b, c, d. Tìm max, min trong 4 số
		Scanner input = new Scanner (System.in);
		System.out.print("Nhập số a: ");
		int a = input.nextInt(); // a = 15 -> max =15, min = 15
		System.out.print("Nhập số b: ");
		int b = input.nextInt(); // b = 10 -> max =15, min = 10
		System.out.print("Nhập số c: ");
		int c = input.nextInt(); // c = 30 -> max =30, min = 15
		System.out.print("Nhập số d: ");
		int d = input.nextInt(); // d = 15 -> max =30, min = 15
		// Cách 1:
//		int max = a, min = a;
//		if (b>max) max = b;
//		if (c>max) max = c;
//		if (d>max) max = d;
//		if (b<min) min = b;
//		if (c<min) min = c;
//		if (d<min) min = d;
		
		// Cách 2:
		int max1 = (a>b)?a:b;
		int max2 = (c>d)?c:d;
		int max = (max1>max2)?max1:max2;
		int min1 = (a<b)?a:b;
		int min2 = (c<d)?c:d;
		int min = (min1<min2)?min1:min2;
		
		System.out.println("Max = "+max);
		System.out.println("Min = "+min);
		input.close();
	}

}
