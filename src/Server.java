import java.net.InetAddress;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws Exception{
        int port = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a porta: (ex.: 8081)");
        while(true) {
            try {
                port = s.nextInt();
                break;
            } catch(NumberFormatException e) {
                System.out.println("Insira uma porta valida (ex.: 8081)");
            }
        }
        Calculadora obj = new Calculadora();
        Registry registry = LocateRegistry.createRegistry(port);
        registry.rebind("Add", obj);
        CalculadoraAvancada obj2 = new CalculadoraAvancada();
        registry.rebind("Add2", obj2);
        System.out.println("server iniciou");
        System.out.println("Host: " + InetAddress.getLocalHost().getHostAddress());
        System.out.println("Port: " + port);
    }
}
