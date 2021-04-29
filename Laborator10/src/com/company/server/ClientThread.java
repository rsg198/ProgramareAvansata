package lab10_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientThread extends Thread{
    private Socket socket = null ;
    public ClientThread (Socket socket) { this.socket = socket ; }
    public void run () {
        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            String request = in.readLine();
            // Trimitere raspuns server → client
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            String respond = "Hello " + request + ".";
            out.println(respond);
            out.flush();
        } catch (IOException e) {
            System.err.println("Error " + e);
        } finally {
            try {
                socket.close();
            } catch (IOException e) { System.err.println (e); }
        }
    }

}