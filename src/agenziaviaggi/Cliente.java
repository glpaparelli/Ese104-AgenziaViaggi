package agenziaviaggi;

public class Cliente {

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + "]";
	}

	private String nome;
	private String cognome;
		
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public Cliente(String nome, String cognome) {
		super();
		if (nome != null){
			if(nome.length() > 0){
				this.nome = nome;
			}
		}
		else 
			throw new IllegalArgumentException();
		
		if (cognome != null){
			if(cognome.length() > 0){
				this.cognome = cognome;
			}	
		}
	}
}
