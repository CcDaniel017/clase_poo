import java.util.Scanner;

public class PrimerPara {
	public static void main (String[] args) { 

	Scanner in = new Scanner (System.in);
	int b;

	System.out.println(" ¿Cuantas repeticiones quieres? ");
	b = in.nextInt();


	
	for ( int j = 1; j <= 120; j++ ) {
		System.out.print("*");
	}

	for ( int d = 1; d <= 15; d++) {
		System.out.print(" ");
	}

	for ( int p = 1; p <= 1; p++) {
	System.out.println("PRIMER PARA ");
	}


	for ( int a = 1; a <= 120; a++ ) {
		System.out.print("*");
	}


	for ( int k = 1; k <= b; ++k ) {
		System.out.println("\t\t Hola ");
	}

	for ( int q = 1; q <= 120; q++ ) {
		System.out.print("*");
	}

	for ( int w = 1; w <= 15; w++) {
		System.out.print(" ");
	}

	for ( int r = 1; r <= 1; r++) {
	System.out.println("FIN PARA ");
	}

	for ( int S = 1; S <= 120; S++ ) {
		System.out.print("*");
	}

 } //fin main

} //fin class