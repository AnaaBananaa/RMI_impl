import java.rmi.Naming;

public class Server {

    public static void main(String[] args) throws Exception{

        Calculadora obj = new Calculadora();
        Naming.rebind("Add", obj);
        CalculadoraAvancada obj2 = new CalculadoraAvancada();
        Naming.rebind("Add2", obj2);
        System.out.println("server iniciou");
    }
}
