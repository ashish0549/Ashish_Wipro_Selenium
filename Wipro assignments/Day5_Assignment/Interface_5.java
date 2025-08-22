
//5. Nested Interface for Callback Handling
//•	Create a class TimeServer which declares a public static nested interface named Client with void updateTime(LocalDateTime now).
//•	The server class should have method registerClient(Client client) and notifyClients() to pass current time.
//•	Implement at least two classes implementing Client, registering them, and simulate notifications.


package Day_5_Assignment;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


import java.time.format.DateTimeFormatter;

class TimeServer {
   
    public static interface Client {
        void updateTime(LocalDateTime now);
    }

    private List<Client> clients = new ArrayList<>();

    public void registerClient(Client client) {
        clients.add(client);
        System.out.println("Client registered: " + client.getClass().getSimpleName());
    }

    public void notifyClients() {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("\n[TimeServer] Sending time update: " + currentTime);
        for (Client client : clients) {
            client.updateTime(currentTime);
        }
    }
}


class DigitalClock implements TimeServer.Client {
    @Override
    public void updateTime(LocalDateTime now) {
        System.out.println("DigitalClock shows: " + now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
class LoggerClient implements TimeServer.Client {
    @Override
    public void updateTime(LocalDateTime now) {
        System.out.println("LoggerClient logged time: " + now);
    }
}
public class Interface_5 {

	public static void main(String[] args) throws InterruptedException {
        TimeServer server = new TimeServer();

       
        server.registerClient(new DigitalClock());
        server.registerClient(new LoggerClient());

        
        for (int i = 0; i < 3; i++) {
            server.notifyClients();
            Thread.sleep(1000); 
        }
    }
}
