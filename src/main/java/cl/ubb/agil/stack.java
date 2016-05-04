package cl.ubb.agil;

public class stack {
	private int tamaño=0;
	private int ultimoNumero=0;
	private int[] pila={};
	public stack(){
		
	}
	public boolean pilaVacia(){
		if (tamaño==0){
			return true;
		}else{
			return false;
		}
		
	}
	public void agregarNumeros(int numero){
		tamaño++;
		ultimoNumero=numero;
	}
	public int retornaTamanio(){
		return tamaño;
	}
	
	public int hacerPop(){
		return ultimoNumero;
	}
}
