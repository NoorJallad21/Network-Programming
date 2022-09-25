/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.network;
import java.net.InetAddress;
/**
 *
 * @author ROG STRIX
 */
public class ProgrammingNetwork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        InetAddress ia = InetAddress.getByName("www.google.com");
        System.out.println(ia);
    }
    
}
