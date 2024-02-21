package Sorting_Algorithm;

import java.util.Scanner;

public class BubbleSort {

	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void Bubble(int a[], int n) {
		for(int i=0;i<n;i++) {
			for(int j=0; j<n-i-1; j++) {
				if(a[j]>a[j+1])
					swap(a, j, (j+1));
			}
		}
	}
	public static void Input(int a[], int n) {
		Scanner input = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			a[i] = input.nextInt();
		}
	}
	public static void Output(int a[], int n) {
		System.out.println("After Bubble Sort");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// Enter the list of number then use Bubble Sort to sort the list
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		int a[] = new int[n];
		Input(a, n);
		Bubble(a, n);
		Output(a, n);
	}

}
