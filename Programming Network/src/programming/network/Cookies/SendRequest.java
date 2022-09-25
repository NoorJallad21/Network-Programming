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
public class SendRequest {
    
    public static void main(String[] args) throws Exception{
        
        URL url = new URL("https://ptuk.edu.ps");
        URLConnection uc = url.openConnection();
        uc.setRequestProperty("cookies", "name=noor;password=123");
        uc.connect();
        
    }
    
}
