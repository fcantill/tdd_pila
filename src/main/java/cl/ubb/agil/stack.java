package cl.ubb.agil;

public class stack {
	private int tama�o=0;
	private int ultimoNumero=0;
	private int[] pila={};
	public stack(){
		
	}
	public boolean pilaVacia(){
		if (tama�o==0){
			return true;
		}else{
			return false;
		}
		
	}
	public void agregarNumeros(int numero){
		tama�o++;
		ultimoNumero=numero;
	}
	public int retornaTamanio(){
		return tama�o;
	}
	
	public int hacerPop(){
		return ultimoNumero;
	}
}
