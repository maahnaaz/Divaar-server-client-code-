package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

public class Client {
    private BufferedReader in;
    private PrintWriter out;
    private Socket socket;
    private int port;
    private String host = "127.0.0.1";
    public boolean a=false;
    Client(int port) {
        this.port = port;
        initializeClient();
    }

    private void initializeClient() {
        try {
            socket = new Socket(host, port);
            in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            out = new PrintWriter(new OutputStreamWriter(this.socket.getOutputStream()), true);
            System.out.println("Client started...");
            a=true;
        } catch (IOException e) {
        }
    }

    void operation() {
        String str = "";
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                System.out.print("input: ");
                str = input.readLine();
                out.println(str);
                if (str.equals("bye")) break;
                System.out.println("result: " + in.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
                input.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}