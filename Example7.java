package epm.com.jdk2;

import java.util.Random;
import java.util.Scanner;

public class Example7 {
	public static void main(String[] args) {
		int[] mas =  {1,0,6,0,5};
		int[] masnul = new int[5];
		int k;
		k=0;
		
		Scanner sc = new Scanner(System.in); 
		
		 for (int i = 0; i < mas.length; i++) { 
			 if (mas[i] == 0)  {
				 masnul[k] = i;
				 System.out.print( masnul[k] + "   " );
				 k=k++;
			 }
			 
		 }  
         
		 }  	
		 
    }  
	
