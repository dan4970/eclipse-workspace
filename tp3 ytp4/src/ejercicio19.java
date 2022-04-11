import java.util.Scanner;   //libreria scaner para escanear lo que escribimos??? 

public class ejercicio19 {

	public static void main(String[] args) {
		
		
		Scanner tecla= new Scanner(System.in);
		System.out.println("ingrese un numero mayor a 10");
		float num=tecla.nextInt();
		if(num<10) {
		System.out.println("numero erroneo, ingrese un numero mayor a 10");
		 num=tecla.nextInt();
		}
		for(float i=2; i<=num;i++) {
			float c=0;
			for(float j=1;j<=i;j++) {
			
				if(i%j==0) {
				c++;
				if(c>2) {
					
					 continue;					 
					}
				}
					
			}
			if(c<3) {
		System.out.println("el numero "+i+"  SI es un primo");
			}
			else {
				System.out.println("el numero "+i+" No es primo");
			}
			
		}
}
}

