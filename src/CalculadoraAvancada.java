import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraAvancada extends UnicastRemoteObject implements ICalculadoraAvancada{

    protected CalculadoraAvancada() throws RemoteException {
        super();
    }

    @Override
    public int quadrado(int x) throws Exception{
        return x * x;
    }
}
