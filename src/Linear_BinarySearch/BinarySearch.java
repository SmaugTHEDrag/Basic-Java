package Linear_BinarySearch;

import java.util.Scanner;

public class BinarySearch {

	public static void ListNumber(int []a, int n) {
		Scanner input = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			a[i] = input.nextInt();
		}
	}
	public static boolean BinarySearch(int[] a, int n, int x) {
		int i=0, j=n-1, m;
		while(i<=j) {
			m=(i+j)/2;
			if(a[m]==x) return true;
			else if(x>a[m]) i=m+1;
			else j=m-1;
		}
		return false;
	}
	public static void main(String[] args) {
		// Use binary search to find number in the list
		Scanner input = new Scanner (System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		int[] a= new int[n];
		System.out.println("List of number: ");
		ListNumber(a, n);
		System.out.println("Number to find: ");
		int x = input.nextInt();
		boolean Binary = BinarySearch(a, n, x);
		if(Binary) System.out.println("Number is in the list");
		else System.out.println("Number is not in the list");
	}

}
