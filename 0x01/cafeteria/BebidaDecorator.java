import java.util.List;

public class BebidaDecorator extends Bebida{

    private Bebida bebidaDecorada;

    public BebidaDecorator(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }

    @Override
    List<String> obterIngredientes() {
        return bebidaDecorada.obterIngredientes();
    }

    @Override
    double obterPreco() {
        return bebidaDecorada.obterPreco();
    }

    public Bebida getBebidaDecorada(){
        return bebidaDecorada;
    }

    @Override
    public String toString() {
        return String.format("Preco: %.2f - Ingredientes: %s", obterPreco(), obterIngredientes().toString());
    }
}
