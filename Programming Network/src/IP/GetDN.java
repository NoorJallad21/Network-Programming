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
public class GetDN {
    
    public static void main(String[] args)throws Exception {
        
        InetAddress a = InetAddress.getByName("31.13.92.36");
        
        System.out.println(a.getHostName());
        System.out.println(a.isReachable(150));
        System.out.println(a.getCanonicalHostName());
        
        
        
    }
    
}
