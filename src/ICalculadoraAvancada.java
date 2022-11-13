import java.rmi.Remote;

public interface ICalculadoraAvancada extends Remote {

    int quadrado(int x) throws Exception;
}
