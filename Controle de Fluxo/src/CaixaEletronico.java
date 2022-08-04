import java.util.Scanner;

// Controle de fluxo IF e Else

public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoDisponivel = 30000;

        double valorSaque;

        System.out.println("Digite o valor do Saque: ");
        valorSaque = scanner.nextDouble();

        if (valorSaque <= saldoDisponivel) {
            saldoDisponivel = saldoDisponivel - valorSaque;
            System.out.println("O valor do saque é : " + valorSaque);
            System.out.println("Saldo atual: " + saldoDisponivel);
        } else System.out.println("Saldo indísponivel!");

    }
}
