package Array;

import java.util.Scanner;

public class test02_2D {

	public static void Input(int arr[][], int n, int m) {
		Scanner input = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = input.nextInt();
			}
		}
	}
	public static void Output(int arr[][], int n, int m) {
		Scanner input = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]+=arr[i][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ma trận 2 chiều");
		System.out.println("Nhập dòng: ");
		int n = input.nextInt();
		System.out.println("Nhập cột: ");
		int m = input.nextInt();
		int arr[][] = new int[50][50];
		System.out.println("Nhập các số: ");
		Input(arr, n, m);
		Output(arr,n,m);
	}

}
