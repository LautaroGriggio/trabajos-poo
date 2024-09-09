package ejerciciosJava;
import java.util.Scanner;
public class talo {
//lo primero poner ejerciciosJava, lo segundo poner talo
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		//Declaramos las variables
		int num1=10;
		int num2=5;
 
		/*Realizamos las operaciones.
		 * Tambien lo podemos guardar el resultado en variables. */
 
		System.out.println("El resultado de la suma es "+(num1+num2));
 
		System.out.println("El resultado de la resta es "+(num1-num2));
 
		System.out.println("El resultado de la multiplicación es "+(num1*num2));
 
		System.out.println("El resultado de la división es "+(num1/num2));
		
		numeros(scan);
		nombre(scan);
	}

	public static void numeros(Scanner scan) {
		 
		System.out.println("ingese el primer numero");
		int a= scan.nextInt();
		System.out.println("ingese el segundo numero");
		int b= scan.nextInt();
 
		//Hacemos la comprobación
		if (a>=b){
			//If anidado
			if(a==b){
				System.out.println("Los numeros "+a+" y "+b+" son iguales");
			}
			else{
				System.out.println("El número "+a+" es mayor que el número "+b);
			}
		}
			else{
				System.out.println("El número "+b+" es mayor que el número "+a);
			}
	}
	
	public static void nombre(Scanner scan) {
		System.out.println("ingrese su nombre");
		String mensaje = scan.next();
		System.out.println("Bienvenido  " + mensaje);
	}	

}
