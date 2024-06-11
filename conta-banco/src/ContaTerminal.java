import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        String numeroContaStr = scanner.nextLine();
        int numeroConta = 0;

        
        String numeroContaLimpo = numeroContaStr.replaceAll("[^\\d]", "");

        try {
            
            numeroConta = Integer.parseInt(numeroContaLimpo);
        } catch (NumberFormatException e) {
            System.out.println("Número da Conta inválido. Por favor, insira apenas números.");
            System.exit(1);
        }

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        String saldoStr = scanner.nextLine();
        double saldo = 0;

       
        String saldoLimpo = saldoStr.replaceAll("[^\\d.]", "");

        try {
            
            saldo = Double.parseDouble(saldoLimpo);
        } catch (NumberFormatException e) {
            System.out.println("Saldo inválido. Por favor, insira um valor numérico válido.");
            System.exit(1);
        }

       
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
