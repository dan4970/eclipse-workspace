import java.util.Scanner;   //libreria scaner para escanear lo que escribimos
import java.util.Arrays;

public class EJERCICIO17 {

	public static void main(String[] args) {
		Scanner tecla= new Scanner(System.in);
		System.out.println("ingrese la cantidad ");

		
		int cantidad=tecla.nextInt();
		int num[]=new int[cantidad];
		int n;
	
		for(int i=0;i<cantidad-1; i++) {
		System.out.println("ingrese el numero "+(i+1));
		 n=tecla.nextInt();
		 num[i]= n;

	}
		int aux;
		int digito;
		int c;
		for(int j=0;j<cantidad-1;j++) {
			c=0;
			aux=num[j];
			while(aux!=0) {
				digito= aux%10;    //saco el ultimo digito del numero.
				if(digito%2==0) {
					c++;
				}
				aux=aux/10;        //este es una division entera;
			}
			System.out.println(" el numero "+num[j]+" tiene "+c+" digitos pares");

		}
			

			}
		}
		
		



