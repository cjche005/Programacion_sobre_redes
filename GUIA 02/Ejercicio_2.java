/*
Ejercicio 2:
Escribir un método que dada una matriz de enteros devuelva la cantidad de elementos
positivos que contiene la matriz.
*/

public class Main
{
    public static void main(String[] args) {
        int matriz[][]={
            {1,6,-2},
            {2,-5,-2},
            {4,5,1}//3x3
        };
        int mostrar = contarPositivos(matriz);
        System.out.print("La cantidad de positivos son: "+ mostrar);
    }
    public static int contarPositivos(int matriz[][]){
        int positivos=0;
        for(int x=0; x<matriz.length ; x++){
            for(int y=0; y < matriz[0].length; y++){
                if (matriz[x][y]>0){
                positivos=positivos + 1;
                }
            }
        }
        return positivos;
    }
}
