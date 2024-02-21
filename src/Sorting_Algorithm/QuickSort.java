package Sorting_Algorithm;

import java.util.Scanner;

public class QuickSort {

	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void Quick(int a[], int left, int right) {
		int i = left, j = right;
		int x = a[(left+right)/2];
		while(i<=j) {
			while(a[i]<x) i++;
			while(a[j]>x) j--;
			if(i<=j) {
				swap(a,i,j);
				i++; j--;
			}
		}
		if(left<i) Quick(a,left, j);
		if(right>i) Quick(a,i,right);
	}
	public static void Input(int a[], int n) {
		Scanner input = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			a[i] = input.nextInt();
		}
	}
	public static void Output(int a[], int n) {
		System.out.println("After QuickSort: ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// Enter a list of number and use QuickSort to sort that list
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		int []a = new int[n];
		Input(a,n);
		Quick(a, 0, (n-1));
		Output(a,n);

	}

}
