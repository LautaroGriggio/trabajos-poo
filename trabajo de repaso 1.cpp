//Lautaro Griggio 5to 2da
#include<stdio.h>
int main(){
	int alu, menu, res, base, n=3, i=0, ven, notap, acum, promP, notaF, ntp, notaT, pri, seg, mid, distancia, encuentro;
	float tot, com;
	do{
	
	printf("que ejercicio quere ver? \n[1] bondi   \n[2]sueldo   \n[3]nota   \n[4]pares    \n[5]encuentro   \n[0]salir  ");
	scanf("%d", & menu);
	
	switch(menu){
	
	case 1: 
		printf("cuantos alumnos son?\n");
		scanf("%d", & alu);
	
		if(alu>=100){
			printf("deben pagar $500 cada uno\n");
			tot= alu*500;
			printf("el total a pagar es %d", tot);
		}
		else if(alu<100 && alu>=50){
			printf("deben pagar $400 cada uno\n");
			tot= alu*400;		
			printf("el total a pagar es %d", tot);
		}
		else if(alu<=49 && alu>=30){
			printf("deben pagar $300 cada uno\n");
			tot= alu*300;
			printf("el total a pagar es %d", tot);
		}
		else{
			res=6000/alu;
			printf("deben pagar $ %d cada uno\n", res);
		}
	break;
	
	case 2:
		printf("ingrese su sueldo base\n");
		scanf("%d", & base);
		for (i=0; i<n; i++){
			printf("ingrese el monto de la venta\n");
			scanf("%d", & ven);
			com=+com + ven*0.1;
			ven=0;
		}
		tot=com+base;
		printf("el sueldo total es de %f ,  la comicion es de %f\n", tot, com);
	break;
case 3:

				for(i=1; i<4; i++){
					printf("\ningrese la nota del examen parcial numero %d \n", i);
					scanf("%d", & notap);
					acum = acum + notap;
				}
	
				promP = acum/3;
	
				printf("\nIngrese la calificacion del examen final \n");
				scanf("%d", & notaF);
			
				printf("\nIngrese la calificacion del Trabajo final \n");
				scanf("%d", & ntp);
	
				notaT = (promP*0.55 + notaF*0.3 + ntp*0.15);
				printf("La calificacion final es: %d\n", notaT);
	
			break;

			case 4:

				printf("\ningrese el primer numero(el mas alto): \n");
				scanf("%d", & pri);
				printf("\ningrese el segundo numero(el mas bajo): \n");
				scanf("%d", & seg);
				for(mid=0; mid<pri; mid++){
					if(mid<pri && mid>seg && mid%2==0){
						printf("\n %d", mid);
					}
				}
				
			break;
			case 5:

				distancia = 150-70;
				encuentro = distancia/2 + 70;
				printf("\nse van a cruzar en el km %d\n", encuentro);

			break;

}
}while(menu!=0);
}

