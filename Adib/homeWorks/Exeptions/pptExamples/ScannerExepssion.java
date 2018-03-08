package homeWorks.Exeptions.pptExamples;

import java.util.InputMismatchException;

import java.util.Scanner;



public class ScannerExepssion extends Exception {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		float f;
		while(true){
			
//			try {
//				System.out.println("enter a float");
//				f=sc.nextFloat();
//				if (f%1==0) {
//					
//					System.out.println("wrong input");
//				}
//			} catch (InputMismatchException myExeption) {
//				System.out.println("wrong input from InputMisMatch");
//				break;
//			}catch (NoSuchElementException e) {
//				System.out.println("wrong input from NoSuchElement");
//				break;
				//Thrown by the nextElement method of an Enumeration to indicate that there are no more elements in the enumeration.
//			}catch (IllegalStateException g) {
//				System.out.println("wrong input from IllegalState");
//				break;
				//Signals that a method has been invoked at an illegal or inappropriate time. In other words, the Java environment or Java application is not in an appropriate state for the requested operation.
//			}
			
			try {
				System.out.println("enter a flaot");
				
				
				System.out.println(CheckFloat(sc));
			} catch (ScannerExepssion e) {
				System.err.println("wrong typing");
			}
		}
	}
	public ScannerExepssion(String message) {
        super(message);
    }
	private static float CheckFloat(Scanner sc) throws ScannerExepssion {
	    try {
	        float input = sc.nextFloat();
	        if (input % 1 == 0) {
	            throw new ScannerExepssion("Wrong type");
	        } else {
	            return input;
	        }
	    } catch (InputMismatchException ime) {
	        sc.next(); // Flush the scanner

	        // Re-throw your own exception
	        throw new ScannerExepssion("Wrong type");
	    }
	}
}
