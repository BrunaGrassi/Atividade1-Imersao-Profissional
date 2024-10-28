import java.util.ArrayList;
import java.util.List;

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
    public static void main (String[] args){
        final Produto produto = new Produto("produto1", 100, 8);
        final Produto produto2 = new Produto("produto2", 550, 3);

        final Venda venda = new Venda();
        venda.adicionarProduto(produto);
        venda.adicionarProduto(produto2);
        venda.calcularTotal();
    }

    private List<Produto> produtos;
    public Venda() {
        this.produtos = new ArrayList<>();
    }
    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }
    public void calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.valorUnitario * produto.quantidade;
        }
        if (total >= 500 || total < 1000) {
            total = total * 0.05;
        } else if (total >= 1000 || total < 2000) {
            total = total * 0.10;
        } else if (total >= 2000) {
            total = total * 0.15;
        }
        
        System.out.println("Valor total com desconto: " + total);
    }
}