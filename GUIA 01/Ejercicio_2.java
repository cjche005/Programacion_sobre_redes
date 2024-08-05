
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
        int mayor = buscador(num);
        System.out.println("El numero mayor ingresado es: "+ mayor);
    }
    public static int buscador(int[] cant) {
        int mayor = cant[0];
        for(int i =1; i<cant.length;i++){
            if (cant[i] > mayor){
                mayor=cant[i];
            }
        }
        return mayor;
    }
}
