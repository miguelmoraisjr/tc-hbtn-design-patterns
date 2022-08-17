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
        String respota = "        Fora da Caixa:\n";
        for (ItemPedido item : itensForaCaixa) {
            respota = respota + "                - " + item.getTipo() +  " " + item.getNome() + "\n";
        }
        respota = respota + "\n" + "        Dentro da Caixa:\n";

        for (ItemPedido item : itensDentroCaixa) {
            respota = respota + "                - " + item.getTipo() +  " " + item.getNome() + "\n";
        }
        return respota;
    }
}
