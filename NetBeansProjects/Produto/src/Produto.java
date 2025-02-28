import java.util.List;
import java.util.ArrayList;

class Produto {
    String nome;
    double valorUnitario;
    int quantidade;

    Produto(String nome, double valorUnitario, int quantidade) {
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }
}

public class Venda {
    private List<Produto> produtos;

    public Venda() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;

        for (Produto produto : produtos) {
            total += produto.valorUnitario * produto.quantidade;
        }

        if (total >= 500 && total <= 1000) {
            total = total - (total * 0.05);  // 5% de desconto
        } else if (total > 1000 && total <= 2000) {
            total = total - (total * 0.10);  // 10% de desconto
        } else if (total > 2000) {
            total = total - (total * 0.15);  // 15% de desconto
        }

        return total;
    }
}