import java.util.Scanner;

// If ElseIf Else.

public class BoletimAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        System.out.println("Digite a nota do Aluno: ");
        nota = scanner.nextInt();

        if (nota >= 7)
            System.out.println("APROVADO");

        else if (nota >= 5 && nota < 7 ) {
            System.out.println("RECUPERAÇÃO");

        } else
        System.out.println("REPROVADO");

        //Operador Ternário

        int nota1 = 6;
        String resultado;

        resultado = nota1 >= 7 ? "APROVADO" : nota1 >= 5 && nota1 < 7 ? "RECUPERAÇÃO" : "REPROVADO";
        System.out.println(resultado);
    }
}
