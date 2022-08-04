import java.util.Random;

public class Telefone {
    // do while
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");
        }while (tocando());

        System.out.println("Alô!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;
        /*
        Esse método verifica se retorno de nextInt é igual a 1
        se for atendeu = true, e o return me retorna a negação de atendeu que no caso
        sera false encerrando assim o laço do while.
         */
    }
}
