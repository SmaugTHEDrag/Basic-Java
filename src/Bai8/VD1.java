package Bai8;

public class VD1 {

	public static void main(String[] args) {
		// ArithmeticException
		int x=8;
		int y=0;
		int kq=0;
		try {
			kq=x/y;
		}catch(ArithmeticException ex) {
			System.out.println("Lỗi chia 0 ");
		}
		System.out.println("Kết quả = "+kq);
	}

}
