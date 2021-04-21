package Lab1;

import java.util.Scanner;


public class Tema1 {

	public static void main (String args[]) {
		
		int a, b ,s , dif, produs,max,min,distanta;
		float medie;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a=");
		System.out.println();
		a=sc.nextInt();
		
		System.out.print("b=");
		b=sc.nextInt();
		System.out.println();
		sc.close();
		
		s=a + b;
		System.out.println("Suma nr: " + s);
		
		dif= a-b;
		System.out.println("Diferenta nr: " + dif);
		
		produs= a*b;
		System.out.println("Produsul nr: " + produs);
		
		medie= (float)(a+b)/2;
		System.out.println("Media nr: " + medie);
		
		if(a>b)
		{
			max=a;
			min=b;
			distanta = a-b;
		}
		else
		{
		max=b;
		min=a;
		distanta=b-a;
		}
		
		System.out.println("Maximul dintre cele 2 nr. este: " + max);
		System.out.println("Minimul dintre cele 2 nr. este: " + min);
		System.out.println("Distanta dintre cele 2 nr. este: " + distanta);
		
	
	}
	
	
}
