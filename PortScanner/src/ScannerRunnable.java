import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;

public class ScannerRunnable implements Runnable{
	
	public String tag; 
	public ArrayList<Integer> ports;
	
	public ScannerRunnable(String tag, ArrayList<Integer> ports){
		this.tag = tag;
		this.ports = ports;
	}

	@Override
	public void run() {

		for (int i=0; i <= ports.size(); i++) {
			
			 int port = ports.get(i);
			 
	         try {
	            Socket socket = new Socket();
	            socket.connect(new InetSocketAddress("127.0.0.1", port), 1000);
	            socket.close();
	            System.out.println(tag+" >> Porta " + port + " está aberta. [ABERTA]");
	        } catch (Exception ex) {
	        	System.out.println(tag+" >> Porta " + port + " está em uso.");
	        }
	      }
	}

}
