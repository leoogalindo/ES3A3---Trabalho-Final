package decorator;

public class TesteDecorator {

	public static void main(String[] args) {
		CalculadoraSalario calculadoraSalario = new CalculadoraSalarioFuncionario();
		calculadoraSalario = new CalculadoraHoraExtraDecorator(calculadoraSalario);
		double salarioARecebeer = calculadoraSalario.calcularSalario(170);
		System.out.println(salarioARecebeer);

	}

}
