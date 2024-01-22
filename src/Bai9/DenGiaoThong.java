package Bai9;

public enum DenGiaoThong {
	XANH(30),  //index=0
	VANG(5),   //index=1
	DO(20);   //index=2
	
	private int soGiay;
	private DenGiaoThong(int soGiay) { // pt khởi tạo trùng tên với enum
		this.soGiay=soGiay;
	}
	public int laySoGiay() {
		return soGiay;
	}
}
