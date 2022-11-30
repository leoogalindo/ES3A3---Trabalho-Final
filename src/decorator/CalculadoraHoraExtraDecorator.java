package decorator;

public class CalculadoraHoraExtraDecorator extends CalculadoraSalarioDecorator {
	public CalculadoraHoraExtraDecorator(CalculadoraSalario 
	        calculadoraSalarioBase) {
	        super(calculadoraSalarioBase);
	    }

	    public double calcularSalario(int horasTrabalhadas) {
	        double pagamentoHorasExtras = 0d;
	        final double valorHoraExtra = 18d;
	        if (horasTrabalhadas > 160) {
	            int horasExtras = horasTrabalhadas - 160;
	            pagamentoHorasExtras = horasExtras * valorHoraExtra;
	            return this.calculadoraSalarioBase.calcularSalario(
	                horasTrabalhadas - horasExtras) + pagamentoHorasExtras;
	        }
	        return this.calculadoraSalarioBase.calcularSalario(horasTrabalhadas);
	 }
}
