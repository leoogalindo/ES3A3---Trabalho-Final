package factory;

public class FormaFactory {
	public static Forma getForma(String tipoForma) {
        switch (tipoForma) {
            case "circulo":
                return new Circulo();
            case "retangulo":
                return new Retangulo();
            case "quadrado":
                return new Quadrado();
            default:
                return null;
        }
    }
}
