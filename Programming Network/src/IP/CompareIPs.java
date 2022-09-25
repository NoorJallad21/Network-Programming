/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IP;
import java.net.InetAddress;
/**
 *
 * @author ROG STRIX
 */
public class CompareIPs {
    
    public static void main(String[] args) throws Exception{
        InetAddress ia1 = InetAddress.getByName("www.google.ps");
        InetAddress ia2 = InetAddress.getByName("www.google.jo");
        
        if(ia1.getHostAddress().equals(ia2.getHostAddress()))
            System.out.println("Are the same");
        
        else
            System.out.println("Are defferent");
        
    }
    
}
