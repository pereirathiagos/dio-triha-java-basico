public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 25.0;
        double valorSolicitado = 23.0;
 
        if (valorSolicitado <= saldo) {
            saldo -= valorSolicitado;
            System.out.println("Saque de " + valorSolicitado + " realizado com sucesso.");
            System.out.println("Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque de " + valorSolicitado);
            System.out.println("Saldo atual: " + saldo);
        }
 
    }
}
