package co.simplon;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExempleTest {

	@Test
	public void helloWorld() {
		assertEquals("Hello World", Exemple.helloWorld(""));
		assertEquals("Hello Manu", Exemple.helloWorld("Manu"));
		assertEquals("Hello Laetitia", Exemple.helloWorld("Laetitia"));
	}

}
