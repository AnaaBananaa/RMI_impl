import java.rmi.Naming;

public class Server {

    public static void main(String[] args) throws Exception{

        AddImpl obj = new AddImpl();
        Naming.rebind("Add", obj);
        AddImpl obj2 = new AddImpl();
        Naming.rebind("Add2", obj2);
        System.out.println("server iniciou");
    }
}
