import java.rmi.Remote;

public interface ICalculadora extends Remote {

    public int soma(int x, int y) throws Exception;
    int multiplicacao(int x, int y) throws Exception;
}
