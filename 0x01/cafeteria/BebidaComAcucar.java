import java.util.List;

public class BebidaComAcucar extends BebidaDecorator{

    public BebidaComAcucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    List<String> obterIngredientes() {
        List<String> list = super.obterIngredientes();
        list.add("acucar");
        return list;

    }

    @Override
    double obterPreco() {
        double result = super.obterPreco() + 1.9;
        return result;
    }
}
