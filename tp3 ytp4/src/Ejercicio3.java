import java.util.Scanner;   //libreria scaner para escanear lo que escribimos??? 
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
//		
		Scanner teclado= new Scanner(System.in);
//		
//		
		System.out.println("ingrese un numero");
		int num1=teclado.nextInt();
		
		System.out.println("ingrese el siguiente numero");
		int num2=teclado.nextInt();
		
		System.out.println("ingrese el siguiente numero");
		int num3=teclado.nextInt();
			
			
		System.out.println("===========================================");
		
			
		
	
	if(num1>num2 && num1>num3 || num1<num2 && num1<num3 ) {
			if(num1>num2) {
				System.out.println( "el numero mayor es "+ num1);}
			
			 if(num1<num2){
					System.out.println( "el numero menor es "+ num1);
				}
		}
		
		
	
	
			 
			
	 if (num2>num1 && num2>num3 || num2<num1 && num2<num3){			
				if (num2>num1) {
					System.out.println( "el numero mayor es "+ num2);
				}
				else if(num2<num1) {	System.out.println( "el numero menor es "+ num2);
				}
			}
		 
	 
	 
		 
		 
		 
	if (num3>num1 && num3>num2 || num3<num1 && num3<num2){			
				if (num3>num1) {
					System.out.println( "el numero mayor es "+ num3);
				}
				else if(num3<num1) {System.out.println( "el numero menor es "+ num3);
				}
			}
			
	
	
			
		
	}
}
//		
//		System.out.println("===========================================");
//		System.out.println("ingrese la cantidad de numeros");
//		int cantidad=teclado.nextInt();
//		int numeros[]= {cantidad};
//
//		for(int w=0;w<cantidad;w++) {
//			
//			System.out.println("ingrese el valor del numero "+(w+1));
//			numeros[w] =teclado.nextInt();
//			System.out.println(numeros[w]);
//		}
			
//		
		//Suponemos que el mayor es el primero
//		int mayor = numeros[0];
		// Ciclo comienza en 1 porque el 0 ya está contemplado
//		for (int x = 0; x < numeros.length; x++) {
////			
//		    int numeroActual = numeros[x];
//		    if (numeroActual > mayor) {
//		        mayor = numeroActual;
//		    }
//		}   
//		  System.out.println( "el numero mayor es "+ mayor);
//
//		    int menor= numeros[0];
//	   for (int i = 0; i < numeros.length; i++) {
////			
//
//	   
//		    int numeroActualMenor = numeros[i];
//		    if (numeroActualMenor < menor) {
//		        menor = numeroActualMenor;
//		    }
//	 System.out.println( "el numero menor es "+ menor);
//		
//		
		
	


