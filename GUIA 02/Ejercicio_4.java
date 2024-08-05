/*
Ejercicio 4:
Escribir un método que dada una matriz de enteros y un entero que representa un índice de
columna, devuelva la fila que contiene el máximo elemento de esa columna.
*/

public class Main
{
    public static void main(String[] args) {
        //declaracion de matriz
        int matriz[][]={
            {4,78,2},
            {6,2,0},
            {5,2,8}
        };
        int columna=2;
        //impresion del mensaje
        System.out.print("La fila donde se encuentra el mayor: "+filadelMayor(matriz,columna));
    }
    
    //metodo para buscar el mayor de la fila
    public static int filadelMayor(int m[][], int colum){
        int f=0;
        int mayor=m[0][colum];
        
        for(int x=0; x<m.length; x++){
            if (m[x][colum] > mayor){
                mayor = m[x][colum];
                f= x;
            }
        }
        return f;
    }
}
