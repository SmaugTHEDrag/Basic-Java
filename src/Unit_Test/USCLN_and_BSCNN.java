package Unit_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Baitap01.UCLN_and_BCNN;

class USCLN_and_BSCNN {
	UCLN_and_BCNN uc_bc = new UCLN_and_BCNN();
	@Test
	void testUCLN() {
		Assert.assertEquals(2, uc_bc.UCLN(4,2));
	}
	@Test
	void testBCNN() {
		Assert.assertEquals(4, uc_bc.BCNN(2, 4));
	}

}
