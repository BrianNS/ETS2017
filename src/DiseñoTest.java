import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DiseñoTest {
	
	private Diseño eval;
	
	@Before
	public void antesDelTest() {
		this.eval = new Diseño(6,7,5);
	}
	@Test
	public void TestMinimoSencillo(){
		int resultado = this.eval.máximo();
		assertTrue(resultado == 5);
	}
	@Test
	public void TestMaximoDoble(){
		eval = new Diseño(8,8,6);
		int resultado = this.eval.máximodoble();
		assertTrue(resultado == 8);
	}
	@Test
	public void TestOrden(){
		int resultado = this.eval.orden();
		assertTrue(resultado == 5);
	}
	@Test
	public void TestMaximoSencillo(){
		int resultado = this.eval.mínimo();
		assertTrue(resultado == 7);
	}
	@Test
	public void TestMedia(){
		int resultado = this.eval.media();
		assertTrue(resultado == 6);
	}
}
