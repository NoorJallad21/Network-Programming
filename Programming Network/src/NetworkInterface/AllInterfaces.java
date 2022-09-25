/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetworkInterface;
import java.net.SocketException;
import java.net.NetworkInterface;
import java.util.Enumeration;
/**
 *
 * @author ROG STRIX
 */
public class AllInterfaces {
    
    public static void main(String[] args) throws SocketException{
        Enumeration<NetworkInterface> allinterfaces = NetworkInterface.getNetworkInterfaces();
        
        while (allinterfaces.hasMoreElements()) {
            NetworkInterface nextElement = allinterfaces.nextElement();
            
            System.out.println(nextElement.toString());
            
        }
    }
    
}
