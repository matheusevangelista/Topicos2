import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {
	
    public static void main(String argv[ ]) throws Exception 
    { 
        String sentence; 
        String modifiedSentence; 
        while(true) {
        	BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in)); 

        	Socket clientSocket = new Socket("127.0.0.1", 6789); 

        	DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream()); 
        	BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 
        	
        	System.out.println("Qual string deseja-se enviar ao servidor?");
            sentence = inFromUser.readLine(); 

            outToServer.writeBytes(sentence + '\n');    

            modifiedSentence = inFromServer.readLine(); 

            System.out.println("Resposta do Servidor: " + modifiedSentence); 
            clientSocket.close();
       }
         
                   
    } 

}
