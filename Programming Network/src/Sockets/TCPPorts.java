/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author ROG STRIX
 */
public class TCPPorts {

    public static void main(String[] args) {
        Socket socket;
        String host = "127.0.0.1";
        for (int port = 0; port < 1024; port++) {
            try {
                socket = new Socket(host, port);
                System.out.println(port);
                socket.close();
            } catch (UnknownHostException ex) {
                System.err.println(ex);
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

}
