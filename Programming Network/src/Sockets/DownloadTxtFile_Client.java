/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author ROG STRIX
 */
public class DownloadTxtFile_Client {
    
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1",4000);
        InputStream in = socket.getInputStream();
        OutputStream os = new FileOutputStream("Attach_Files/file.txt");
        
        byte[] space = new byte[20*1024];
        int i;
        
        while((i=in.read(space))>0){
            os.write(space,0,i);
        }
        
        os.close();
        in.close();
        socket.close();
    }
    
}
