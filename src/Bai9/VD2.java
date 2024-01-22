package Bai9;

import java.util.Scanner;

public class VD2 {

	public static void main(String[] args) {
		// Xuất danh sách hằng số trong enum Animals: 
		Scanner input = new Scanner(System.in);
		System.out.println("List of animals: ");
		for(Animal animal: Animal.values()) { // duyệt từng hằng số trong ds hằng số của enum
			System.out.println(animal);
		}
		// Xuất số lượng hằng số trong enum
		System.out.println("Số lượng hằng số trong enum: "+Animal.values().length);
		// Nhập 1 animal. Tìm animal nhập có trong ds của hằng số enum Animal không
		System.out.print("Nhập animal cần tìm: ");
		String animal_str = input.nextLine();
		try {
			Animal animal = Animal.valueOf(animal_str);
			System.out.println("Tìm thấy "+animal_str);
		}catch(IllegalArgumentException ex) {
			System.out.println("Không tìm thấy "+animal_str);
		}
//		boolean tim = false;
//		for(Animal animal:Animal.values()) {
//			if(animal.name().equals(animal_str)) {
//				tim = true;
//				break;
//			}
//		}
//		System.out.println((tim)?"Tìm thấy":"Không tìm thấy");
		input.close();
	}
}
