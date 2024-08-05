
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner tomar= new Scanner(System.in);
        int totalnum= 10;
        int suma = 0;
        System.out.println("Ingrese un numero: ");
        int n1=tomar.nextInt();
        suma += n1;
        System.out.println("Ingrese otro numero:");
        int n2=tomar.nextInt();
        suma += n2;
        System.out.println("Ingrese otro numero:");
        int n3= tomar.nextInt();
        suma += n3;
        System.out.println("Ingrese otro numero:");
        int n4=tomar.nextInt();
        suma += n4;
        System.out.println("Ingrese otro numero:");
        int n5=tomar.nextInt();
        suma += n5;
        System.out.println("Ingrese otro numero:");
        int n6=tomar.nextInt();
        suma += n6;
        System.out.println("Ingrese otro numero:");
        int n7=tomar.nextInt();
        suma += n7;
        System.out.println("Ingrese otro numero:");
        int n8=tomar.nextInt();
        suma += n8;
        System.out.println("Ingrese otro numero:");
        int n9=tomar.nextInt();
        suma += n9;
        System.out.println("Ingrese otro numero:");
        int n10=tomar.nextInt();;
        suma += n10;
        double promedio= (double) suma/totalnum;
        System.out.println("El promedio de los numeros es: "+ promedio);
    }
}
