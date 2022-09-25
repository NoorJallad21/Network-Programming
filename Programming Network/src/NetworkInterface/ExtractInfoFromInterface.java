/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetworkInterface;

import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

/**
 *
 * @author ROG STRIX
 */
public class ExtractInfoFromInterface {
    
    public static void main(String[] args) throws SocketException{
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        
        while(interfaces.hasMoreElements()){
            NetworkInterface nextInterface = interfaces.nextElement();
            
            System.out.println(nextInterface.getName());
            System.out.println(nextInterface.getDisplayName());
            System.out.println(nextInterface.isLoopback());
            System.out.println(nextInterface.isUp());
            System.out.println(nextInterface.supportsMulticast());
            System.out.println(nextInterface.isPointToPoint());
            System.out.println(nextInterface.isVirtual());
            System.out.println(nextInterface.getMTU());
            System.out.println(Arrays.toString(nextInterface.getHardwareAddress()));
            
            ArrayList<InterfaceAddress> IPs =(ArrayList<InterfaceAddress> ) nextInterface.getInterfaceAddresses();
            for(int i=0;i<IPs.size();i++){
                InterfaceAddress ia= IPs.get(i);
                System.out.println(ia);
                System.out.println(ia.getAddress());
                System.out.println(ia.getNetworkPrefixLength());
                System.out.println(ia.getBroadcast());
                if (ia.getBroadcast()!=null)
                System.out.println(Arrays.toString(ia.getBroadcast().getAddress()));
            }
            System.out.println("____________________________________");
        }
    }
    
}
