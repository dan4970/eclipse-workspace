package tp5ytp6;
import java.util.*;
import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		Scanner tecla= new Scanner(System.in);
		
	ArrayList<String> nombres= new ArrayList <String> ();   //creo un arraylist de string
		
		for(int i=0;i<10;i++) {
			System.out.println("ingrese el nombre "+(i+1)+": ");
			nombres.add(tecla.nextLine());
		}
		System.out.println("ingrese el nombre que quiere buscar: ");
		String buscar=tecla.nextLine();
		
		
		
		int x =nombres.indexOf(buscar);
		
		
		if(x!=-1) {
			System.out.println("se encontro el nombre que buscabas : ");

		}
		else {
			System.out.println("NO se encontro el nombre que buscabas : ");

		}
		
		
		
		
		
//		boolean encuentra=false;
//		
//		for(int i=0;i<10;i++) {
//			if(buscar==nombres[i]) {
//				encuentra=true;
//				return;
//			}
//		}
//		if(encuentra==true) {
//			System.out.println("se encontro el nombre que buscabas : ");
//
//		}
//		else {
//			System.out.println("NO se encontro el nombre que buscabas : ");
//
//		}

//		System.out.println("se encontro el nombre que buscabas : "+n);

	}

}
