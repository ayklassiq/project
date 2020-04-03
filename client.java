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
public class client{
    
    public static void main(String args[])throws Exception {
 
         Socket s = new Socket("localhost",8080);
         DataOutputStream dout = new DataOutputStream(s.getOutputStream());
         DataInputStream din= new DataInputStream(s.getInputStream());
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         String str="i love you",str2="okay";  
while(!str.equals("stop")){  
str=br.readLine();  
dout.writeUTF(str);  
dout.flush();  
str2=din.readUTF();  
System.out.println("Server says: "+str2);  
}  
  
dout.close();  
s.close(); 
         
     }   

  
    }

