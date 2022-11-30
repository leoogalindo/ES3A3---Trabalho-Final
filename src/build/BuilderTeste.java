package build;

public class BuilderTeste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa.PessoaBuilder().nome("Leonardo").sobrenome("Galindo").apelido("Léo").
		email("aaaaaa@gmail.com").usuario("leoogalindo").build();
		
		System.out.println(p1.toString());
	}

}
