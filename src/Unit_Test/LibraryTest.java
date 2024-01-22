package Unit_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import Bai7.Library;
class LibraryTest {

	@Test
	void testLaSoNguyenTo() {
		Assert.assertTrue(Library.soNguyenTo(5));
	}
	
	@Test
	void testLaSoHoanHao() {
		Assert.assertFalse(Library.soHoanHao(22));
	}

}
