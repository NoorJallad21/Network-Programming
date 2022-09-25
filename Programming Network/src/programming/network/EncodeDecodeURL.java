/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.network;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;
/**
 *
 * @author ROG STRIX
 */
public class EncodeDecodeURL {
    
    public static void main(String[] args) throws UnsupportedEncodingException{
        
        String url = "https://ptuk.edu.ps";
        System.out.println(url);

        
        //Encoding
        
        String urlEncoder = URLEncoder.encode(url, "UTF-8");
        System.out.println(urlEncoder);
        
        //Decoding
        
        String urlDecoder = URLDecoder.decode(urlEncoder, "UTF-8");
        System.out.println(urlDecoder);
        
    }
    
}
