
public class notas1 {

	public static void main(String[] args) {

		
		int num1=123;
		int num2=1525634;
		
		float div=(float) num1/num2;   //coloco el float para obtener un resutado deciman de la division de dos numeros enteros
		
		
		//CONVERTIR UN ENTERO EN STRING Y MOSTRARLO EN UN CICLO FOR:
		  int numEntero = 423423;    
		    String numCadena= String.valueOf(numEntero); 
		    
			System.out.println("ingrese un numero: "+numCadena);
			
				for(int i=0;i<numCadena.length();i++) {
					
					System.out.println("la letra n°: "+(i+1)+" es: "+numCadena.charAt(i));

				}
		
				
				
				
				
				//CONVERTIR UN STRING EN UN ARRAY:
				String abc = "Hola";
				String [] vect = abc.split("");   //convierto un string en un array
			
				for(int i=0;i<4;i++) {
				System.out.println(vect[i]);
				}
	}

}
