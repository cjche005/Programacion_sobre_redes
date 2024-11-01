package ejercicio1;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClientHandlerr extends Thread{ // texto reverse  multi

	private Socket socket;

	public EchoClientHandlerr(Socket socket) {
		this.socket = socket;
	}
	
	public void handle() {
		this.start();
	}

	public void run() {
		
		try (Scanner in = new Scanner(socket.getInputStream());
			 PrintWriter out = new PrintWriter(socket.getOutputStream(), true))
			 {
				int size = in.nextInt();
				int vector[] = new int [size];
				
				//for para recibir los numeros del vector de ClienteString
				for(int i=0 ; i<size ; i++) {
					vector[i] = in.nextInt();
				}
				//if para enviar el valor maximo al cliente
					if (vector != null) 
					{
						  int valormaximo2 = encontrarValorMaximo(vector);
					        System.out.println("EchoServer echoing text: "+ valormaximo2);
					    
						out.println(valormaximo2);
						out.flush(); //Se asegura que se envió toda la información
					}
		} catch (Exception e) {
			System.err.println("Error communicating with client");
			e.printStackTrace();
		}

			if (this.socket != null) {
				try {
					this.socket.close();
				} catch (IOException e) {
					System.err.println("Error closing socket.");
				} finally {
					this.socket = null;
				}
			}
		}
	
	//funcion para encontrar maximo
	public static int encontrarValorMaximo(int[] vector)
	{
		int valormaximo= vector[0];
		 for(int i =1; i<vector.length;i++){
	            if (vector[i] > valormaximo){
	                valormaximo=vector[i];
	            }
	        }
		
		return valormaximo;
	}
}
