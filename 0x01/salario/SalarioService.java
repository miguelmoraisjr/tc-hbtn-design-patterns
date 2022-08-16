import java.util.UUID;

public class SalarioService {

    private CalculadorSalarioService calculador = CalculadorSalarioService.getCalculadorSalarioService();

    public static double calcular(double salarioBruto, double valorDescontos, double valorVendas, double percentualComissao) {
        double result = CalculadorSalarioService.calcularSalarioLiquido(salarioBruto, valorDescontos, valorVendas, percentualComissao);
        return result;
    }

    public UUID getUuid() {
        return calculador.uuid;
    }


}
