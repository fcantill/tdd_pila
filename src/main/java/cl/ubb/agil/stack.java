package cl.ubb.agil;

public class stack {
	int tama�o=0;
	int[] pila={};
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
	}
}
