package decorator;

public class CalculadoraSalarioFuncionario implements CalculadoraSalario {
	public double calcularSalario(int horasTrabalhadas) {
        final double valorHora = 15d;
        return valorHora * horasTrabalhadas;
    }
}
