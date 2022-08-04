import java.util.Scanner;

public class NomeCpf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CpfInvalidoException cpfNovo = new CpfInvalidoException();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu CPF: ");
        String cpf = scanner.next();
        try {
           cpfNovo.validarCpf(cpf);
            System.out.println("Seu CPF é: " + cpf);
        } catch (CpfInvalidoException e) {
            System.out.println("Cpf inválido!");
        }

        System.out.println("Seu nome é: " + nome);

    }
}
// Não foi tratado possíveis exceções relacionadas a entradas indevidas
// nos campos NOME e CPF.

