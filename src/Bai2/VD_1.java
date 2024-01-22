package Bai2;

public class VD_1 {

	public static void main(String[] args) {
		// Kiểu dữ liệu - khai báo biến
		int so; // kiểu cơ sở (biến chứa giá trị)
		so = 20;
		long so2 = 100;
		so2 = so; // chuyển ngầm định (int->long)
		int so3;
		so3 = (int)so2; // chuyển tường minh (long->int)
		float x = 4.5f;
		double y = 20.5;
		
		final double PI = 3.14; // PI hằng số
		// PI = 3.15
		
		String ten = "Nguyen"; // Kiểu tham chiếu
		// vd: biến chứa địa chỉ FF00. Tại ô nhớ có địa chỉ F00 chứa "Nguyen"
		Byte z = 100;//kiểu tham chiếu
		byte t =z.byteValue();
		/*
		 * byte->Byte
		 * short->Short
		 * int->Integer
		 * long->Long
		 * float->Float
		 * double->Double
		 */
	}

}
