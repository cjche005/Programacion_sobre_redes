
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner tomarvalor = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num=tomarvalor.nextInt();
        
        System.out.println("Tabla de multiplicar de"+ num + ":");
        
        System.out.println(num + " x 1 = " + (num * 1));
        System.out.println(num + " x 2 = " + (num * 2));
        System.out.println(num + " x 3 = " + (num * 3));
        System.out.println(num + " x 4 = " + (num * 4));
        System.out.println(num + " x 5 = " + (num * 5));
        System.out.println(num + " x 6 = " + (num * 6));
        System.out.println(num + " x 7 = " + (num * 7));
        System.out.println(num + " x 8 = " + (num * 8));
        System.out.println(num + " x 9 = " + (num * 9));
        System.out.println(num + " x 10 = " + (num * 10));
    }
}
