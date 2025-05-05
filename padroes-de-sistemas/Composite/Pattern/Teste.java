public class Teste {
    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz", 10);
        Produto feijao = new Produto("Feijão", 8);
        Combo prato = new Combo("Prato Executivo");
        prato.addItem(arroz);
        prato.addItem(feijao);
        System.out.println("Preço do combo: " + prato.getPreco());
    }
}