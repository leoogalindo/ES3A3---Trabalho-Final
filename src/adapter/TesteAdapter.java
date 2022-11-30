package adapter;

public class TesteAdapter {
	public static void main(String args[]) {
		TomadaDeTresPinos t3 = new TomadaDeTresPinos();

		AdapterTomada a = new AdapterTomada(t3);
		a.ligarNaTomadaDeDoisPinos();
	}
}
