package tp5ytp6;
import java.util.Scanner;   //libreria scaner para escanear lo que 
public class ejercicio3 {

	public static void main(String[] args) {
		Scanner tecla= new Scanner(System.in);

		float array[]=new float[10];
		
		for(int i=0;i<10;i++) {
			System.out.println("ingrese la el valor del numero "+(i+1));
			array[i]=tecla.nextFloat();
		}
	
		
		System.out.println("ingrese la la posicion del elemento a eliminar del array(entre 0 y 9): ");
		int posicion=tecla.nextInt();
		for(int i=posicion;i<9;i++) {
			array[i]=array[i+1];
		}

		for(int i=0;i<8;i++) {
			System.out.println(array[i]);

		}
		
		
		
	}

}
