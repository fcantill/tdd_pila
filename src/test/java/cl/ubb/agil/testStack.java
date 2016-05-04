package cl.ubb.agil;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testStack {

	@Test
	public void pilaVacia(){
		stack stack = new stack();
	
		boolean a = stack.pilaVacia();
		
		
		assertEquals(a, true);
	}
	@Test
	public void pilaConUnNumero(){
		stack stack = new stack();
	
		stack.agregarNumeros(1);
		boolean a = stack.pilaVacia();
		
		
		assertEquals(a, false);
	}
	@Test
	public void pilaConDosNumeros(){
		stack stack = new stack();
	
		stack.agregarNumeros(1);
		stack.agregarNumeros(2);
		boolean a = stack.pilaVacia();
		
		
		assertEquals(a, false);
	}
	@Test
	public void pilaConDosNumerosRetornaTamaño(){
		stack stack = new stack();
	
		stack.agregarNumeros(1);
		stack.agregarNumeros(2);
		
		int a= stack.retornaTamanio();
		
		assertEquals(a, 2);
	}
	@Test
	public void agregaUnoRetornaUno(){
		stack stack = new stack();
	
		stack.agregarNumeros(1);
		
		int a = stack.hacerPop();
		
		
		assertEquals(a, 1);
	}
	@Test
	public void agregaUnoYDosYRetornaDos(){
		stack stack = new stack();
	
		stack.agregarNumeros(1);
		stack.agregarNumeros(2);
		
		int a = stack.hacerPop();
		
		
		assertEquals(a, 2);
	}
	@Test
	public void retornaCuatroYTres(){
		stack stack = new stack();
	
		stack.agregarNumeros(3);
		stack.agregarNumeros(4);
		
		int a = stack.hacerPop();
		int b = stack.hacerPop();
		
		
		assertEquals(a, 4);
		assertEquals(b, 3);
	}
	

}
