/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.network;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.security.cert.Certificate;
/**
 *
 * @author ROG STRIX
 */
public class SSLCertificate {
    
    public static void main(String[] args) throws IOException{
        
        URL url = new URL("https://ptuk.edu.ps");
        URLConnection uc = url.openConnection();
        uc.connect();
        
        HttpsURLConnection https = (HttpsURLConnection)uc; 
        
        InputStream is = https.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        String line = br.readLine();
        
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
        
        System.out.println(https.getCipherSuite());
        
        
        Certificate[] certificates = https.getServerCertificates();
        
        for(int i=0;i<certificates.length;i++){
            System.out.println(certificates[i].getType());
            System.out.println(certificates[i].hashCode());
            System.out.println(certificates[i].getPublicKey().getFormat());
            System.out.println(certificates[i].getPublicKey().getAlgorithm());
        }
        
        
    }
    
}
