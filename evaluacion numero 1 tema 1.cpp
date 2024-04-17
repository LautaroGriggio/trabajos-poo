#include<stdio.h>
main(){
int menu,
n=5, a=0, n1, mayor=0, menor, tot, prom, i,
h1, h2, dif,
mes,
base, potencia, j=0, total=1,
turno, ciclo, especialidad, plata
;
//ingreso variables

do{
printf("que ejercicio quiere revisar: 1, 2, 3, 4, 5 o 0 para salir \n");
scanf("%d", & menu);
switch(menu){
//hago el switch dentro de un do while para que se repita	
	
	case 1:{
		for(i=0; i<n; i++){
		printf("ingresar el numero\n");
		scanf("%d", & n1);
		//le pido al usuario que ingrese los datos dentro de un for para no escribirlo 5 veces
		
		if(n1<0 && n1%2==0){
			printf("este numero no es valido, reinicia el programa\n");
		}
		if(n1>mayor||i==0){
			mayor=n1;
		//busco el mayor numero comparando el mayor hasta el momento con el nuevo ingresado
		}
		if(n1<menor||i==0){
			menor=n1;
		//busco el mayor numero comparando el menor hasta el momento con el nuevo ingresado	
		}
		tot=tot+n1;
		n1=0;
		//calculo el total sumando todos los numeros
		
	}
	prom= tot/5;
	printf("el mayor numero es: %d\n", mayor);
	printf("el menor numero es: %d\n", menor);
	printf("el promedio es %d\n", prom);
	//imprimo resultados
		break;
	}
	case 2:{
		printf("ingresar edad del primer hermano\n");
		scanf("%d", & h1);
		printf("ingresar edad del segundo hermano\n");
		scanf("%d", & h2);	
		//pido datos
		if(h1>h2){
			printf("el hermano mayor es el primer ingresado\n");
			printf("el hermano menor es el segundo ingresado\n");		
			dif=h1-h2;		
			printf("la diferencia de edad es de %d", dif);		
		}
		else{
			printf("el hermano mayor es el segundo ingresado\n");
			printf("el hermano menor es el primero ingresado\n");
			dif=h2-h1;
			printf("la diferencia de edad es de %d\n", dif);
		}
		//completo las 2 posibilidades 	
		break;
	}
	case 3:{
		printf("ingrese un numero del 1 al 12\n");
		scanf("%d", & mes);
		//pido dato
		if(mes<0 || mes>12){
			printf("este numero no es valido");
		}
		else if(mes==1){
			printf("el mes numero 1 es enero\n");
		}
		else if(mes==2){
			printf("el mes numero 2 es febrero\n");
		}		
		else if(mes==3){
			printf("el mes numero 3 es marzo\n");
		}
		else if(mes==4){
			printf("el mes numero 4 es abril\n");
		}
		else if(mes==5){
			printf("el mes numero 5 es mayo\m");
		}
		else if(mes==6){
			printf("el mes numero 6 es junio\n");
		}		
		else if(mes==7){
			printf("el mes numero 7 es julio\n");
		}
		else if(mes==8){
			printf("el mes numero 8 es agosto\n");
		}		
		else if(mes==9){
			printf("el mes numero 9 es septiembre\n");
		}		
		else if(mes==10){
			printf("el mes numero 10 es octubre\n");
		}		
		else if(mes==11){
			printf("el mes numero 11 es noviembre\n");
		}		
		else{
			printf("el mes numero 12 es diciembre\n");
		}		
		//completo las 12 posibilidades 				
		break;
	}
	case 4:{
		printf("ingrese el numero que sera la base\n");
		scanf("%d", & base);
		if(base<0 && n1%2==0){
			printf("este numero no es valido, reinicia el programa\n ");
		}
		printf("ingrese el numero que sera la potencia\n");
		scanf("%d", & potencia);		
		if(potencia<0){
			printf("este numero no es valido, reinicia el programa\n");
		}
		//pido datos
		while(j != potencia){
		total=total*base;
		j++;
		}
		//hago un bucle el cual se repetira hasta que se haga la cantidad indicada por la potencia
		printf("el resultado es %d\n", total);
				
		break;
	}
	case 5:{
		printf("ingrese su turno (1 mañana - 2 tarde - 3 noche)\n");
		scanf("%d", & turno);
		printf("ingrese su especialidad (1 programacion - 2 contabilidad - 3 diseño web - 4 otra)\n");
		scanf("%d", & especialidad);
		printf("ingrese si pagara en el primer(ingrese 1) o segundo ciclo(ingrese 2)\n");
		scanf("%d", & ciclo);
		//pido que ingrese todos los datos
		
		if(turno==1){
			plata=plata+250;
		}
		else if(turno==2){
			plata=plata+200;
		}
		else{
			plata=plata+300;
		}
		//asigno el dinero al total segun el turno
		if(especialidad==1 && ciclo==1){
			plata=plata+3000;
		}
		else if(especialidad==1 && ciclo==2){
			plata=plata+3200;
		}
		else if(especialidad==2 && ciclo==1){
			plata=plata+2500;
		}		
		else if(especialidad==2 && ciclo==2){
			plata=plata+2800;
		}
		else if(especialidad==3 && ciclo==1){
			plata=plata+3200;
		}		
		else if(especialidad==3 && ciclo==2){
			plata=plata+3500;
		}		
		else if(especialidad==4 && ciclo==1){
			plata=plata+2000;
		}		
		else if(especialidad==4 && ciclo==2){
			plata=plata+2500;
		}		
		//asigno el monto total seun el ciclo y la especialidad
	printf("el total a pagar de este alumno es de %d\n", plata);
		break;
	}
}
}
while(menu!=0);
		
}
