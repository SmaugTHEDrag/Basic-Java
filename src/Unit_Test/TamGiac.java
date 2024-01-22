package Unit_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import Bai7.Bai7_3;
class TamGiac {
    Bai7_3 tg= new Bai7_3(); // biến tham chiếu 
	@Test
	void testLaTamGiac() {
		Assert.assertTrue(tg.laTamGiac(4, 2, 3));
	}
	@Test
	void testLoaiTamGia() {
		Assert.assertEquals("Tam giác cân", tg.loaiTamGiac(4, 4, 2));
	}
}
