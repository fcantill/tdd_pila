package cl.ubb.agil;

public class stack {
	int tamaño=0;
	int[] pila={};
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
	}
}
