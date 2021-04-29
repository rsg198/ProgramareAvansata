package lab10_server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpServer {
    // Defininire port
    public static final int PORT = 2100;
    public SimpServer() throws IOException {
        ServerSocket serverSocket = null ;
        try {
            serverSocket = new ServerSocket(PORT);
            while (true) {
                System.out.println ("Waiting for a client ...");
                Socket socket = serverSocket.accept();
                // Executam request de la client
                new ClientThread(socket).start();
            }
        } catch (IOException e) {
            System.err. println ("Ooops... " + e);
        } finally {
            serverSocket.close();
        }
    }
    public static void main ( String [] args ) throws IOException {
        SimpServer server = new SimpServer ();
    }
}