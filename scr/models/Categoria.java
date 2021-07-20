package models;

import java.util.Dates;

public class Categoria{

    private String nome;
    private Date criadoEm;

    public Categoria() {
		setCriadoEm(new Date());
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	@Override
	public String toString() {
		return nome;
	}
}

