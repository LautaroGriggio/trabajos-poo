package ejerciciosJava;
import java.util.Scanner;
public class talo {
//lo primero poner ejerciciosJava, lo segundo poner talo
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 

		int num1=10;
		int num2=5;
		System.out.println("Que ejercicio quiere ver?");
		int menu = scan.nextInt();  
		
		switch (menu){
		case 1:{

 
		System.out.println("El resultado de la suma es "+(num1+num2));
 
		System.out.println("El resultado de la resta es "+(num1-num2));
 
		System.out.println("El resultado de la multiplicación es "+(num1*num2));
 
		System.out.println("El resultado de la división es "+(num1/num2));
		
		break;}

	case 2:{
		numeros(scan);
		
		break;}
	case 3:{
		nombre(scan);
		
		break;}
	
	case 4:{
		RadioCirculo(scan);
		
		break;}
	case 5:{
		NumDiv(scan);
		
		break;}
	
		
		case 6:{
			precio(scan);
			break;}
		
		case 7:{
			ceroAcien();
			break;}
		}
	}


	public static void numeros(Scanner scan) {
		 
		System.out.println("ingese el primer numero");
		int a= scan.nextInt();
		System.out.println("ingese el segundo numero");
		int b= scan.nextInt();
 

		if (a>=b){

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


//4
	public static void RadioCirculo(Scanner scan) {
		
		System.out.println("ingrese radio");
		int radio = scan.nextInt();
		double sup = 3.14 * radio;
		
		System.out.println("la superficie del circulo es de :  " + sup);
		
	}
	
	public static void NumDiv(Scanner scan) {
		
		System.out.println("ingrese el numero para verificar");
		int n = scan.nextInt();
		if(n%2 == 0) {
			System.out.println("el numero ingresado es par");
		}
		else {
			System.out.println("el numero ingresado es inpar");
		}
	}
	
	public static void precio(Scanner scan) {
		System.out.println("ingrese el precio");
		Float precio = scan.nextFloat();
		
		double IVA = (21*precio)/100;
		double precioIva = precio + IVA;
		
		System.out.println("El precio + el Iva es un total de  " + precioIva);
		
	}
	public static void ceroAcien(){
	int num = 0;
	while(num<101){
	
		System.out.println("  " +num);
		num++;
	};
	}
	
	
	
	
	}
