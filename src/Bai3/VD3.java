package Bai3;

public class VD3 {
	public static void main(String[] args) {
	//Toán tử quan hệ so sánh
	int x = 4;
	int x2 = 6;
	System.out.println("x>x2:"+(x>x2));
	System.out.println("x<x2:"+(x<x2));
	System.out.println("x==x2:"+(x==x2));
	
	//So sánh 2 biến kiểu String (kiểu tham chiếu)
	String s1="abc";
	String s2="abc";//s1 và s2 chứa cùng địa chỉ
	String s3 = new String("abc"); // s3 chứa địa chỉ khác
	//
	//
	System.out.println("So sánh s1==s2: "+(s1==s2));
	System.out.println("So sánh s1==s3: "+(s1==s3));
	System.out.println("So sánh s1.equals(s2): "+s1.equals(s2));
	System.out.println("So sánh s1.equals(s3): "+s1.equals(s3));
}
}
