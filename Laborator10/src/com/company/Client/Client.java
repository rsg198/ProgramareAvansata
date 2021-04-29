package lab10_client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {
    public static void main (String[] args) throws IOException {
        String serverAddress = "127.0.0.2"; // IP server
        int PORT = 2100; // Port server
        try (
                Socket socket = new Socket(serverAddress, PORT);
                PrintWriter out =
                        new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader (
                        new InputStreamReader(socket.getInputStream())) ) {
            // Trimitere o cerere catre server
            String request = "Hello World";
            out.println(request);
            // Se asteapta raspuns de la server
            String response = in.readLine ();
            System.out.println(response);
        } catch (UnknownHostException e) {
            System.err.println("No listen... " + e);
        }
    }
}