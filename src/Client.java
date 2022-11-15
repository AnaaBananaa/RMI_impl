import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception {
        String host = "";
        int port = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o endereco do Host: ");
        host = s.next();
        while(!verificaHost(host)) {
            System.out.println("Insira um host valido (ex.: 192.168.0.1)");
            host = s.next();
        }
        System.out.println("Digite a porta: (ex.: 8081)");
        while(true) {
            try {
                port = s.nextInt();
                break;
            } catch(NumberFormatException e) {
                System.out.println("Insira uma porta valida (ex.: 8081)");
            }
        }
        
        boolean sair = true;
        while (sair){
            System.out.println("Digite 1 - calculadora comum 2 - calculadora avançada 3 - sair ");
            int selecionado = s.nextInt();
            switch (selecionado){
                case 1:
                    ICalculadora obj = (ICalculadora) Naming.lookup("rmi://"+host+":"+port+"/Add");
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
                    ICalculadoraAvancada obj2 = (ICalculadoraAvancada) Naming.lookup("rmi://"+host+":"+port+"/Add2");
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
    
    private static boolean verificaHost(String host) {
        String[] bytes = host.split("\\.");
        try {
            for(int i = 0; i < 4; i++) {
                Integer.parseInt(bytes[i]);
            }
            return true;
        } catch(Exception e) {
            return false;
        }
    }
}
