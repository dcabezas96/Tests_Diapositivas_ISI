import static org.junit.Assert.*;
import org.junit.*;

public class CountPositiveTest
{
	// this test fails!
	@Test public void arrayConCeros()
	{
		int arr[]= {0,1,-3,2};
		assertEquals("Array contiene ceros",2,CountPositive.countPositive(arr));
		//valor esperado 2
		//valor obtenido 3
	}

	//this test passes!
	@Test public void arraySinCeros()
	{
		int arr[]= {5,3,-6,-2};
		assertEquals("Array contiene ceros",2,CountPositive.countPositive(arr));
		//valor esperado 2
		//valor obtenido 2

	}
}
