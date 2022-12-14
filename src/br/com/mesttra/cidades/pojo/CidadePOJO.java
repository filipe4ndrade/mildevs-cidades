package br.com.mesttra.cidades.pojo;

public class CidadePOJO {

	private int ddd;
	private String nome;
	private int nroHabitantes;
	private double rendaPerCapita;
	private boolean capital;
	private String estado;
	private String nomePrefeito;

	public CidadePOJO() {

	}

	public CidadePOJO(int ddd, String nome, int nroHabitantes, double rendaPerCapita, boolean capital, String estado,
			String nomePrefeito) {
		this.ddd = ddd;
		this.nome = nome;
		this.nroHabitantes = nroHabitantes;
		this.rendaPerCapita = rendaPerCapita;
		this.capital = capital;
		this.estado = estado;
		this.nomePrefeito = nomePrefeito;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNroHabitantes() {
		return nroHabitantes;
	}

	public void setNroHabitantes(int nroHabitantes) {
		this.nroHabitantes = nroHabitantes;
	}

	public double getRendaPerCapita() {
		return rendaPerCapita;
	}

	public void setRendaPerCapita(double rendaPerCapita) {
		this.rendaPerCapita = rendaPerCapita;
	}

	public boolean isCapital() {
		return capital;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNomePrefeito() {
		return nomePrefeito;
	}

	public void setNomePrefeito(String nomePrefeito) {
		this.nomePrefeito = nomePrefeito;
	}

	

}
