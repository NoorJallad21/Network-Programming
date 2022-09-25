/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.network;
import java.net.URI;
import java.net.URL;
/**
 *
 * @author ROG STRIX
 */
public class URItoURL {
    
    public static void main(String[] args) {
        try{
            
            URI uri = new URI("http://www.fedelk.com/c?EmpDate=4#columns=4,1-6");
            
            URL url = uri.toURL();
            
            System.out.println(uri);
            System.out.println(url);
            
            URI uri1 = url.toURI();
            
        }catch(Exception ex){
            
            System.out.println(ex);
            
        }
    }
    
}
