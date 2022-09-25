/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.network;
import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author ROG STRIX
 */
public class URLBufferedReader {
    
    public static void main(String[] args) throws IOException{
        
        URL url = new URL("https://ptuk.edu.ps");
        URLConnection uc = url.openConnection();
        uc.connect();
        
        InputStream is = uc.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        String line = br.readLine();
        
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
        
    }
    
}
