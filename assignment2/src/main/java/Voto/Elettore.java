package Voto;

public class Elettore {

	private int id;
	private String nome;
	private String cognome;
	private String codiceFiscale;
	
	public Elettore(int id, String nome, String cognome, String codiceFiscale) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String getCodiceFiscale() {
		return codiceFiscale;
	}

}