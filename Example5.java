package epm.com.jdk2;

import java.util.Random;
import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {
		int[] mas = new int[5];
		int sum ;
		sum = 0;
		Random rand = new Random(); 
		Scanner sc = new Scanner(System.in); 
		 for (int i = 0; i < mas.length; i++) { 
			 mas[i] = rand.nextInt();
			 System.out.print( mas[i]+ "   "); 
		 }  
		
		 for (int i = 0; i < mas.length; i++) { 
			 if (mas[i] % 10 == 0)  {
				 sum= sum+mas[i];
			 }
			 
		 }  
		
		 System.out.print( "Sum = " + sum);
    }  
	}


