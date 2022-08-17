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
        String respota = "Fora da caixa:\n";
        for (ItemPedido item : itensForaCaixa) {
            respota = respota + item.toString();
        }
        respota = respota + "\n" + "Dentro da caixa:\n";

        for (ItemPedido item : itensDentroCaixa) {
            respota = respota + item.toString();
        }
        return respota;
    }
}
