package Unit_Test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import Bai9.PhepToan;

class EnumTest {
	PhepToan tong = PhepToan.TONG;
    PhepToan thuong = PhepToan.THUONG;
    PhepToan hieu = PhepToan.HIEU;
    PhepToan tich = PhepToan.TICH;

    @Test
    void testTong() {
        double expected = 15 + 20;
        double actuals = tong.tinh(15, 20);
        Assert.assertEquals(expected, actuals, 0);
    }

    @Test
    void testThuong() {
        double expected = (double) 15 / 4;
        double actuals = thuong.tinh(15, 4); // Provide two arguments for the binary operation
        Assert.assertEquals(expected, actuals, 0);
    }
    
    @Test
    void testHieu() {
    	double expected = 30 - 10;
    	double actuals = hieu.tinh(30, 10);
    	Assert.assertEquals(expected, actuals, 0);
    }
}
