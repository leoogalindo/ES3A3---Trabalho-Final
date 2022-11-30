package decorator;

public abstract class CalculadoraSalarioDecorator implements CalculadoraSalario  {
	protected CalculadoraSalario calculadoraSalarioBase;

    public CalculadoraSalarioDecorator(CalculadoraSalario 
        calculadoraSalarioBase) {
        this.calculadoraSalarioBase = calculadoraSalarioBase;
    }
}
