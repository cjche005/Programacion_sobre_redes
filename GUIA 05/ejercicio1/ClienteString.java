package ejercicio1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClienteString {
	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)) {
			
			System.out.println("Ingrese la cantidad de numeros a ingresar: ");
    			int cant = in.nextInt();
    			int num[] = new int [cant];

    			//for para enviar los numeros dentro de cada posicion del vector num[]
    			for (int i= 0; i<cant; i++){
    	            System.out.println("Ingrese el numero: ");
    	            num[i] = in.nextInt();
    	        }

				try(Socket socket = new Socket("localhost", 12345);
		
					Scanner input = new Scanner(socket.getInputStream());
					PrintWriter output = new PrintWriter(socket.getOutputStream())) {
	
					// 1.- Se envía el tamaño de los vectores al servidor.
					output.println(num.length);
					
					//enviar numero que se encuentra en cada posicion del vector
					for(int i=0; i<num.length; i++) {
						output.println(num[i]);
					}
					
					// Se asegura que la información se envíe al servidor.
					output.flush();
	
					// 4.- Se espera por el resultado que envía el servidor.
					int valorMaximo = input.nextInt();
	
					// Se imprime por pantalla el resultado.
					System.out.println(String.format("El valor maximo es: " + valorMaximo));
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
}
}
