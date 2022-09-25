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
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author ROG STRIX
 */
public class TCPEchoSystemServer {
    
    private static ServerSocket serverSocket;
    private static final int port = 1234;
    
    public static void main(String[] args) {
        try{
            serverSocket = new ServerSocket(port);
        }catch(IOException ex){
            System.out.println("Un enable port");
            System.exit(1);
        }
        
        do{
            handleClient();
        }while(true);
    }

    private static void handleClient() {
        
        Socket link = null;
        try{
            link = serverSocket.accept();
            System.out.println("client accpted");
            
            InputStream is = link.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader buff = new BufferedReader(isr);
            
            OutputStream os = link.getOutputStream();
            PrintWriter print = new PrintWriter(os,true);
            
            //the message in buff
            
            String msg = null;
            int numMsg = 0;
            
            do{
                
                msg = buff.readLine();
                numMsg ++;
                
                System.out.println("Msg recieved");
                System.out.println("msg "+numMsg+" "+msg);
                print.println(msg);
                
            }while(!msg.equalsIgnoreCase("close"));
            
            System.out.println("Num of msgs: "+numMsg);
            
            os.close();
            buff.close();
        }catch(IOException e){
            System.out.println("Msg not recieved");
            System.exit(1);
        }
        
        try{
            link.close();
            System.out.println("Closed connection ...");
        }catch(IOException e){
            System.out.println("Error in close connection");
            System.exit(1);
        }

    }
    
}
