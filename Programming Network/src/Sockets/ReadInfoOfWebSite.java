/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;


/**
 *
 * @author ROG STRIX
 */
public class ReadInfoOfWebSite {
    
    public static void main(String[] args) throws Exception{
        
        String host = "www.yahoo.com";
        Socket socket = new Socket(host,80);
        
        OutputStream os = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(os, true);
        writer.println("host "+host+" 80");
        
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader buff = new BufferedReader(isr);
        
        StringBuilder str = new StringBuilder(8 * 1024);
        int i = buff.read();
        
        while(i!=-1){
            str.append((char)i);
            i = buff.read();
        }
        
        System.out.println(str.toString());
        
        os.close();
        socket.close();
        
    }
    
}
