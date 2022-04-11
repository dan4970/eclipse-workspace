package tp5ytp6;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner tecla= new Scanner(System.in);
		System.out.println("ingrese la cantidad ");

		
		int cantidad=tecla.nextInt();
		int num[]=new int[cantidad];
		int n;
		
		for(int i=0;i<cantidad; i++) {
			System.out.println("ingrese el numero "+(i+1));
			n=tecla.nextInt();
			 num[i]= n;
		}
		
		
		int Mayor=num[0];
		int menor=num[0];
		int c=0;
		for(int i=0; i<cantidad-1;i++) {
			c+=num[i];
		
			if(num[i]>Mayor) {
				Mayor=num[i];
				if(num[i]>100) {
					System.out.println("La persona "+(i+1)+" tiene un peso mayor a 100kg");
				}
			}
			else if(num[i]<menor) {
				menor=num[i];
				if(num[i]>100) {
					System.out.println("La persona "+(i+1)+" tiene un peso mayor a 100kg");
				}
			}	
		}
		float promedio=(float)c/cantidad;
		System.out.println("La persona de mayor peso es: "+Mayor);
		System.out.println("La persona menor peso es: "+menor);
		System.out.println("El peso medio es: "+promedio);	
		}
	}


