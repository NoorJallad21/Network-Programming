/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IP;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Arrays;
/**
 *
 * @author ROG STRIX
 */
public class TestVersion {
    public static void main(String[] args) throws Exception{
        
        InetAddress a = InetAddress.getByName("50b2:6400:0000:0000:6c3a:b17d:0000:10a9");
        
        byte[] arr = a.getAddress();
        
        if(arr.length == 4)
            System.out.println("Version 4");
        else if(arr.length == 16)
                System.out.println("Version 6");

    }
}
