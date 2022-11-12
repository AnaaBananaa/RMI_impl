import java.rmi.Naming;

public class Client {

    public static void main(String[] args) throws Exception {

        ICalculadora obj = (ICalculadora) Naming.lookup("Add");
        int n = obj.soma(5,4);
        System.out.println("soma: "+n);
        ICalculadora obj2 = (ICalculadora) Naming.lookup("Add2");
        int n2 = obj.multiplicacao(5,4);
        System.out.println("multiplicação: "+n2);
    }
}
