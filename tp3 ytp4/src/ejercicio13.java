import java.util.Scanner;   //libreria scaner para escanear lo que escribimos??? 

public class ejercicio13 {

	public static void main(String[] args) {

		Scanner tecla= new Scanner(System.in);

		System.out.println("ingrese un numero: ");
		int num=tecla.nextInt();
		for(int i=-num;i<=num;i++) {
	if(i%2==0) {
		System.out.println("el numero: "+i+" es par");
	}
		}
		
		
	}

}
