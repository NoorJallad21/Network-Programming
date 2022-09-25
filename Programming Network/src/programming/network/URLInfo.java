/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.network;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.sql.Date;
import java.io.IOException;

/**
 *
 * @author ROG STRIX
 */
public class URLInfo {
    
    public static void main(String[] args) throws IOException{
        URL url = new URL("http://127.0.0.1:8083/");
        
        URLConnection c = url.openConnection();
        c.connect();
        
        System.out.println(c.getContentType()); // tetxt/html; charset = utf-8
        System.out.println(c.getContentEncoding());
        System.out.println(c.getContentLength());
        
        System.out.println(new Date(c.getDate()));
        System.out.println(new Date(c.getLastModified()));
        System.out.println(new Date(c.getExpiration()));
        
        if(c instanceof HttpURLConnection){
            
            HttpURLConnection huc = (HttpURLConnection)c;
            
            System.out.println(huc.getRequestMethod());
            System.out.println(huc.getResponseMessage());
            System.out.println(huc.getResponseCode());
            System.out.println(huc.getReadTimeout());
        }
    }
    
}
