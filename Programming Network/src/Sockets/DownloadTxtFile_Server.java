/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author ROG STRIX
 */
public class DownloadTxtFile_Server {
    
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(4000);
        Socket clientSocket = serverSocket.accept();
        
        
        InputStream is = new FileInputStream(new File("Attach_Files/file.txt"));
        OutputStream os = clientSocket.getOutputStream();
        
        byte [] space = new byte[20*1024];
        int i;
        while((i=is.read(space))>0){
            os.write(space,0,i);
        }
        
        os.close();
        is.close();
        clientSocket.close();
        serverSocket.close();
        
    }
    
}
