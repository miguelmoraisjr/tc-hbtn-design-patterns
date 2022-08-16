import java.util.List;

public class BebidaComLeite extends BebidaDecorator{

    public BebidaComLeite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    List<String> obterIngredientes() {
        List<String> list = super.obterIngredientes();
        list.add("leite");
        return list;
    }

    @Override
    double obterPreco() {
        double result = super.obterPreco() + 3.2;
        return result;
    }


}
