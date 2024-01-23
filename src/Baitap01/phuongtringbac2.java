package Baitap01;

import java.util.Scanner;

public class phuongtringbac2 {
	public static boolean laPhuongTrinhbac2(int a, int b, int c) {
		return a!=0;
	}
	
	public static String loaiPhuongtrinh(int a, int b, int c) {
		if(laPhuongTrinhbac2(a,b,c)) {
			double delta = b*b - 4*a*c;
			if(delta>0) {
				double x1=((-b+Math.sqrt(delta))/(2*a));
				double x2=((-b-Math.sqrt(delta))/(2*a));
				System.out.println("Phương trình có 2 nghiệm: x1 = "+x1+" và "+"x2 = "+x2);
				return "Phương trình có 2 nghiệm";
			}
			else if(delta==0){
				System.out.println("Phương trình có nghiệm kép: x1 = x2 = "+(-b/2*a));
				return "Phương trình có nghiệm kép";
			}
			else {
				System.out.println("Phương trình vô nghiệm");
				return "Phương trình vô nghiệm";
			}
		}
		if(!laPhuongTrinhbac2(a,b,c)&&b==0)
			return "Không tồn tại";
		return "Không phải phương trình bậc 2";
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập a: ");
		int a = input.nextInt();
		System.out.println("Nhập b: ");
		int b = input.nextInt();
		System.out.println("Nhập c: ");
		int c = input.nextInt();
		String result = loaiPhuongtrinh(a,b,c);
	}
}
