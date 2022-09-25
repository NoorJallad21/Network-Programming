/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IP;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
/**
 *
 * @author ROG STRIX
 */
public class GetIP {
    
    public static void main(String[] args) throws UnknownHostException{
        
        System.out.println(InetAddress.getLocalHost());
        
        System.out.println(InetAddress.getLoopbackAddress());
        
        System.out.println(InetAddress.getByName("www.yahoo.com"));
        
        System.out.println(Arrays.toString(InetAddress.getAllByName("www.yahoo.com")));
        
    }
    
}
