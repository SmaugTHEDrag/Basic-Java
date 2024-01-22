package Bai9;

import java.util.Scanner;

public class VD1 {

	public static void main(String[] args) {
		// Tập hợp các hằng số về: RED, BLUE, GREEN, WHITE, BLACK
		// gán giá trị cố định
		Scanner input = new Scanner(System.in);
		Colors color = Colors.BLUE; 
		try {
		System.out.println("Color 1: "+color);
		System.out.println("Nhập color 2:");
		String color_str = input.nextLine();

		// gán giá trị động
		Colors color2 = Colors.valueOf(color_str); 
		System.out.println("Color 2: "+color2.name());
		}catch(IllegalArgumentException ex) {
			System.out.println("Chỉ nhập những màu có trong enum!");
		}
		//gán giá trị theo index
		System.out.print("Nhập index: ");
		int index = input.nextInt(); 
		Colors color3=Colors.values()[index]; 
		System.out.println("Color 3: "+color3.name());
		input.close();
	}

}
