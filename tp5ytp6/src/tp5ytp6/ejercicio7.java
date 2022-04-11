package tp5ytp6;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {

		Scanner tecla= new Scanner(System.in);
		System.out.println("ingrese la palabra ");
		String palabra=tecla.nextLine();
		
		String [] array = palabra.split("");   //convierto un string en un array
		int cv=0;  //contador de vocales
		int	cc=0;	//contador de consonantes
		for(int i =0;i<array.length;i++) {
//			array[i]=='a'|| array[i]=='i'|| array[i]=='e'|| array[i]=='o'|| array[i]=='u'
			if(String.valueOf('a').equals(array[i]) || String.valueOf('e').equals(array[i]) || String.valueOf('i').equals(array[i]) || String.valueOf('o').equals(array[i]) || String.valueOf('u').equals(array[i])) {  //String es un objeto predefinido en java, en donde valueOf es un metodo para comparar un tipo de dato char con un array de string
				cv++;
			}
			else {
				cc++;
			}
		}
		System.out.println("cantidad de vocales son: "+cv);
		System.out.println("cantidad de consonantes son: "+cc);

	}

}
