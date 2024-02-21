package Sorting_Algorithm;

import java.util.Scanner;

public class InsertionSort {
	
	public static void Input(int[] a, int n) {
		Scanner input = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			a[i] = input.nextInt();
		}
	}
	public static void Insertion(int[] a,int n) {
		int pos;
		int x;
		for(int i=1;i<n;i++) {
			x = a[i];
			pos = i-1;
			while((pos>=0)&&(a[pos]>x)) {
				a[pos+1] = a[pos];
				pos--;
			}
			a[pos+1]=x;
		}
	}
	public static void Output(int[] a, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// Enter the list and use Insertion Sort to sort that list
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		int[] a = new int[n];
		Input(a,n);
		Insertion(a, n);
		Output(a,n);
	}

}
