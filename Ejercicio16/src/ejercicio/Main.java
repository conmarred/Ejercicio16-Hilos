package ejercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los numeros para saber si son primos: ");
		Hilo h1 = new Hilo(sc.nextInt());
		Thread t1 = new Thread(h1);
		t1.start();
		
		Hilo h2 = new Hilo(sc.nextInt());
		Thread t2 = new Thread(h2);
		t2.start();
		

		Hilo h3 = new Hilo(sc.nextInt());
		Thread t3 = new Thread(h3);
		t3.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	
		
	}

}
