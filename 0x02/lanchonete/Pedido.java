import java.util.HashSet;

public class Pedido {

    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<ItemPedido>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<ItemPedido>();

    public void adicionarItemDentroCaixa(ItemPedido item) {
        this.itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        this.itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
       // return "Fora da caixa:\n" + "- BEBIDA " + itensForaCaixa.toString() + "\n" + "Dentro da caixa:\n" + "- BRINDE ";
        for (ItemPedido itemPedido : itensDentroCaixa) {

        }
    }
}
