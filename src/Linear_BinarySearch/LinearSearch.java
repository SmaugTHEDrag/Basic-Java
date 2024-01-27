package Linear_BinarySearch;

import java.util.Scanner;

public class LinearSearch {
	
	public static void InputList(int a[], int n) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter list of number: ");
		for(int i=0;i<n;i++) {
			a[i] = input.nextInt();
		}
	}
	
	public static boolean Searching(int a[], int n, int x) {
		for(int i=0;i<n;i++) {
			if(x==a[i]) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// Nhập list và tìm số. Xuất có số trong list hay không 
		Scanner input = new Scanner (System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		int [] a = new int[n];
		InputList(a, n);
		// Nhập số cần tìm 
		System.out.println("Enter x: ");
		int x = input.nextInt();
		boolean search = Searching(a, n, x);
		if(search) System.out.println("Number is in list");
		else System.out.println("Number is not in the list");
	}

}
