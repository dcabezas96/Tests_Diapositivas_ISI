import static org.junit.Assert.*;
import org.junit.*;

public class FindLastTest {
	
	//This test passes!
	@Test public void ultimaAparacionDesordenado()
	{
		int arr[]= {5,6,9,8};
		int y=9;
		assertEquals("Cualquier posición",2,FindLast.findLast(arr, y));
		//valor esperado 2
		//valor obtenido 2
	}
	
	//This test fail!
	@Test public void ultimaAparicionPrincipio()
	{
		int arr[]= {3,8,6,9};
		int y=3;
		assertEquals("Primera posicion",0,FindLast.findLast(arr, y));
		//valor esperado 0
		//valor obtenido -1
	}

}
