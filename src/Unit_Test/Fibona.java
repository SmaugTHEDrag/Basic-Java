package Unit_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Baitap01.Fibonacci;

class Fibona {
	Fibonacci fibo = new Fibonacci();
	@Test
	void testFibo() {
		Assert.assertEquals(5, fibo.Fibo(0, 1, 1, 5), 0);
	}

}
