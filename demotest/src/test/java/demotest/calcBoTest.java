package demotest;

import static org.junit.Assert.*;

import org.junit.Test;

public class calcBoTest{
	@Test
	public void testPositiveAdd()
	{
		calcBo cb = new calcBo();
		int k = cb.add(10,20);
		assertEquals(k,30);
	}
	
	@Test
	public void testGetAll()
	{
		calcBo cb = new calcBo();
		int k= cb.getAll().size();
		
		assertEquals(k,2);
	}
	
}
