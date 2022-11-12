import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddImpl extends UnicastRemoteObject implements ICalculadora{


    protected AddImpl() throws Exception {
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

}
