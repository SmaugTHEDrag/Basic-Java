package Sorting_Algorithm;

import java.util.Collections;
import java.util.Scanner;

public class SelectionSort {

	public static void swap(int[] a,int m, int i) {
		int temp = a[m];
		a[m] = a[i];
		a[i] = temp;
	}
	public static void Selection(int[] a, int n) {
		int m;
		for(int i=0;i<n-1;i++) {
			m = i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[m])
					m=j;
			}
		if(m!=i)
			swap(a, m, i);
		}
	}
	public static void Input(int[] a, int n) {
		Scanner input = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			a[i] = input.nextInt();
		}
	}
	public static void Output(int[] a, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// Use selection sort to sort the list
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		int[] a = new int[n];
		Input(a,n);
		Selection(a,n);
		System.out.println("List after selection sort: ");
		Output(a, n);
	}

}
