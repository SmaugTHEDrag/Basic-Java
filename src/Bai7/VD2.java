package Bai7;
import java.util.Scanner;
public class VD2 {
	public static void main(String[] args) {
		// Nhập n. Tính tổng các số nguyên tố, các số hoàn hảo từ 1 đến n
		Scanner input= new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = input.nextInt();
		int tongSoNT=0, tongSoHH=0;
		for(int i=1;i<=n;i++) {
			if(Library.soNguyenTo(i)) tongSoNT+=i;
			if(Library.soHoanHao(i)) tongSoHH+=i;
		}
		System.out.println("Tổng số nguyên tố từ 1 đến "+n+" = "+tongSoNT);
		System.out.println("Tổng số hoàn hảo từ 1 đến "+n+" = "+tongSoHH);
		input.close();
	}

}
