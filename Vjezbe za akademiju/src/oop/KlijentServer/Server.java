package oop.KlijentServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        Socket socket = serverSocket.accept();

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        int num1 = dataInputStream.readInt();
        int num2 = dataInputStream.readInt();

        int result = num1 + num2;
        dataOutputStream.writeInt(result);

        dataInputStream.close();
        dataOutputStream.close();
        socket.close();
        serverSocket.close();
    }
}

