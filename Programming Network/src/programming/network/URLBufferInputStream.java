/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.network;
import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

/**
 *
 * @author ROG STRIX
 */
public class URLBufferInputStream {
    
    public static void main(String[] args) throws IOException{
        URL url = new URL("https://ptuk.edu.ps");
        URLConnection uc = url.openConnection();
        uc.connect();
        
        InputStream is = uc.getInputStream();
        BufferedInputStream buff = new BufferedInputStream(is);
        
        int c = buff.read();
        while(c != -1){
            System.out.println((char)c);
            
            c = buff.read();
        }
    }
    
}
