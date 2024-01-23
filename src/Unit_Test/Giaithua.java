package Unit_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Baitap01.giaithua;

class Giaithua {
	giaithua gt = new giaithua();
	@Test
	void testGiaiThua() {
		Assert.assertEquals(120, gt.Giaithua(5), 0);
	}

}
