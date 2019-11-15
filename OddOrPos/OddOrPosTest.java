import static org.junit.Assert.*;
import org.junit.*;

public class OddOrPosTest {
	
	//this test passes!
	@Test public void NumerosImparesPositivos()
	{
		int arr[]= {-8,-4,0,1,5,4};
		assertEquals("Numeros impares positivos",3,OddOrPos.oddOrPos(arr));
		//valor esperado 3
		//valor obtenido 3
	}
	
	//this test fail!
	@Test public void NumerosImparesNegativos()
	{
		int arr[]= {-5,-8,0,1,12};
		assertEquals("Numeros impares negativos",3,OddOrPos.oddOrPos(arr));
		//valor esperado 3
		//valor obtenido 2
	}

}
