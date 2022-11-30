package factory;

public class TestaFactory {

	public static void main(String[] args) {
		Forma f1 = FormaFactory.getForma("circulo");
        f1.falaMetodo();

        Forma f2 = FormaFactory.getForma("retangulo");
        f2.falaMetodo();
        
        Forma f3 = FormaFactory.getForma("quadrado");
        f3.falaMetodo();
	}

}
