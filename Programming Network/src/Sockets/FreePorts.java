/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets;

import java.net.ServerSocket;

/**
 *
 * @author ROG STRIX
 */
public class FreePorts {

    public static void main(String[] args) {
        ServerSocket serSoc;
        for (int i = 1025; i <= 65535; i++) {
            try {
                serSoc = new ServerSocket(i);
                System.out.println(i);
                serSoc.close();
            } catch (Exception e) {

            }
        }
    }

}
