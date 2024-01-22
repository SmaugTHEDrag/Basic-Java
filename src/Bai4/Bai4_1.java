package Bai4;
import java.util.Scanner;
public class Bai4_1 {

	public static void main(String[] args) {
		// Nhập cân nặng chiều cao, Tính chỉ số BMI và kết luận
		Scanner input = new Scanner (System.in);
		System.out.print("Nhập chiều cao: ");
		float chieuCao = input.nextFloat();
		System.out.print("Nhập cân nặng: ");
		float canNang = input.nextFloat();
		
		double BMI = canNang/(chieuCao * chieuCao);
		String ketLuan = "";
		if (BMI<18.5)
			ketLuan = "Gầy";
		else if(BMI>=18.5 && BMI<= 24.99)
		    ketLuan = "Bình thường";
		else 
		    ketLuan = "Thừa cân";
		System.out.println("Chỉ số BMI = "+BMI);
		System.out.println("Bảng đánh giá: "+ketLuan);
		input.close();
	}

}
