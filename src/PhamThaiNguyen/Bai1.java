package PhamThaiNguyen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// Viết chương trình cho chọn nghĩa của từ grapes như trong hình
		Scanner input = new Scanner(System.in);
		System.out.println("Choose right meaning of word 'grapes'\n1. bưởi\n2. cam\n3. chanh\n4. nho\n5. táo");

		String decision;
		boolean yn = true;
		try {
		while (yn) {
		System.out.print("Enter 1->5 or Enter -1 to exit: ");
		int number=input.nextInt();
		if(number<1 && number>5) return;
		switch(number) {
		case 1: case 2: case 3: case 5:  
			System.out.println("Wrong!"); break;
		case 4:
			System.out.println("Right!");
			System.out.println("Right meaning of grapes: 4. nho");
			System.out.println("End!");
			return;
		}
		System.out.println("Again!(Y/N)");
		decision = input.next();
		switch(decision) {
		case "yes": case "y": case "Y": case "YES":
			yn= true; break;
		case "no": case "n": case "N": case "NO":
			yn= false; break;
		}
		}}catch(InputMismatchException ex) {
			System.out.println("Nhập sai kiểu dữ liệu!");
		}
		input.close();

	}

}
