package Bai3;

public class VD1 {

	public static void main(String[] args) {
		// Toán tử số hoc (+, -, *, /, %)
		byte a =70;
		byte b=5;
		// byte c=(byte)(a*b)
		int c=a*b;
		System.out.println("70*5="+c);
		
		long x=66;
		int y=9;
		float z = (float)x/y;
		System.out.println("66/9="+z);
		
		/* int x1=10
		 * int y1 = 0
		 * int z1 = x1.y1 => ArithmeticException
		 * System.out.print(x1+"/"+y1+"="+z1)
		 */
		float x2 = 10;
		float y2 = 0;
		float z2 = x2/y2; //infinity
		System.out.println(x2+"/"+y2+"="+z2 + "-"+Float.isInfinite(z2));
		double kq =Math.sqrt(-5);
		System.out.println("Math.sqrt(5)"+kq+Double.isNaN(kq));

	}

}
