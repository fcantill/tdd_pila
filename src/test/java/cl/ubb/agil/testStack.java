package cl.ubb.agil;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testStack {

	@Test
	public void pilaVacia(){
		stack stack = new stack();
	
		int[] pila = stack.pilaLifo();
		
		assertEquals(pila.length,0);
	}

}
