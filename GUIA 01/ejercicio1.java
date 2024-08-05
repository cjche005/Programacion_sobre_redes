
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner tomarvalor=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a ingresar");
        int cant = tomarvalor.nextInt();
        int num[] = new int [cant];
        
        for (int i= 0; i<cant; i++){
            System.out.println("Ingrese el numero:");
            num[i] = tomarvalor.nextInt();
        }
        int menor = buscador(num);
        System.out.println("El numero menor ingresado es:"+ menor);
    }
    public static int buscador(int[] cant) {
        int menor = cant[0];
        for(int i =1; i<cant.length;i++){
            if (cant[i] < menor){
                menor=cant[i];
            }
        }
        return menor;
    }
}
