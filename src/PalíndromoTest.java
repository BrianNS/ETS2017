import static org.junit.Assert.*;

import org.junit.Test;

public class Pal�ndromoTest {

		private static final String Vacaciones = null;
		private Pal�ndromo Palind;
	@Test
	public void testVac�o() {
		Palind = new Pal�ndromo(Vacaciones);
		String Line=this.Palind.pal�n();
		assertTrue(Line==Vacaciones);
	}
	
	@Test
	public void testBlancoInicio(){
		fail("Not yet implemented");
	}
	
	@Test
	public void testBlancoFin(){
		fail("Not yet implemented");
	}
	
	@Test
	public void testUno(){
		fail("Not yet implemented");
	}
	
	@Test
	public void testTama�os(){
		fail("Not yet implemented");
	}
	
	@Test
	public void testMayus(){
		fail("Not yet implemented");
	}
}
