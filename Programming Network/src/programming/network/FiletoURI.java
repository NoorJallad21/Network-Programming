/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.network;
import java.net.URI;
import java.io.File;
/**
 *
 * @author ROG STRIX
 */
public class FiletoURI {
    
    public static void main(String[] args) {
        try{
            
            File file = new File("file.txt");
            
            URI uri = file.toURI();
            
            System.out.println(uri);
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
