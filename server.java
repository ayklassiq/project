/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_sever;

import java.io.*;
import java.net.*;


/**
 *
 * @author Adesope Ayoade
 */
public class server {
    public static void main(String args[])throws Exception {
 
        ServerSocket ss=new ServerSocket(8080);  
        Socket s=ss.accept();  
        DataInputStream din=new DataInputStream(s.getInputStream());  
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  

        String str="i love you",str2="okay";  
        while(!str.equals("stop")){  
        str=din.readUTF();  
        System.out.println("client says: "+str);  
        str2=br.readLine();  
        dout.writeUTF(str2);  
        dout.flush();  
        }  
        din.close();  
        s.close();  
        ss.close();  
         
     }   
    }

