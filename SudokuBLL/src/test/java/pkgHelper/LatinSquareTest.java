package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	
	@Test
	public void DoesElementExist_Test1()
	{
		int [] array1 = {1,2,3,4,5};
		int iValue = 2;
		boolean bExpectedCondition = true; 
		boolean bActualCondition; 
		
		bActualCondition = LatinSquare.doesElementExist(array1, iValue);
		
		assertEquals(bExpectedCondition,bActualCondition);
		
		
	}

	@Test
	public void DoesElementExist_Test2()
	{
		int [] array1 = {1,2,3,4,5};
		int iValue = 7;
		boolean bExpectedCondition = false; 
		boolean bActualCondition; 
		
		bActualCondition = LatinSquare.doesElementExist(array1, iValue);
		
		assertEquals(bExpectedCondition,bActualCondition);
		
		
	}
/*
	@Test
	public void HasAllValues_Test1()
	{
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,5};
		boolean bExpected = false;
		boolean bActualValue = LatinSquare.hasAllValues(arr1,  arr2);
				
		assertEquals(bExpected,bActualValue);
	}
	*/
	
	@Test
	public void ContainsZero_Test1()
	{
		
		
		int[][]puzzle = { {1,2,3} , {2,3,1} , {3,1,2} };
		LatinSquare ls = new LatinSquare(puzzle);
		boolean bExpected = false;
		boolean bActual = ls.ContainsZero();
		assertEquals(bExpected,bActual);
		
		
	}
	
	@Test
	public void ContainsZero_Test2()
	{
		
		
		int[][]puzzle = { {1,0,3} , {2,3,1} , {3,1,2} };
		LatinSquare ls = new LatinSquare(puzzle);
		boolean bExpected = true;
		boolean bActual = ls.ContainsZero();
		assertEquals(bExpected,bActual);
		
		
	}

	@Test
	public void hasDuplicates_test1() //wrong
	{
		
		
//		int[]arr = {4,3,2,1};
//		boolean bExpected = true;
//		boolean bActual = hasDuplicates();
//		assertEquals(bExpected,bActual);
		
		
	}
}
