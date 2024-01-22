package Bai9;

public enum PhepToan {
	TONG, 
	HIEU,
	TICH,
	THUONG;
	
	public double tinh(int so1, int so2) {
		double kq=0;
		switch(this) {
		case TONG: kq=so1+so2; break;
		case HIEU: kq=so1-so2; break;
		case TICH: kq=so1*so2; break;
		case THUONG: kq=(double)so1/so2; break;
		}
		return kq;
	}
}
