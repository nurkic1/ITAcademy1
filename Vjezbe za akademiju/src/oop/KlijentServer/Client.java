package oop.KlijentServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        Socket socket = new Socket("localhost", 5000);

        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

        dataOutputStream.writeInt(num1);
        dataOutputStream.writeInt(num2);

        int result = dataInputStream.readInt();
        System.out.println("Result: " + result);

        scanner.close();
        dataInputStream.close();
        dataOutputStream.close();
        socket.close();
    }
}

