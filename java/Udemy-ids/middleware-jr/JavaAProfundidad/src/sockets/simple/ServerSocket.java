package sockets.simple;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import

public class ServerSocket {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8090);
        System.err.println("Escuchando peticiones");
        Socket client = socket.accept();
        System.err.printf("Cliente %s conectando \n", client.getInetAddress().getHostName());
    }
}
