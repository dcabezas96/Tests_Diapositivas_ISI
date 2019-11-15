import static org.junit.Assert.*;
import org.junit.*;

public class LastZeroTest {
	
	//this test passes!
	@Test public void soloUnElemento()
	{
		int arr[]= {0};
		assertEquals("Solo tiene un elemento",0,LastZero.lastZero(arr));
		//valor esperado 0
		//valor obtenido 0
	}
	
	//this test fail!
	@Test public void variosCeros()
	{
		int arr[]= {0,7,0};
		assertEquals("Varios ceros, se tendría que encontrar el último",2,LastZero.lastZero(arr));
		//valor esperado 2
		//valor obtenido 1
	}
	
	//this test passes!
	@Test public void sinCeros()
	{
		int arr[]= {5,2,3,9};
		assertEquals("No se han encontrado ceros",-1,LastZero.lastZero(arr));
		//valor esperado -1
		//valor encontrado -1
	}

}
