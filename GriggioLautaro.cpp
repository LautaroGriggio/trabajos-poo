
#include <stdio.h>
#include <string.h>
#include <windows.h>

#define violeta 5
#define azul 3
#define celeste 11
#define rojo 12
#define rosa 13
#define blanco 15


#define clases 4
#define horarios 5
	//constantes (no van a cambiar)
	 char* nombre_de_clases[clases] = {"TopRide", "zumba", "entrenamiento", "abdominales"};
	 int max_cupo = 5;

//creo la funcion para ponerle color al programa
void color(int c) {
    HANDLE hconsole = GetStdHandle(STD_OUTPUT_HANDLE);
    SetConsoleTextAttribute(hconsole, c);
}

//funcion para iniciar una matriz
void iniciarMatriz(int matriz[clases][horarios]) {
    for (int i = 0; i < clases; i++) {
        for (int j = 0; j < horarios; j++) {
            matriz[i][j] = 0;
        }
    }
}
//funcion para buscar entre las clases
int buscarClase(const char* nombre) {
    for (int i = 0; i < clases; i++) {
        if (strcmp(nombre_de_clases[i], nombre) == 0) {
            return i;
        }
    }
    
}
//creo funcion para verificar qeu todo sea valido y si es asi anutar alumnos
void anotarAlu(int matriz[clases][horarios], int cupo[clases], const char* nombre_clase, int horario) {
    int clase = buscarClase(nombre_clase);
    if (clase == -1 || horario < 0 || horario >= horarios) {
        printf("esta clase y/o horario son invalidos\n");
        return;
}
    if (matriz[clase][horario] < cupo[clase]) {
        matriz[clase][horario]++;
        printf("el alumno fue anotado en %s, horario %d.\n", nombre_clase, horario + 1);
    } else {
        printf("el cupo esta lleno para %s en el horario %d.\n", nombre_clase, horario + 1);
}
}
//funcion para contar cuantos alumnos hay
void informeAsistencia(int matriz[clases][horarios], int cupo[clases]) {
    for (int i = 0; i < clases; i++) {
        int alumnos_tot = 0;
        for (int j = 0; j < horarios; j++) {
            alumnos_tot += matriz[i][j];
      }
        printf("la cant de personas que fueron a la calse de %s: fue de %d\n", nombre_de_clases[i], alumnos_tot);
    }
}

//funcion para verificar cauntas y que clases / horarios tuvieron y no tuvieron alumnos 
void informeHorarios(int matriz[clases][horarios]) {
    int clases_vacias = 0, horario_vacio = 0;

	//reviso
    for (int i = 0; i < clases; i++) {
        int clase_vacia = 1;
        for (int j = 0; j < horarios; j++) {
            if (matriz[i][j] > 0) {
                clase_vacia = 0;
                break;
            }
        }
        //opcion de ningun alumn
        if (clase_vacia) {
            printf("la class %s no tuvo alumnos.\n", nombre_de_clases[i]);
            clases_vacias++;
        }
}
	//reviso
    for (int j = 0; j < horarios; j++) {
        int hor_vacio_loc = 1;
        for (int i = 0; i < clases; i++) {
            if (matriz[i][j] > 0) {
                hor_vacio_loc = 0;
                break;
            }
        }
        //opciones para cada situacion
        if (hor_vacio_loc) {
            printf("en el horario %d no hubo clases\n", j + 1);
            horario_vacio++;
        }
    }

    if (clases_vacias == 0) {
        printf("todas las clases tuvieron alumnos\n");
    }

    if (horario_vacio == 0) {
        printf("en todos los horarios hubieron clases\n");
    }
}

//creo funcion para calcular las ganancias con los precios segun hoarrio
void informeGanancia(int matriz[clases][horarios]) {
    float tot_ganancia = 0;
    //lista de precios
    int precios[horarios] = {560, 560, 700, 805, 805}; 

    for (int j = 0; j < horarios; j++) {
        int alumnos_horario = 0;
        for (int i = 0; i < clases; i++) {
            alumnos_horario += matriz[i][j];
        }
        tot_ganancia += alumnos_horario * precios[j];
    }
    printf("la ganancia total del dia es: %.2f\n", tot_ganancia);
}

int main() {
    int cupo[clases] = {max_cupo, max_cupo, max_cupo, max_cupo};
    int asistencia[clases][horarios];
    int continuar = 1;

    iniciarMatriz(asistencia);
		//inicio un ciclo para que el usuario ingrese los datos
		do{
        char nombre_clase[20];
        int horario;
		color(celeste);
		//ingresan los datos
        printf("Ingresa el nombre de la clase:  (TopRide, zumba, entrenamiento, abdominales): ");
        scanf("%s", nombre_clase);
        color(violeta);
        printf("Ingresa el horario (1-5): ");
        scanf("%d", &horario);

        anotarAlu(asistencia, cupo, nombre_clase, horario - 1);
		color(rojo);
        printf("quiere seguir ingtresando datos (1 - SI X 0 - NO): ");
        scanf("%d", & continuar);
    }while(continuar!=0);

    //llamo las funciones y les doy color para que quede prolijo 
   	color(rosa);
    informeAsistencia(asistencia, cupo);
    color(azul);
    informeHorarios(asistencia);
    color(blanco);
    informeGanancia(asistencia);

    return 0;
    }
