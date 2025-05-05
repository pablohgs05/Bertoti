import java.util.ArrayList;
import java.util.List;

public class Combo implements ItemCardapio {
    private String nome;
    private List<ItemCardapio> itens = new ArrayList<>();

    public Combo(String nome) {
        this.nome = nome;
    }

    public void addItem(ItemCardapio item) {
        itens.add(item);
    }

    @Override
    public double getPreco() {
        return itens.stream().mapToDouble(ItemCardapio::getPreco).sum();
    }
}