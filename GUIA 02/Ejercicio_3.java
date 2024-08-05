/*
Ejercicio 3:
Escribir un método que dada una matriz de enteros y un entero que representa un índice de
fila, devuelva la columna que contiene el máximo elemento de esa fila.
*/

public class Main
{
    public static void main(String[] args) {
        int matriz[][]={
            {3,1,5},
            {7,4,1},
            {3,1,4}//3x3
        };
        int fila=2;
    
    int posicion=buscarMaximo(matriz,fila);
    System.out.print("El mayor se encuentra en la posicion: "+ posicion);
    }
    public static int buscarMaximo(int matriz[][], int f){
        int mayor=matriz[f][0];
        int columna=0;
        for(int x=1; x < matriz[f].length ; x++){
            if (mayor < matriz[f][x]){
                mayor=matriz[f][x];
                columna = x;
            }
        }
        return columna;
    }
}
