import java.util.Scanner;   //libreria scaner para escanear lo que escribimos??? 

public class ejercicio8 {

	public static void main(String[] args) {
		Scanner tecla= new Scanner(System.in);
		System.out.println("ingrese la cantidad de segundos que quiera maquinola!!!");
				int seconds=tecla.nextInt();
				float minutes=(float) seconds/60;  //coloco el float
				
				System.out.println(minutes);   //por que no me muestra los decimales en el resultado xdd
	}

}
