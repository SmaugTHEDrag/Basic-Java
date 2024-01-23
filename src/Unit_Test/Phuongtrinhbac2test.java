package Unit_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Baitap01.phuongtringbac2;

class Phuongtrinhbac2test {
	phuongtringbac2 bac2= new phuongtringbac2();  
	@Test
	void testlaPhuongTrinhbac2() {
		Assert.assertTrue(bac2.laPhuongTrinhbac2(2, 2, 5));
	}
	
	@Test
	void testloaiPhuongtrinh() {
		Assert.assertEquals("Phương trình có 2 nghiệm",bac2.loaiPhuongtrinh(2, 3, 1));
		Assert.assertEquals("Phương trình có nghiệm kép",bac2.loaiPhuongtrinh(2,4,2));
		Assert.assertEquals("Phương trình vô nghiệm",bac2.loaiPhuongtrinh(2, 3, 5));
	}

}
