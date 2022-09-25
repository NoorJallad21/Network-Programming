/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.network;

import java.net.URL;

/**
 *
 * @author ROG STRIX
 */
public class TestProtocolString {

    public static void testProtocol(String url) {
        try {
            URL testURL = new URL(url);
            System.out.println(testURL.getProtocol() + " is supported");
        } catch (Exception e) {
            String protocol = url.substring(0, url.indexOf(":"));
            System.out.println(protocol + " is not supported");
        }
    }

    public static void main(String[] args) {
        testProtocol("http://www.google.com");
        testProtocol("jdbs://www.google.com");
    }

}
