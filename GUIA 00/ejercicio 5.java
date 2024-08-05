
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner tomarValor=new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num=tomarValor.nextInt();
        if (num > 0){
            System.out.println("Es positivo");
        } else if(num < 0){
            System.out.println("Es negativo");
        } else{
            System.out.println("Es cero");
        }
    }
}
