package tp5ytp6;

import java.util.Scanner;

public class ejericico5 {

	public static void main(String[] args) {
		
		Scanner tecla= new Scanner(System.in);
		System.out.println("ingrese la cantidad ");
		int cantidad=tecla.nextInt();
		int num[]=new int[cantidad];
		
		int cp=0,ci=0;
		
		for(int i=0;i<cantidad; i++) {
		System.out.println("ingrese el numero "+(i+1));
		 num[i]=tecla.nextInt();
		 if(num[i]%2==0) {
			 cp++;
		 }
		 else {
			 ci++;
		 }
		
	}
		int par[]=new int[cp];
		int impar[]=new int[ci];
		int k=0,j=0;
		
		
		for(int x=0;x<cantidad; x++) {
			 if(num[x]%2==0) {
				 par[k]=num[x];
				 k++;
		}
		}
		for(int y=0;y<cantidad; y++) {
			 if(num[y]%2!=0) {
				 impar[j]=num[y];
				 j++;
		}
		}
	
		
		
		
		for(int w=0;w<ci;w++) {
			System.out.println(impar[w]);
		}
		for(int x=0;x<cp;x++) {
			System.out.println(par[x]);
		}

		
//	System.out.println(cp);
//	System.out.println(ci);


		

	}

}
