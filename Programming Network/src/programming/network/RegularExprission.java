/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.network;
import java.net.URL;
/**
 *
 * @author ROG STRIX
 */
public class RegularExprission {
    
    public static void main(String[] args) {
        String host = "www.google.com";
        String file = "index.html";
        String[] protocols = {"http", "https", "ftp", "mailto", "telnet", "ldap", "jdbs", "file", "nfs"};
        
        for(int i=0; i<protocols.length; i++){
            try{
                URL url = new URL(protocols[i], host, file);
                System.out.println(protocols[i]+" is supported");
            }catch(Exception e){
                System.out.println(protocols[i]+" is not supported");                
            }
        }
    }
    
}
