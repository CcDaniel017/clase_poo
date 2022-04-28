package InstrumentoUnidad2;

import java.util.Scanner;

/**
 *
 * @author Daniel Castro Cervantes
 */

public class MayorMenor {
    
	public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
		int n1, n2, n3, n4, n5;

		System.out.println("Ingresa cantidad 1 ");
		n1 = in.nextInt();

		System.out.println("Ingresa cantidad 2 ");
		n2 = in.nextInt();

		System.out.println("Ingresa cantidad 3 ");
		n3 = in.nextInt();
                
                System.out.println("Ingresa cantidad 4 ");
                n4 = in.nextInt();
                
                System.out.println("Ingresa cantidad 5 ");
		n5 = in.nextInt();

		if (n1 < n2) {
			if (n1 < n3) {
                            if (n1 < n4){
                                if (n1 < n5) {
                                    System.out.println("Menor: " + n1);
                                } 
                            }
                        }
		} 

		if (n2 < n3) {
			if (n2 < n1) {
                             if (n2 < n4){
                                if (n2 < n5) {
                                    System.out.println("Menor: " + n2);
                                } 
                            } 
			}	
		}

		if (n3 < n1) {
			if (n3 < n2) {
                            if (n3 < n4){
                                if (n3 < n5){
                                    System.out.println("Menor: " + n3);
                                }
                            }
			}
		}
                if (n4 < n1) {
			if (n4 < n2) {
                            if (n4 < n3){
                                if (n4 < n5){
                                    System.out.println("Menor: " + n4);
                                }
                            }
			}
		}
                if (n5 < n1) {
			if (n5 < n2) {
                            if (n5 < n3){
                                if (n5 < n4){
                                    System.out.println("Menor: " + n5);
                                }
                            }
			}
		}

		if (n1 > n2) {
			if (n1 > n3) {
                            if (n1 > n4){
                                if (n1 > n5) {
                                    System.out.println("Mayor: " + n1);
                                } 
                            }
                        }
		} 

		if (n2 > n3) {
			if (n2 > n1) {
                             if (n2 > n4){
                                if (n2 > n5) {
                                    System.out.println("Mayor: " + n2);
                                } 
                            } 
			}	
		}

		if (n3 > n1) {
			if (n3 > n2) {
                            if (n3 > n4){
                                if (n3 > n5){
                                    System.out.println("Mayor: " + n3);
                                }
                            }
			}
		}
                if (n4 > n1) {
			if (n4 > n2) {
                            if (n4 > n3){
                                if (n4 > n5){
                                    System.out.println("Mayor: " + n4);
                                }
                            }
			}
		}
                if (n5 > n1) {
			if (n5 > n2) {
                            if (n5 > n3){
                                if (n5 > n4){
                                    System.out.println("Mayor: " + n5);
                                }
                            }
			}
                }
    }
}

