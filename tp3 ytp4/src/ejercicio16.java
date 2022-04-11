
public class ejercicio16 {

	public static void main(String[] args) {
		  int numEntero = 423423;    
		    String numCadena= String.valueOf(numEntero); 	
			System.out.println("ingrese un numero: "+numCadena);
				for(int i=0;i<numCadena.length();i++) {
					System.out.println("la letra n°: "+(i+1)+" es: "+numCadena.charAt(i));

				}
	}

}
