package build;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private String apelido; 
	private String email; 
	private String usuario;
	
	public Pessoa(String nome, String sobrenome, String apelido, String email, String usuario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.apelido = apelido;
		this.email = email;
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	public String getApelido() {
		return apelido;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", apelido=" + apelido + ", email=" + email
				+ ", usuario=" + usuario + "]";
	}
	
	public static class PessoaBuilder {
		private String nome;
		private String sobrenome;
		private String apelido; 
		private String email; 
		private String usuario;
		
		public PessoaBuilder nome (String nome) {
			this.nome = nome;
			return this;
		}
		
		public PessoaBuilder sobrenome (String sobrenome) {
			this.sobrenome = sobrenome;
			return this;
		}
		
		public PessoaBuilder apelido (String apelido) {
			this.apelido = apelido;
			return this;
		}
		
		public PessoaBuilder email (String email) {
			this.email = email;
			return this;
		}
		
		public PessoaBuilder usuario (String usuario) {
			this.usuario = usuario;
			return this;
		}
		
		public Pessoa build () {
			return new Pessoa(nome, sobrenome, apelido, email, usuario);
		}
	}

	
}
