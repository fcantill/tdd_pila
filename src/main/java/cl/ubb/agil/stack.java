package cl.ubb.agil;

public class stack {
	private int tama�o=0;
	private int[] pila=new int[2];
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
		pila[tama�o-1]=numero;
	}
	public int retornaTamanio(){
		return tama�o;
	}
	
	public int hacerPop() throws ExcepcionPilaVacia{
		if(tama�o == 0){
			throw new ExcepcionPilaVacia();
		}else{
			int a= pila[tama�o-1];
			tama�o=tama�o-1;
			return a;
		}
	}
}
