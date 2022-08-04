public class Compras {
    public static void main(String[] args) {

        //while

        double dinheiroCarteira = 10;
        double valorCompras = 0;

        while ( valorCompras < dinheiroCarteira){
            System.out.println("Adicionando item ao carrinho...");
            valorCompras++;
        }
        System.out.println("Sem dinheiro!");
    }
}
