import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception {
        boolean sair = true;
        while (sair){
            System.out.println("Digite 1 - calculadora comum 2 - calculadora avançada 3 - sair ");
            Scanner s = new Scanner(System.in);
            int selecionado = s.nextInt();
            switch (selecionado){
                case 1:
                    ICalculadora obj = (ICalculadora) Naming.lookup("Add");
                    System.out.println("Digite 1 - soma  2 - multiplicação 3 - subtração 4 - divisão ");
                    int valor = s.nextInt();
                    int x = 0;
                    int y = 0;
                    System.out.println("Digite o primeiro valor: ");
                    x = s.nextInt();
                    System.out.println("Digite o segundo valor: ");
                    y = s.nextInt();
                    switch (valor){
                        case 1:
                            int soma = obj.soma(x,y);
                            System.out.println(" A soma dos valores é de: "+ soma);
                            break;
                        case 2:
                            int multiplicacao = obj.multiplicacao(x,y);
                            System.out.println(" A multiplicação dos valores é de: "+ multiplicacao);
                            break;
                        case 3:
                            int subtracao = obj.subtracao(x,y);
                            System.out.println(" A subtração dos valores é de: "+ subtracao);
                            break;
                        case 4:
                            int divisao = obj.divisao(x,y);
                            System.out.println(" A divisão dos valores é de: "+ divisao);
                            break;
                        default:
                            System.out.println("Opção inexistente");
                    }
                    break;
                case 2:
                    ICalculadoraAvancada obj2 = (ICalculadoraAvancada) Naming.lookup("Add2");
                    System.out.println("Digite o valor que deseja elevar ao quadrado: ");
                    int quadrado = s.nextInt();
                    int n2 = obj2.quadrado(quadrado);
                    System.out.println("A elevação ao quadrado é de: "+n2);
                    break;
                case 3:
                    sair = false;
                    break;
                default:
                    System.out.println("Opção inexistente");
                    break;
            }
        }
    }
}
