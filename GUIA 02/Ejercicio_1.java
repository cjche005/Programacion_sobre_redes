
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {
        int matriz[][] = {
            {1, 2, 2}, 
            {1, 1, 3}, 
            {4, 1, 1}//3x3
        };
        System.out.print(sumarMatriz(matriz));
    }
    
    public static int sumarMatriz(int matriz[][]){
    int suma=0;
    for(int x=0; x < matriz.length ; x++){
        for(int y=0 ; y < matriz[0].length ; y++ ){
        suma = suma + matriz[x][y];
            }
        }
        return suma;
    }
}
