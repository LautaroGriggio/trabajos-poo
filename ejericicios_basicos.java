package ejerciciosJava;
import java.util.Scanner;
public class talo {
//lo primero poner ejerciciosJava, lo segundo poner talo. 
//hechos: 1; 2; 4; 5; 6; 9; 12; 13; 14; 15;
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
		
		 
		case 8:{
			ventas(scan);
		break;}
		
		case 9:{
			ecuacion(scan);
		break;}
		
		case 10:{
			dowhile(scan);
		break;}
		
		case 11:{
			contraseña(scan);
		break;}
		
		case 12:{
		
			incorrecta(scan);
		break;}
		
		case 13:{
			semana(scan);
		break;}
		
		case 14:{
			rand(scan);
		}
		case 15:{
			cifras(scan);
			
		}
		case 16:{
			primo(scan);
		}
		case 17:{
			pri();
		}
		
		case 18:{
		lluvia();	
		}
		
		case 19:{
		calcu(scan);
		}
		
		case 20:{
			suma(scan);
		}
		
		case 21:{
			contNum(scan);
		}
		
		
		case 22:{
			espacios(scan);
		}
		
		case 23:{
			mayus(scan);
		}
		
		case 24:{
			longi(scan);
		}
		
		case 25:{
			palabras(scan);
		}
		
		case 26:{
			separa(scan);
		}
		
		case 27:{
			contar(scan);
		}
		

		
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
			if(num%2==0 || num%3==0){
				System.out.println("  " +num);
		
			}
			num++;
		};
	}
	
	public static void ventas(Scanner scan) {
	
		System.out.println(" Introduce el número de ventas ");
        int Nventas= scan.nextInt();
        int sumaVentas=0;
        for (int i=0;i<Nventas;i++){
            System.out.println("Introduce el precio de la venta "+(i+1));
            int totventa = scan.nextInt();
        
            sumaVentas = sumaVentas+ totventa;
        }
 
        System.out.println("el total a pagar por todas lasventas es de:  " +sumaVentas);
	}
	
	public static void ecuacion(Scanner scan) {
		System.out.println("Introduce el valor de a  ");
        int a=scan.nextInt();
        System.out.println("Introduce el valor de b  ");
        int b=scan.nextInt();
        System.out.println("Introduce el valor de c  ");
        int c=scan.nextInt();
        
        double disc = Math.pow(b, 2)-(4*a*c);
        
    
        System.out.println(" >> " +disc);
 
        if (disc>0){

            double X1=((b*(-1))+Math.sqrt(disc))/(2*a);
            double X2=((b*(-1))-Math.sqrt(disc))/(2*a);
 
            System.out.println("el valor de x1 es "+X1+" y el valor de x2 es " +X2);
        }
        else{
            System.out.println("el discriminante es negativo ");
        }
	}
	
	public static void dowhile(Scanner scan) {
      
		
		int n;
		do{
            System.out.println(" ingresa un numero mayor que 0");
            n=scan.nextInt();
        }while(n<=0);
 
        System.out.println(n);
    }
	
	public static void contraseña(Scanner scan) {
		 
		        String contraseña="abc";
		 
		        final int INTENTOS = 3;
		        

		        boolean acierto=false;
		 
		        String contra;
		        for (int i=0;i<INTENTOS && !acierto;i++){
		            System.out.println("Introduce una contraseña");
		            contra = scan.next();
		 
		            if (contra.equals(contraseña)){
		                System.out.println("biennn, acertaste");
		                acierto=true;
		            }
		        }
		    }
	public static void incorrecta(Scanner scan) {
		
		String contraseña="abc";
		String contra;  
        final int INTENTOS = 3;
        

        boolean acierto=false;
        
        for (int i = 0; i < INTENTOS && !acierto; i++) {
            System.out.println("Introduce una contraseña:");
            contra = scan.next(); 

            if (contra.equals(contraseña)) { 
                System.out.println("biennnn, acertaste !");
                acierto = true;   
            } else {
                System.out.println("Contraseña incorrecta. Te quedan " + (INTENTOS - i - 1) + " intentos.");
            }
        }

        if (!acierto) { 
            System.out.println("agotaste todos los intentos.");
        }
	}
	
	public static void semana(Scanner scan) {
		
		System.out.println("Introduce un dia de la semana (lunes, martes, etc.):");
        String dia = scan.nextLine();
        
        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println(dia + " es un dia laboral.");
                break;
            case "sabado":
            case "domingo":
                System.out.println(dia + " no es un dia laboral.");
                break;
            default:
                System.out.println("El dia ingresado no es válido.");
        }
	}
	
	public static void rand(Scanner scan) {
		System.out.println("Introduce el primer numero:");
        int num1 = scan.nextInt();
        
        System.out.println("Introduce el segundo numero:");
        int num2 = scan.nextInt();
        
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        
        System.out.println(" 10 numeros aleatorios entre " + min + " y " + max + ":");
        

        for (int i = 0; i < 10; i++) {
            int aleatorio = (int) (Math.random() * (max - min + 1)) + min;
            System.out.println("los numeros son "+ aleatorio );
        }
	}
	public static void cifras(Scanner scan) {
		
	int numero;

    do {
        System.out.println("Introduce un numero positivo:");
        numero = scan.nextInt();
        if (numero <= 0) {
            System.out.println("Error: El numero debe ser positivo.");
        }
    } while (numero <= 0); 


    int cifras = String.valueOf(numero).length(); 
    
    if (cifras == 1) {
        System.out.println("El numero tiene 1 cifra.");
    } else {
        System.out.println("El numero tiene " + cifras + " cifras.");
    }
	
	}
	
	public static void primo(Scanner scan) {
		
		System.out.println("Introduce un numero:");
        int numero = scan.nextInt();
        
        if (esPrimo(numero)) {
            System.out.println(numero + " es un numero primo.");
        } else {
            System.out.println(numero + " no es un numero primo.");
        }
    }

 

	
    public static void pri(){
    	System.out.println("Numeros primos entre 1 y 100:");
        

        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.println(i);  // 
            }
        }
    }


    public static boolean esPrimo(int numer) {

        if (numer <= 1) {
            return false;
        }

        int raiz = (int) Math.sqrt(numer);
        for (int i = 2; i <= raiz; i++) {
            if (numer % i == 0) {
                return false;  
            }
        }
        
        return true;
    }
    
    public static void lluvia() {
        String frase = "La lluvia en Sevilla es una maravilla";
        int contadorVocales = 0;


        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            
 
            if (esVocal(caracter)) {
                contadorVocales++;
            }
        }

        System.out.println("El numero total de vocales es: " + contadorVocales);
    }

    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
    public static void calcu(Scanner scan) { 
    	System.out.print("Ingrese el primer operando (numero entero): ");
        int operando1 = scan.nextInt();

        System.out.print("Ingrese el segundo operando (numero entero): ");
        int operando2 = scan.nextInt();


        System.out.print("Ingrese el signo aritmetico (+, -, *, /, ^, %): ");
        String operacion = scan.next();

     
        String resultado = "";

     
        switch (operacion) {
            case "+":
                resultado = "La suma es: " + (operando1 + operando2);
                break;
            case "-":
                resultado = "La resta es: " + (operando1 - operando2);
                break;
            case "*":
                resultado = "La multiplicación es: " + (operando1 * operando2);
                break;
            case "/":
                if (operando2 != 0) {
                    double division = (double) operando1 / operando2;
                    resultado = "La division es: " + division;
                } else {
                    resultado = "Error: Division por cero.";
                }
                break;
            case "^":
                double potencia = Math.pow(operando1, operando2);
                resultado = "El resultado de la potencia es: " + potencia;
                break;
            case "%":
                resultado = "El modulo es: " + (operando1 % operando2);
                break;
            default:
                resultado = "Operación no valida.";
        }


        System.out.println(resultado);


    }
    
    public static void suma(Scanner scan) {
    	 int numero;
         

         do {
             System.out.print("Ingrese un numero mayor que 1: ");
             numero = scan.nextInt();

             if (numero <= 1) {
                 System.out.println("El numero debe ser mayor que 1.");
             }
         } while (numero <= 1);


         int suma = 0;

         for (int i = 1; i <= numero; i++) {
             suma += i;
         }

         System.out.println("La suma de los numeros de 1 a " + numero + " es: " + suma);

     
    }
    
    public static void contNum(Scanner scan) {
    	int numero;
        int contador = 0;

      
        do {
            System.out.print("Ingrese un numero (o -1 para terminar): ");
            numero = scan.nextInt();

            if (numero != -1) {
                contador++;  
            }

        } while (numero != -1);


        System.out.println("Has ingresado " + contador + " numeros.");

    }
    
    
    public static void espacios(Scanner scan) {
        System.out.print("Ingrese una frase: ");
        String frase = scan.nextLine();


        String fraseSinEspacios = frase.replace(" ", "");


        System.out.println("Frase sin espacios: " + fraseSinEspacios);

    }

    
    
    public static void mayus(Scanner scan) {
    	System.out.print("Ingrese una frase: ");
        String frase = scan.nextLine();

        System.out.print("queres cambiar entre mayuscula o minusculas (M/m): ");
        String opcion = scan.next();


        String resultado;

      
        if (opcion.equalsIgnoreCase("M")) {
            resultado = frase.toUpperCase(); 
        } else if (opcion.equalsIgnoreCase("m")) {
            resultado = frase.toLowerCase(); 
        } else {
            resultado = "Opcion no válida. Intente nuevamente.";
        }

        System.out.println("Resultado: " + resultado);

    }
    
    public static void longi(Scanner scan){
    	 System.out.print("Ingrese una frase: ");
         String frase = scan.nextLine();

      
         int longitud = frase.length();

       
         System.out.println("La longitud de la frase es: " + longitud);

    	
    }
    
    public static void palabras(Scanner scan) {
    	System.out.print("Ingrese la primera palabra: ");
        String palabra1 = scan.nextLine();

        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = scan.nextLine();


        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales.");
        } else {
            System.out.println("Las palabras son diferentes.");
        }
    }
    
    public static void separa(Scanner scan) {

        System.out.print("Ingrese una frase: ");
        String frase = scan.nextLine();

 
        String[] palabras = frase.split(" ");


        System.out.println("Las palabras en la frase son:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
    
    public static void contar(Scanner scan) {
    	 int numero;
         int mayor = Integer.MIN_VALUE;
         int menor = Integer.MAX_VALUE;
         int sumaTotal = 0;
         int sumaPositivos = 0;
         int sumaNegativos = 0;
         int contador = 0;


         System.out.println("Ingrese números (ingrese -1 para terminar):");
         
         while (true) {
             numero = scan.nextInt();

             if (numero == -1) {
                 break; 
             }

         
             if (numero > mayor) {
                 mayor = numero;
             }
             if (numero < menor) {
                 menor = numero;
             }

     
             sumaTotal += numero;
             if (numero > 0) {
                 sumaPositivos += numero;
             } else if (numero < 0) {
                 sumaNegativos += numero;
             }

     
             contador++;
         }


         double media = (contador > 0) ? (double) sumaTotal / contador : 0;


         System.out.println("Mayor numero introducido: " + (mayor == Integer.MIN_VALUE ? "Ninguno" : mayor));
         System.out.println("Menor numero introducido: " + (menor == Integer.MAX_VALUE ? "Ninguno" : menor));
         System.out.println("Suma de todos los numeros: " + sumaTotal);
         System.out.println("Suma de los numeros positivos: " + sumaPositivos);
         System.out.println("Suma de los numeros negativos: " + sumaNegativos);
         System.out.println("Media de la suma: " + media);
    }
}
