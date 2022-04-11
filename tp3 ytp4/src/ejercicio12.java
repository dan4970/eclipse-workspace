import java.util.Scanner;
import java.util.Arrays;


public class ejercicio12 {

	public static void main(String[] args) {
		Scanner tecla= new Scanner(System.in);

		
		
		System.out.println("ingrese un la cantidad de deportistas");
		int cantidad=tecla.nextInt();
		
//		int total=0;
//		int array[]= new int[cantidad];
//		int arrayOrdenado[]= new int[1];
//		
//		
//		
//	
//		
//		for(int i=0;i<cantidad; i++) {
//		System.out.println("ingrese la edad del deportista "+(i+1));
//		array[i]= (tecla.nextInt());
//		total = total + array[i];
//		}
//		
//		
//		
//		
//		//promedio de edades
//		float promedio=(float) total/cantidad;
//		System.out.println("el promedio de edades es: "+promedio);
//
//		
//		
//		
//		
//		//mayor edad
//		int mayor=array[0];
//		for(int j=1;j<cantidad;j++) {
//			if(mayor<array[j]) {
//				mayor=array[j];
//				arrayOrdenado[0]=array[j];
//			}
//			else {
//				arrayOrdenado[0]=mayor;
//				
//			}
//		}
//		
//		
//		//menor
//		int arrayOrdenado2[]=new int[1];
//		int menor=array[0];
//		for(int j=1;j<cantidad;j++) {
//			if(menor>array[j]) {
//				menor=array[j];
//				arrayOrdenado2[0]=array[j];
//			}
//			else {
//				arrayOrdenado2[0]=menor;
//				
//			}
//		}
//		
//		
//			System.out.println("el deportista de mayor edad es: "+arrayOrdenado[0]);
//			System.out.println("el deportista de menor edad es: "+arrayOrdenado2[0]);
		int c=0;
		int Mayor=0;
		int Menor=0;
		for(int i=0;i<cantidad;i++) {
			System.out.println("ingrese la edad del deportista "+(i+1));
			int edad=tecla.nextInt();
			c+=edad;
			if(i==0) {
				Mayor=edad;
				Menor=edad;
			}
			else {
					if(edad>Mayor) {
					Mayor=edad;
					}
							else {
							Menor=edad;
							 }
				}	
			}
		
		System.out.println("el deportista de mayor edad es: "+Mayor);
		System.out.println("el deportista de menor edad es: "+Menor);
		System.out.println("el promedio de edades es: "+(float)c/cantidad);
	}

}
