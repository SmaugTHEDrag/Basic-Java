package Bai7;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class OneTwoThree {
	public static String xuatMayChon() {
		String mayChon="";
		Random rand=new Random();
		int num = rand.nextInt(3)+1; // num=1.2.3
		switch(num) {
		case 1: mayChon="S"; break;
		case 2: mayChon="P"; break;
		case 3: mayChon="R"; break;
		}
		return mayChon;
	}
	public static boolean nguoiChoithang(String nguoiChon, String mayChon) {
	    boolean win = false;
	    if((nguoiChon.equalsIgnoreCase("S")&&mayChon.equalsIgnoreCase("P"))
	    	|| (nguoiChon.equalsIgnoreCase("R")&&mayChon.equalsIgnoreCase("S"))
	    	|| (nguoiChon.equalsIgnoreCase("P")&&mayChon.equalsIgnoreCase("R")))
	    	win = true;
	    return win;
	}
	public static void main(String[] args) {
		// Trò chơi: "scissor" thắng "paper", "paper" thắng "rock", "rock" thắng "scissor"
		try {
		Scanner input = new Scanner(System.in);
		System.out.println("Trò chơi OneTwoThree");
		System.out.println("scissor thắng paper, paper thắng rock, rock thắng scissor \n Bắt đầu chơi!");
	int tieptuc = 1;
	while(tieptuc==1) {
		System.out.print("User choose S,P,R: ");
		String nguoiChon=input.nextLine();
		String mayChon = xuatMayChon();
		System.out.print("Máy chọn: "+mayChon);
	// So sánh kết quả: 
	if(nguoiChon.equalsIgnoreCase(mayChon)) // so sánh không phân biệt hoa thường
	    System.out.println("Ngang tài ngang sức");
	else if(nguoiChoithang(nguoiChon, mayChon))
		System.out.println("\nBạn thắng rồi");
	else System.out.println("\nMáy thắng!");
	System.out.println("Tiếp tục chơi(1: Có, 0:dừng)? ");
	tieptuc=input.nextInt();
	}
	 System.out.println("Dừng chơi");
		}catch(InputMismatchException ex) {
			System.out.println("Nhập sai kiểu dữ liệu!");
			return; //thoát
		}
	}
}
