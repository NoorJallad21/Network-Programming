/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.network.Cookies;
import java.net.URL;
import java.net.URLConnection;
/**
 *
 * @author ROG STRIX
 */
public class Main {
    
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://www.facebook.com");
        URLConnection uc = url.openConnection();
        
        EncapsulateCookies.encapCookie(uc);
    }
    
}
