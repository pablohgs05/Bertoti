import java.util.ArrayList;
import java.util.List;

public class Combo {
    private String nome;
    private List<Produto> produtos = new ArrayList<>();

    public Combo(String nome) {
        this.nome = nome;
    }

    public void addProduto(Produto p) {
        produtos.add(p);
    }

    public double getPreco() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total;
    }
}