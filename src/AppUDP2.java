import java.net.DatagramSocket;
import java.net.SocketException;

public class AppUDP2 {

    public static void main(String[] args) throws SocketException {
	    DatagramSocket socket = new DatagramSocket(20000);
	    System.out.println("Hello World!");
    }
}