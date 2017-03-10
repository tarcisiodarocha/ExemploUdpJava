import java.net.DatagramSocket;
import java.net.SocketException;

public class AppUDP1 {

    public static void main(String[] args) throws SocketException {
	    DatagramSocket socket = new DatagramSocket(10000);
	    System.out.println("Hello World!");
    }
}