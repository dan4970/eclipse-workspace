package tp5ytp6;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {

		Scanner tecla= new Scanner(System.in);

		int [][] matriz= new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("ingrese el numero: ");
				matriz[i][j]=tecla.nextInt();
				
				
			}
		}
		System.out.println("==================================");

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matriz[i][j]+" ");
				
			}
			System.out.println("\n");
		}
		
		
				
			
		}
	}


