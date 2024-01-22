package Bai7;

public class Library {
	// Nhập vào số nguyên x. Cho biết x có phải số nguyên tố không?
	// Số NT là số chỉ chia hết cho 1 và chính nó
	// x=5->5 chia hết cho 1 và cho 5 -> 5 là số NT
	// x=4->4 chia hết cho 1,2 và 4 -> 4 không là sô NT
	// x=1->1 không là sô NT
	public static boolean soNguyenTo(int x) {
		boolean soNT=true;
		if(x<2) soNT=false;
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				soNT=false;
				break;
			}
		}
		return soNT;
	}
	public static boolean soHoanHao(int x) {
		// Số hoàn hảo là số có tổng ước sô = chính nó
		// x=6->tongUoc=1+2+3=6->6 là số hoàn hảo
		// x=28->tongUoc=1+2+3+4+7+14=28->28 là số hoàn hảo
		long tongUoc=0;
		for(int i=1;i<x;i++) {
			if(x%i==0) tongUoc+=i; // tongUoc=1+2+3
		}
		return (tongUoc==x);
	}
}
