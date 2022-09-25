/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetworkInterface;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Arrays;

/**
 *
 * @author ROG STRIX
 */
public class ExtractMAC {
    
    public static void main(String[] args) throws Exception{
        InetAddress localhost = InetAddress.getLocalHost();
        NetworkInterface netInterface = NetworkInterface.getByInetAddress(localhost);
        
        byte[] MAC = netInterface.getHardwareAddress();
        System.out.println(Arrays.toString(MAC));
        
        for(int i=0;i<MAC.length;i++){
            if(i!=MAC.length-1){
                System.out.format("%2x%s", MAC[i]," - ");
            }else{
                System.out.format("%2x%s", MAC[i],"");
            }
        }
        System.out.println("");
    }
    
}
