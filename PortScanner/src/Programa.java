import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;

public class Programa {
	
	public static ArrayList<Integer> conhecidas = new ArrayList<Integer>();
	public static ArrayList<Integer> registradas = new ArrayList<Integer>();
	
	public static void init(){
		for(int i=1; i<=1023; i++){
			conhecidas.add(i);
		}
		
		for(int i=1024; i<49151; i++){
			registradas.add(i);
		}
	}
	
	public static void main(String []args) {
		init();
	      
		Thread thread = new Thread(new ScannerRunnable("Portas Conhecidas", conhecidas));
		thread.start();
	   
		Thread thread2 = new Thread(new ScannerRunnable("Portas Registradas", registradas));
		thread2.start();
	}
	
	//http://www.mdkinformatica.com.br/treinamento/pdf/numeros_de_porta.pdf
}
