import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente cc1 = new ContaCorrente("CC001");
        ContaPoupanca cp1 = new ContaPoupanca("CP001");

        while (true) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Depositar na Conta Corrente");
            System.out.println("2. Depositar na Conta Poupança");
            System.out.println("3. Sacar da Conta Corrente");
            System.out.println("4. Sacar da Conta Poupança");
            System.out.println("5. Transferir da Conta Corrente para Conta Poupança");
            System.out.println("6. Transferir da Conta Poupança para Conta Corrente");
            System.out.println("7. Ver Saldo da Conta Corrente");
            System.out.println("8. Ver Saldo da Conta Poupança");
            System.out.println("9. Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print
                    ("Digite o valor do depósito na Conta Corrente: ");
                    double valorDepositoCC = scanner.nextDouble();
                    cc1.depositar(valorDepositoCC);
                    break;
                case 2:
                    System.out.print
                    ("Digite o valor do depósito na Conta Poupança: ");
                    double valorDepositoCP = scanner.nextDouble();
                    cp1.depositar(valorDepositoCP);
                    break;
                case 3:
                    System.out.print
                    ("Digite o valor do saque na Conta Corrente: ");
                    double valorSaqueCC = scanner.nextDouble();
                    cc1.sacar(valorSaqueCC);
                    break;
                case 4:
                    System.out.print
                    ("Digite o valor do saque na Conta Poupança: ");
                    double valorSaqueCP = scanner.nextDouble();
                    cp1.sacar(valorSaqueCP);
                    break;
                case 5:
                    System.out.print
                    ("Digite o valor da transferência da Conta Corrente para Conta Poupança: ");
                    double valorTransferenciaCCParaCP = scanner.nextDouble();
                    cc1.transferir(valorTransferenciaCCParaCP, cp1);
                    break;
                case 6:
                    System.out.print
                    ("Digite o valor da transferência da Conta Poupança para Conta Corrente: ");
                    double valorTransferenciaCPParaCC = scanner.nextDouble();
                    cp1.transferir(valorTransferenciaCPParaCC, cc1);
                    break;
                case 7:
                    System.out.println
                    ("Saldo da Conta Corrente (CC001): R$" + cc1.getSaldo());
                    break;
                case 8:
                    System.out.println
                    ("Saldo da Conta Poupança (CP001): R$" + cp1.getSaldo());
                    break;
                case 9:
                    System.out.println("Obrigado por usar nosso banco.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
