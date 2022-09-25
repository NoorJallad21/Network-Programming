/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.network.Cookies;
import java.net.URLConnection;
/**
 *
 * @author ROG STRIX
 */
public class EncapsulateCookies {
    
    private static String cookieKey,cookieValue;
    
    public static URLConnection encapCookie(URLConnection uc){
        for(int i=0 ; ; i++){
            cookieKey = uc.getHeaderFieldKey(i);
            cookieValue = uc.getHeaderField(i);
            
            if(cookieKey == null && cookieValue == null)
                break;
            if("set-cookie".equalsIgnoreCase(cookieKey)){
                
                String[] values = cookieValue.split(";\\s");
                
                for(String value : values){
                    if("secure".equalsIgnoreCase(value)){
                        System.out.println("secure == true");
                    }else if(value.indexOf("=")>0){
                        System.out.println(value);
                    }
                }
                
            }
        }
        
        return uc;
    }
    
}
