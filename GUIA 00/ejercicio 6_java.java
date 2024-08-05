
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner tomar=new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int n1=tomar.nextInt();
        System.out.println("Ingrese un segundo numero");
        int n2=tomar.nextInt();
        System.out.println("Ingrese un tercer numero");
        int n3=tomar.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println("n1 es mayor");
        } else if(n2>n3){
            System.out.println("n2 es mayor");
        } else{
            System.out.println("n3 es mayor");
        }
        
        if(n1<n2 && n1<n3){
            System.out.println("n1 es menor");
        } else if(n2<n3){
            System.out.println("n2 es menor");
        } else{
            System.out.println("n3 es menor");
        }
    }
}
