package tp5ytp6;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;





import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {

		Scanner tecla= new Scanner(System.in);
		System.out.println("ingrese la palabra ");
		String s=tecla.nextLine();
		String inversa="";
		//muestro los caracteres del string(es como si fuera un array de caracteres el string s)
		 for(int i=0;i<s.length();i++) {
		   	System.out.println(s.charAt(i));

		    }
		 
		 
	    //cargo los caracteres al nuevo string inversa para despues comparar...
	    for(int i=s.length()-1;i>=0;i--) {
	      inversa = inversa + s.charAt(i);
	    }
	    
	    //comparo el string s con el inversa
	    if(inversa.equalsIgnoreCase(s)) {  // el equals : es para comparar string, y el IgnoreCase: es para no tomar en cuenta la comparacion con la mayuscula y minuscula
	    System.out.println("Es palindromo la palabra ");
	}else {
	    System.out.println("NO es palindromo la palabra ");

	}
		
		
		
		
		
		
		
		
		
		
		
	
	
		
//		Scanner tecla= new Scanner(System.in);
//		System.out.println("ingrese la palabra ");
//		String s=tecla.nextLine();
//	
//	    char[] palindromo = s.toCharArray();  //convierto el string en un array de caracteres(letras que es char)
//	    int izq=0;
//	    int der=palindromo.length-1;
//	    
//	    while(izq<der) {
//	    	if(palindromo[izq]==palindromo[der]) {
//	    		izq++;
//	    		der--;
//	    	}
//	    	else {
//	    		System.out.println("La palabra "+s+" No es un palindromo");
//	    			return;	    	}
//	    }
//	    if(izq==der) {
//		System.out.println("La palabra "+s+" Si es un palindromo");
//	    }
	    
	  }
	}


