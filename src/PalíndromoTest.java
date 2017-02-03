import static org.junit.Assert.*;

import org.junit.Test;

public class PalíndromoTest {

		private static final String Vacaciones = null;
		private Palíndromo Palind;
	@Test
	public void testVacío() {
		Palind = new Palíndromo(Vacaciones);
		String Line=this.Palind.palín();
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
	public void testTamaños(){
		fail("Not yet implemented");
	}
	
	@Test
	public void testMayus(){
		fail("Not yet implemented");
	}
}
