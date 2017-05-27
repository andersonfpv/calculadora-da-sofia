/*
 * Fibonacci.java
 * 
 */

import java.util.Scanner;

public class Fibonacci {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner ( System.in );
		
		int a = 0, b = 1, c = 1, n = 0;
		
		System.out.println("Fibonacci\n");
		do {
			System.out.print("Entre com a quantidade de termos da sequencia de fobonacci [0-Sair]: ");
			n = leia.nextInt();
			if ( n < 0 ) {
				System.out.println("\n\tErro! Entre com um valor moir ou igual a zero.\n");
			}
		} while ( n < 0 );
		
		if ( n > 0 ) {
			System.out.print("\nSequencia: ");
			for ( int i = 1 ; i <= n ; i++ ) {
				System.out.print( a + " " );
				c = a + b;
				a = b;
				b = c;
			}
		} else {
			System.out.println("Fim do programa!");
		}
	}
}

