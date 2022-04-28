import java.util.Scanner;

public class Transito {

	public static void main(String []arg) {

	   Scanner teclado = new Scanner(System.in);
	   int opcion;

do {

	System.out.println("=====================================================================================================");

	System.out.println("\t\t~~Departamento de Seguridad Publica y Transito de la CDMX~~");
	System.out.println("");

	System.out.println("=====================================================================================================");

	System.out.println("\t\t\t  [1] Pago de Tenencia");
	System.out.println("\t\t\t  [2] Obtencion de Calcomania");
	System.out.println("\t\t\t  [3] Pago de Licencia");
	System.out.println("\t\t\t  [4] Salir");

	System.out.print("\t\t\t\t Elige opcion:__ ");
	opcion = teclado.nextInt();

	System.out.println("====================================================================================================");
switch(opcion) {
	case 1:
		int anio;
		int s, subtotal, q = 4;
		int y = 2022;
		int t = 1000;
	   	char NP;
		double iva, total;

		System.out.println("Pago de Tenencia");

		      System.out.println("Ingresa tu Numero de Placa ");
		      NP = teclado.next().charAt(0);
		      System.out.println("Ingresa tu Ultimo año Pagado ");
		      anio = teclado.nextInt();

		for (int a = anio; a <= y; ++a) {
			System.out.println("Paga" + a + " " + 1000);
		}
		System.out.println("");
		System.out.println("Su numero de placa: " + NP);
		System.out.println("Su ultimo ano pagado: " + anio);

		subtotal = t * q;
		System.out.println("Subtotal: " + subtotal );
		
		iva = subtotal * .15;
		System.out.println("IVA(15%):" + iva );

		total = subtotal + iva;
		System.out.println("Total: " + total );

		break;
	case 2:
		int h;
		char p;

		System.out.println("Ingrese numero de placa");
		p = teclado.next().charAt(0);
		System.out.println("Ingrese el ultimo digito de su placa");
		h = teclado.nextInt();

				
			if (h == 1) {
			System.out.println("Numero de placa: " + p);
			System.out.println("Calcomania Color : Rosa");
			}

			if (h == 2) {
			System.out.println("Numero de placa: " + p);
			System.out.println("Calcomania Color : Rosa");
			}

			if (h == 3) {
			System.out.println("Numero de placa: " + p);
			System.out.println("Calcomania Color : Verde");
			}

			if (h == 4) {
			System.out.println("Numero de placa: " + p);
			System.out.println("Calcomania Color : Verde");
			}

			if (h == 5) {
			System.out.println("Numero de placa: " + p);
			System.out.println("Calcomania Color : Azul");
			}

			if (h == 6) {
			System.out.println("Numero de placa: " + p);
			System.out.println("Calcomania Color : Azul");
			}

			if (h == 7) {
			System.out.println("Numero de placa: " + p);
			System.out.println("Calcomania Color : Amarilla");
			}

			if (h == 8) {
			System.out.println("Numero de placa: " + p);
			System.out.println("Calcomania Color : Amarilla");
			}

			if (h == 9) {
			System.out.println("Numero de placa: " + p);
			System.out.println("Calcomania Color : Roja");
			}

			if (h == 0) {
			System.out.println("Numero de placa: " + p);
			System.out.println("Calcomania Color : Roja");
			}
		break;
	case 3:

		int number;

		System.out.println("Pago de Licencia");

		System.out.println("\t\t\t   Tipo      3 años       5 años");
		System.out.println("\t\t\t[1] A         300            400");
		System.out.println("\t\t\t[2] B         400            500");
		System.out.println("\t\t\t[3] C         500            700");
		System.out.println("\t\t\t[4] D         600            800");
		System.out.print("\t\t\t\tElige tu option:__ ");
		number = teclado.nextInt();

	switch(number) {
		case 1:
				int cas;
				System.out.println("Tipo: A");
				System.out.println("[1] 3 años:  300");
				System.out.println("[2] 5 años:  400");
				System.out.print("Eligue tu opcion: ");
				cas = teclado.nextInt();

			switch(cas){
				case 1:
					System.out.println("");
					System.out.println("Tipo de Licencia: A");
					System.out.println("Numero de años: 3");
					System.out.println("Costo de la licencia: $300");
 					break;
				case 2:
					System.out.println("");
					System.out.println("Tipo de Licencia: A");
					System.out.println("Numero de años: 5");
					System.out.println("Costo de la licencia: $400");
					break;
					}//tipoA
					break;

		case 2:
				int das;
				System.out.println("Tipo: B");
				System.out.println("[1] 3 años:  400");
				System.out.println("[2] 5 años:  500");
				System.out.print("Eligue tu opcion: ");
				das = teclado.nextInt();

			switch(das){
				case 1:
					System.out.println("");
					System.out.println("Tipo de Licencia: B");
					System.out.println("Numero de años: 3");
					System.out.println("Costo de la licencia: $400");
 					break;
				case 2:
					System.out.println("");
					System.out.println("Tipo de Licencia: B");
					System.out.println("Numero de años: 5");
					System.out.println("Costo de la licencia: $500");
					break;
					}//tipoB
					break;
				
		case 3:  
				int val;
				System.out.println("Tipo: C");
				System.out.println("[1] 3 años:  500");
				System.out.println("[2] 5 años:  700");
				System.out.print("Eligue tu opcion: ");
				val = teclado.nextInt();
			
			switch(val){
				case 1:
					System.out.println("");
					System.out.println("Tipo de Lincencia: C");
					System.out.println("Numero de años: 3");
					System.out.println("Costo de la licencia: $500");
 					break;
				case 2:
					System.out.println("");
					System.out.println("Tipo de Licencia: C");
					System.out.println("Numero de años: 5");
					System.out.println("Costo de la licencia: $700");
					break;
					}//tipoC
					break;

		case 4:  
				int ter;
				System.out.println("Tipo: D");
				System.out.println("[1] 3 años:  600");
				System.out.println("[2] 5 años:  800");
				System.out.print("Eligue tu opcion: ");
				ter = teclado.nextInt();
			
			switch(ter){
				case 1:
					System.out.println("");
					System.out.println("Tipo de Licencia: D");
					System.out.println("Numero de años: 3");
					System.out.println("Costo de la licencia: $600");
 					break;
				case 2:
					System.out.println("");
					System.out.println("Tipo de Licencia: D");
					System.out.println("Numero de años: 5");
					System.out.println("Costo de la licencia: $800");
					break;
					}//tipoC
					break;

			}//finswitch2

		break;
	case 4:
		System.out.println("Adios, Que tenga un lindo dia !!");
		break;
	default:
		break;

}//fin switch
	System.out.println("====================================================================================================");

   } while (opcion != 4);  

 }//finmain
}//fin class