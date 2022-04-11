package tp5ytp6;
import java.util.Random;
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner tecla= new Scanner(System.in);
		int num;
		int a[]=new int[20];
		Random random = new Random();
		int c=0;

		for(int i =0;i<20;i++) {
//			int value = random.nextInt(max + min) + min;      //me da un numero aleatorio entero entre 100 y 1 
			a[i]=random.nextInt(100 - 1) + 1;  
					if(a[i]%5==0) {
						c++;
				}
		}
		System.out.println(" la cantidad de numero que son divisibles por 5 son: "+c);

	}

}
