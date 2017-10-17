package objektorienteringUppgift2;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class BestGymEverFileManagementTest {
	
	BestGymEverFileManagement customer = new BestGymEverFileManagement();
	
	@Test
	public void testBoolean() {
		TestCase.assertFalse(customer.filled);
		TestCase.assertTrue(customer.input = "Greger Ganache", customer.filled = true);
		TestCase.assertFalse(customer.input = "Semi Turdean", customer.filled = false);
		TestCase.assertTrue(customer.input = "1111111111", customer.filled = true);
		TestCase.assertFalse(customer.input = "0", customer.filled = false);
	}

}
