/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.network;
import java.net.URI;

/**
 *
 * @author ROG STRIX
 */
public class Example1 {
    
    public static void main(String[] args)  throws Exception{
        URI uri = new URI("http://www.fedelk.com/c?EmpDate=4#columns=4,1-6");
        
        System.out.println(uri.getScheme()); //http
        System.out.println(uri.getAuthority()); //www.fedelk.com
        System.out.println(uri.getPath());// /c
        System.out.println(uri.getQuery());// EmpDate=4
        System.out.println(uri.getFragment());// columns=4,1-6
        
        System.out.println(uri.getPort());
        System.out.println(uri.getUserInfo());
    }
    
    
}
