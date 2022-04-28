import java.util.Scanner;

public class LoncheriaFer {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String opcion;
	
do {
	System.out.println("===========================================================");
	System.out.println("\t\t\t***LONCHERIA FER***");
	System.out.println("\t\tSaboreate un antojito mexicano");
	System.out.println("===========================================================");
	System.out.println("");

	System.out.println("\t\t[T] Tostadas...$40");
	System.out.println("\t\t[Q] Quesadillas...$50");
	System.out.println("\t\t[S] Sopes...$30");
	System.out.println("\t\t[E] Enchiladas...$50");
	System.out.println("\t\t[X] Salir");
	System.out.println("\t\t\t Elige la opcion: ");
	opcion = in.nextLine();

	switch(opcion.toUpperCase()) {
		case "T":
			int cantidad;
			int total = 0;

			System.out.print("Ingresar total de Tostadas ");
			cantidad = in.nextInt();
			total = 40 * cantidad;
			in.nextLine();

			for (int t=1; t <= cantidad; t++) {
			    System.out.println("Tostada " + t);
			}
			    System.out.println("Total a pagar: " + total);
			break;

		case "Q":
			int a;
			int z = 0;

			System.out.print("Ingresa total de Quesadillas ");
			a = in.nextInt();
			z = 50 * a;
			in.nextLine();

			for(int q=1; q <= a; q++) {
			   System.out.println("Quesadilla " + q);
			}
			   System.out.println("Total a pagar: " + z);
			break;

		case "S":
			int w;
			int r = 0;

			System.out.print("Ingresa total de Sopes ");
			w = in.nextInt();
			r = 30 * w;
			in.nextLine();

			for(int s=1; s <= w; s++) {
			   System.out.println("Sope " + s);
			}
			   System.out.println("Total a pagar: " + r);
			break;

		case "E":
			int d;
			int h = 0;

			System.out.print("Ingresa total de Enchiladas ");
			d = in.nextInt();
			h = 50 * d;
			in.nextLine();

			for(int e=1; e <= d; e++) {
			   System.out.println("Enchilada " + e);
			}
			   System.out.println("Total a pagar: " + h);
			break;

		case "X":
			System.out.println("Adios, Que tenga un bonito dia :') ");
			break;
		
   }//fin switch
	System.out.println("\n\n");
	System.out.println("===========================================================");

} while(!opcion.equals("X"));

 }//fin main
}//fin class