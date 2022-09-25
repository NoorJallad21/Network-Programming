/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;


/**
 *
 * @author ROG STRIX
 */
public class TCPEchoSystemClient {

    private static InetAddress host;
    private static Socket clientSocket;
    private static final int port = 1234;

    public static void main(String[] args) {
        try {

            host = InetAddress.getLocalHost();
            accessServer();

        } catch (IOException ex) {
            System.out.println("host not found");
            System.exit(1);
        }
    }

    private static void accessServer() {

        try {
            clientSocket = new Socket(host, port);
            Scanner scann = new Scanner(System.in);

            InputStream is = clientSocket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader buff = new BufferedReader(isr);

            OutputStream os = clientSocket.getOutputStream();
            PrintWriter print = new PrintWriter(os, true);

            String msg, response;

            do {

                //read from user
                msg = scann.nextLine();

                //send to server socket
                print.println(msg);
                print.flush();

                //read response from server throw buff
                response = buff.readLine();
                System.out.println("Client Recieved Response");

            } while (!msg.equalsIgnoreCase("close"));

            os.close();
            buff.close();
            scann.close();

        } catch (IOException ex) {
            System.out.println("Error in recieved response");
            System.exit(1);
        }
        
        try{
            clientSocket.close();
        }catch(IOException e){
            System.out.println("Error in close connection");
            System.exit(1);
        }

    }
}
