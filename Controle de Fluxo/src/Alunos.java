public class Alunos {
    public static void main(String[] args) {

        // for e foreach em Arrays
        String alunos[] ={"luan", "bruna", "lilico", "gabi", "percevejo"};

        for (int x =0; x < alunos.length; x++){
            System.out.println("Aluno número: " + x + " Nome: " + alunos[x]);
        }
        System.out.println("Finalizado!");

        System.out.println("---------------------------------------------------");

        for ( String aluno : alunos ) {
            System.out.println("O aluno é: " + aluno);

        }
        System.out.println("---------------------------");
        //break e continue

        for ( int n = 1; n <= 10; n++){
            if (n == 4)
                break;
            System.out.println(n);
        }
        System.out.println("--------------------------------------");
        for ( int n = 1; n <= 10; n++){
            if (n == 4)
              continue;
            System.out.println(n);
        }
    }
}
