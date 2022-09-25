/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.network;

import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

/**
 *
 * @author ROG STRIX
 */
public class SiteInfoFromHeader {
    
    public static void main(String[] args) throws IOException{
        
        URL url = new URL("http://www.microsoft.com");
        URLConnection uc = url.openConnection();
        uc.connect();
        
        for(int i = 0 ; ; i++){
            String value = uc.getHeaderField(i);
            String key = uc.getHeaderFieldKey(i);
            
            if(value == null)
                break;
            
            System.out.println("The Field is: "+key+" : "+value);
        }
        
    }
    
}
