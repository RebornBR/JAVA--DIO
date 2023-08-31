import java.util.Locale;
import java.util.Scanner;

/**
 * @author Reborn
 * @version 1.0
 * @since 31/08/2023
 */

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    System.out.println("Sistema de criação de Conta Bancária, Seja Bem-Vindo!");
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    int controleUm; /*Váriavel para utilização do if e confirmação do nome
    Será a única, pois não tem sentido colocar nas outras, já que é a criação de sua conta bancária */

    int numConta;
    String numAgencia;
    String nome;
    double numLimite;


    System.out.println("Digite seu nome:");
    nome = scanner.next();
    System.out.println("Seu nome está correto ? (Digite '1' para sim e '0'para não ) e aperte enter" + nome);
    controleUm = scanner.nextInt();

    if(controleUm == 0 ){
        System.out.println("Por favor, digite seu nome novamente e aperte enter:");
        nome = scanner.next();
        System.out.println("Digite o número da conta e aperte enter:");
        numConta = scanner.nextInt();
        System.out.println("Digite o número da agência e aperte enter:");
        numAgencia = scanner.next();
        System.out.println("Digite o limite desejado para seu cartão de crédito:");
        numLimite = scanner.nextDouble();

    }else {
       System.out.println("Digite o número da conta e aperte enter:");
        numConta = scanner.nextInt();
        System.out.println("Digite o número da agência e aperte enter:");
        numAgencia = scanner.next();
        System.out.println("Digite o limite desejado para seu cartão de crédito:");
        numLimite = scanner.nextDouble();
    }
    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + numAgencia + ", conta: " + numConta + ", e seu limite de: $" + numLimite + " foi aprovado, PARABÉNS!");
    

    




        
    }
}
