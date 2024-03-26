#include <stdio.h>
int main()
{
int num, menu, num1, num2, num3;
do{
	printf("cual opcion queres? o 0 para finalizar");
	scanf("%d", &menu);
	switch(menu){
		case 1:
			printf("escribi un numero: ");
			scanf("%d", & num);
			if(num>=0){
				printf ("el numero es positivo");
			}
			else{
				printf("el numero es negativo");
			}
			break;
		case 2:
			printf("escribe un numero");
			scanf("&d", & num);
			if(num%2==0){
				printf("el numero es par");
				
			}
			else{
				printf("el numero es impar");
			}
			break;
		case 3:
			printf("escribe un numero: ");
			scanf("%d", & num);
			if(num%2==0){
			printf("el numero es multiplo de 2");
			if(num%3==0){
				printf("el numero es multiplo de 3");
			}
			}
			else if(num%3==0){
				printf("el numero es multiplo de 3");
			}
			break;
			case 4:
				printf("ponga los 3 numeros: "),
				scanf("%d %d %d", & num1, &num2, &num3);
				if(num1>num2 && num2 > num3){
					printf("el primer numero ingresado es el mayor");
				}
				else if(num2>num1 && num2>num3){
					printf("el segundo numero ingresado es el mayor");
				}
				else if(num3>num1 && num3>num1){
					printf("el tercer numero es el mayor");
				}
				else if(num1== num2 && num1== num3){
					printf("los 3 numeros son iguales");
				}
				else if (num1, num2, num3 == 0){
					printf("los 3 numeros son 0");
				}
				else if( num1> num2 && num1==num3){
					printf("el primer y tercer numero son los mayores");
				}
				else if( num2> num1&& num2==num3){
					printf("el segundo y tercer numero son los mayores");
				}
				else if( num1> num3 && num1==num2){
					printf("el primer y segundo numero son los mayores");
				}
				break;
	}
	}while(menu!=0);
}

