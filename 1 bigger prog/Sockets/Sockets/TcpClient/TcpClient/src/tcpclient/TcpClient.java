/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpclient;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AcerAspire
 */
public class TcpClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // главен метод, който се изпълнява при стартиране на програмата
        try {
            Socket clientSocket = new Socket("192.168.1.243", 7345); // инстанцираме клиентски сокет, посочвайки 
                                                                     // IP и порт за връзка към сървъра. Още тук се осъществява
                                                                     // връзката.
            
            System.out.println("Connecting to server..");
            BufferedReader inputData = null;     
            DataOutputStream outputData = null;  
            try {
                outputData = new DataOutputStream(clientSocket.getOutputStream()); // канал за изходящи данни
                System.out.println("Sending message to server..");
                outputData.writeBytes("Hi Server, how are you?\r\n"); // Изпращаме данни към сървъра
                outputData.flush();                                         
                inputData = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // буфер за входящи данни, отново по канал за входящи данни
                String message = inputData.readLine();  // чакаме данни от сокета, отново блокиращ метод
                System.out.println("Message from server: " + message);
            } catch (IOException ex) {
                //...
            } 
            finally{
               outputData.close(); // след като минат по-горните операции затваряме канала за изходящи данни
               inputData.close();  // канала за входящи данни
               clientSocket.close(); // затваряме клиентския сокет
            }
            
        } catch (IOException ex) {
            Logger.getLogger(TcpClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}