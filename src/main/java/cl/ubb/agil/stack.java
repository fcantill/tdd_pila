package cl.ubb.agil;

public class stack {
	private int tamaño=0;
	private int[] pila=new int[2];
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
		pila[tamaño-1]=numero;
	}
	public int retornaTamanio(){
		return tamaño;
	}
	
	public int hacerPop() throws ExcepcionPilaVacia{
		if(tamaño == 0){
			throw new ExcepcionPilaVacia();
		}else{
			int a= pila[tamaño-1];
			tamaño=tamaño-1;
			return a;
		}
	}
}
