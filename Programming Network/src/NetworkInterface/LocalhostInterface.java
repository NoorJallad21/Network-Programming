/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetworkInterface;
import java.net.NetworkInterface;
import java.net.InetAddress;

/**
 *
 * @author ROG STRIX
 */
public class LocalhostInterface {
    
    public static void main(String[] args) throws Exception{
        
        InetAddress localhost = InetAddress.getLocalHost();
        NetworkInterface internateInterface = NetworkInterface.getByInetAddress(localhost);
        
        System.out.println(localhost.getHostAddress());
        System.out.println(internateInterface.getName());
        System.out.println(internateInterface.getDisplayName());
        
    }
    
}
