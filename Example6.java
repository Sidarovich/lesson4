package epm.com.jdk2;

import java.util.Random;
import java.util.Scanner;

public class Example6 {
	public static void main(String[] args) {
		int[] mas = new int[5];
		int sum ;
		sum = 0;
		int max;
		Random rand = new Random(); 
		Scanner sc = new Scanner(System.in); 
		 for (int i = 0; i < mas.length; i++) { 
			 mas[i] = rand.nextInt();
			 System.out.print( mas[i]+ "   "); 
		 }  
		
		 for (int i = 0; i < mas.length; i++) { 
			 max=mas[i];
			for (int j = 0; j < mas.length; j++) {
			 if (max > mas[j] )  {
				 System.out.print( "not increase  "); 
				 return;
			 }
			} 
		 }  
		
		
    }  
	}