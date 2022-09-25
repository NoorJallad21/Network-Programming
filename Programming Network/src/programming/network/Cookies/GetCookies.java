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
public class GetCookies {
    
    public static void main(String[] args) throws Exception{
        
        URL url = new URL("https://www.facebook.com");
        URLConnection uc = url.openConnection();
        
        String headerKey, headerValue;
        
        for(int i=0 ;; i++){
            headerKey = uc.getHeaderFieldKey(i);
            headerValue = uc.getHeaderField(i);
            
            if(headerKey == null && headerValue == null)
                break;
            
            if("set-cookie".equalsIgnoreCase(headerKey)){
                System.out.println(headerKey);
                
                String[] values = headerValue.split(";\\s");
                
                for(String value:values){
                    if("secure".equalsIgnoreCase(value)){
                        System.out.println("secure = true");
                        break;
                    }else if(value.indexOf("=")>0){
                        System.out.println(value);
                    }
                }
            }
            
        }
        
    }
    
}
