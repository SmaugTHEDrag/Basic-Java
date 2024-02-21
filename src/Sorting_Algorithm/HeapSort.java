package Sorting_Algorithm;

import java.util.Scanner;

public class HeapSort {
    public static void heapify(int arr[], int n, int i) {
        // Find largest among root, left child and right child
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
    
        if (l < n && arr[l] > arr[largest])
          largest = l;
    
        if (r < n && arr[r] > arr[largest])
          largest = r;
    
        // Swap and continue heapifying if root is not largest
        if (largest != i) {
          int swap = arr[i];
          arr[i] = arr[largest];
          arr[largest] = swap;
    
          heapify(arr, n, largest);
        }
      }
	public static void HeapSort(int a[], int n) {
        n = a.length;
    
        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
          heapify(a, n, i);
        }
    
        // Heap sort
        for (int i = n - 1; i >= 0; i--) {
          int temp = a[0];
          a[0] = a[i];
          a[i] = temp;
    
          // Heapify root element
          heapify(a, i, 0);
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
		// Enter list of number and use HeapSort to sort that list
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		int[] a = new int[n];
		Input(a, n);
		HeapSort(a,n);
		Output(a,n);
	}

}
