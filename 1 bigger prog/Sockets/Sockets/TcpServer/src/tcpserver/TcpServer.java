/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpserver;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AcerAspire
 */
public class TcpServer {

    private static ServerSocket server;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // главен метод, който се изпълнява при стартиране на програмата
        runServer(7345); // изпълняваме метод runServer със параметър порт
    }
    
    private static void runServer(int port){ // метода отваря порт и стартира сървърен сокет който слуша на този порт
        try {
            server = new ServerSocket(port); // инстанцираме сървър сокета и отваряме порта
            Socket client;
            while(true){ // цикъл за приемане на връзки от клиенти
                System.out.println("Waiting for client...");
                client = server.accept(); // блокиращ метод който чака да приеме нови клиенти. 
                                          // Изпълнението на цикъла спира тук докато не се появи нов клиент.
                                          // Декларирания по-горе обект Socket client при нова връзка приема стойността на 
                                          // новия клиент и с тази нова стойност след това се стартира нишка работник за
                                          // комуникация с този клиент.
                System.out.println("Client connected...");
                
                // Тук пускаме нова нишка за комуникация с новия клиент
                // ProcessClientCommunication е наследник на клас Thread (нишка)
                ProcessClientCommunication processClientCommunication = new ProcessClientCommunication(client);
                processClientCommunication.handleCommunication();
            }
        } catch (IOException ex) {
            Logger.getLogger(TcpServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static class ProcessClientCommunication extends Thread{ // Клас наследник на Thread (нишка)
                                                                    // Идеята е да обработваме едновременно няколко 
                                                                    // конекции от различни клиенти
        Socket clientSocket;
        protected ProcessClientCommunication(Socket client){ // конструктор на класа
            clientSocket = client;
        }
        
        protected void handleCommunication(){ // метод за стартиране на самата нишка
            this.start();
        }

        @Override
        public void run() {
            BufferedReader inputData;
            DataOutputStream outputData;
            try {
                inputData = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // канал за входящи данни
                outputData = new DataOutputStream(clientSocket.getOutputStream());                    // канал за изходящи данни
                String message = inputData.readLine(); // четем данните идващи по сокета. Този метод също е блокиращ.
                                                       // Ако не дойдат данни се прави таймаут и се затваря връзката. Тук не е имплементирано
                                                       // Разчитаме, че клиента ще изпрати данни.
                System.out.println("Message from client: " + message);
                
                outputData.writeBytes("Thank you client.."); // Изпращаме данни към клиента по канала за изходящи данни.
            } catch (IOException ex) {
                //Logger.getLogger(TcpServer.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    clientSocket.close();
                } catch (IOException ex) {
                    Logger.getLogger(TcpServer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        
    }
    
}
