/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {
        // declaraon de matriz
        int matriz[][] ={
            {1,4,9},
            {5,11,13},
            {6,2,7},
            {4,7,11},
        };
        
        int k= 15;
        int n= 47;
        
        //llamado del metodo 
        int matriz[][] = IntercambiarPares(m,k,n);
        int matriz[][] = IntercambiarImpares(m,k,n);
        
        
    }
    
    //creacion del metodo
    public static int[][] IntercambiarPares(int m[][], int k, int n){
        
        //recorrido de filas
        for (int fila=0; fila<m.length; fila++){
            //recorrido de columnas
            for(int columna=0; fila<m[0].length;columna=columna+2){
                //verificaciones de los valores de la matriz
                if(m[fila][columna] != 1 && m[fila][columna] != 5 && m[fila][columna] != 7){
                    m[fila][columna] = k;
                    
                }
            }
        }
        return m;
    }
    
    public static int[][] IntercambiarImpares(int m[][], int k, int n){
        //recorrido de filas
        for (int fila=0; fila<m.length; fila++){
            //recorrido de columnas
            for(int columna=1; fila<m[0].length;columna=columna+2){
                //verificaciones de los valores de la matriz
                if(m[fila][columna] != 1 && m[fila][columna] != 5 && m[fila][columna] != 7){
                    m[fila][columna] = n;
                    
                }
            }
        }
        return m;
    }
}
