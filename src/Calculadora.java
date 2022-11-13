import java.rmi.server.UnicastRemoteObject;

public class Calculadora extends UnicastRemoteObject implements ICalculadora{


    protected Calculadora() throws Exception {
        super();
    }

    @Override
    public int soma(int x, int y) throws Exception {
        return x + y;
    }

    @Override
    public int multiplicacao(int x, int y) throws Exception {
        return x * y;
    }

    @Override
    public int subtracao(int x, int y) throws Exception {
        return x - y;
    }

    @Override
    public int divisao(int x, int y) throws Exception {
        return x / y;
    }

}
