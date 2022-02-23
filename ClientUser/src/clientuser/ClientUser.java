/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientuser;
import java.io.*;
import java.net.*;
import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author panzeri.tommasoambro
 */
public class ClientUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try {
            String user, password; 
            Socket clientSocket = new Socket("10.1.33.200", 5000);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            Scanner tastiera = new Scanner(System.in);
            String scelta= tastiera.next();
            if(scelta.equals("log")){
                System.out.println("inserisci user");
                user=tastiera.next();
                System.out.println("inserisci password");
                password=tastiera.next();

            } else {

            }
            in.close();
            out.close();
            clientSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(ClientUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
