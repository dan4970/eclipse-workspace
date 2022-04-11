import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {

		Scanner tecla= new Scanner(System.in);
int c=0;
		System.out.println("ingrese un numero N: ");
		int N=tecla.nextInt();
		for(int i=2;i<=N;i++) {
	if(N%i==0) {
		System.out.println("el numero: "+i+" es divisor de "+N);
		c=c+i;
	}
		}
		
		System.out.println("la suma de todos los divisores es: "+c);

	}
		
		
	}

