import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Por favor, informe seu nome");
        //Testando a aplicação utilizando args
        // String nome = args[2];
        String nome = scanner.next();

        System.out.println("Por favor, informe o número");
        //Testando a aplicação utilizando args
        // int numero =  Integer.valueOf(args[0]);
        int numero = scanner.nextInt();
        
        System.out.println("Digite qual é a sua agência");
        //Testando a aplicação utilizando args
        // String agencia = args[1];
        String agencia = scanner.next();

        System.out.println("Por favor, informe o seu saldo");
        //Testando a aplicação utilizando args
        // double saldo = Double.valueOf(args[3]);
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", o numero da sua conta é " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");



    

    }
}
