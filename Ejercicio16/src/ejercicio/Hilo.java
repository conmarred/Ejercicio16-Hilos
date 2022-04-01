package ejercicio;


public class Hilo implements Runnable{
	private Integer numero;
	
	public boolean esPrimo(Integer num) {
		boolean primo = true;
		for(int i =2; i<num; i++) {
			if(num%i==0) {
				primo = false;
				break;
			}
		}
		return primo;		
	}
	
	public Hilo(Integer numero) {
		this.numero=numero;
	}

	@Override
	public void run() {
		if(esPrimo(numero)) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
		
	}


}
