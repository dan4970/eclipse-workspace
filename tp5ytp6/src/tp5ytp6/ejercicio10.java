package tp5ytp6;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner tecla= new Scanner(System.in);
		System.out.println("ingrese el numero de filas: ");
		int i=tecla.nextInt();
		System.out.println("ingrese el numero de columnas: ");
		int j=tecla.nextInt();
		
		

		int [][] matriz1= new int[i][j];
		for(int y=0;y<i;y++) {
			for(int u=0;u<j;u++) {
				System.out.println("ingrese el numero para la matriz 1: ");
				matriz1[y][u]=tecla.nextInt();
			}
		}
		
		int [][] matriz2= new int[i][j];
		for(int y=0;y<i;y++) {
			for(int u=0;u<j;u++) {
				System.out.println("ingrese el numero para la matriz 2: ");
				matriz2[y][u]=tecla.nextInt();
			}
		}
		int [][] matrizSuma= new int[i][j];

		for(int y=0;y<i;y++) {
			for(int u=0;u<j;u++) {
				matrizSuma[y][u]=matriz1[y][u]+matriz2[y][u];
			}
		}
		System.out.println("==================================");

//		COMO MOSTRAR ORDENADAMENTE COMO UNA MATRIZ1
		for(int y=0;y<i;y++) {
			for(int u=0;u<j;u++) {
				System.out.print(matriz1[y][u]+" ");
			}
			System.out.println("\n");
		}
		System.out.println("==================================");

		
//		COMO MOSTRAR ORDENADAMENTE COMO UNA MATRIZ2

		for(int y=0;y<i;y++) {
			for(int u=0;u<j;u++) {
				System.out.print(matriz2[y][u]+" ");
			}
			System.out.println("\n");
		}
		
		System.out.println("==================================");

//		COMO MOSTRAR ORDENADAMENTE COMO UNA matrizSuma:

		for(int y=0;y<i;y++) {
			for(int u=0;u<j;u++) {
				System.out.print(matrizSuma[y][u]+" ");
			}
			System.out.println("\n");
		}
	

	}

}
