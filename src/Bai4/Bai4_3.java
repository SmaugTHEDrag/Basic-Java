package Bai4;
import java.util.Scanner;
public class Bai4_3 {
	public static void main(String[] args) {
		//Nhập các giá trị ngày tháng năm xem ngày tháng năm có hợp lệ không 
		// ngày 1=>31, tháng 1->12, năm >=1900
	Scanner input = new Scanner(System.in);
	System.out.print("Nhập ngày: ");
	int ngay = input.nextInt();
	System.out.print("Nhập tháng: ");
	int thang = input.nextInt();
	System.out.print("Nhập năm: ");
	int nam = input.nextInt();
	boolean hople=true;
	if(ngay<1||ngay>31||thang<1||thang>12||nam<1900)
		hople=false;
	else {
		switch(thang) {
	case 4: case 6: case 9: case 11: 
	    if(ngay > 30) hople=false;
		break;
	case 2:
		if ((nam%400==0)||(nam%4==0&&nam%100!=0)){
			if (ngay>29)
				hople = false;
		}
		else { 
			if(ngay>28)
				hople = false;
		}
	}
	}
	System.out.println((hople==true)?"Hợp lệ":"Không hợp lệ");
	input.close();
}
}
