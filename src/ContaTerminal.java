import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto scanner - ler do teclado
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("|------| CONTA DIGITAL |------|");

       
            System.out.println("Digite seu Nome: ");
            String nome = scanner.next();
        
            System.out.println("Digite o número da conta: ");
            int cc = scanner.nextInt();

            System.out.println("Digite o número da Agência: ");
            int ag = scanner.nextInt();

            System.out.println("Digite o Saldo atual: ");
            double saldo = scanner.nextDouble();
        

        System.out.println("Olá " + nome + ",obrigado por criar uma conta em nosso banco, sua agencia é: " + ag+ "seu saldo é "+saldo);

    }


}