package br.com.dogsteps.models;

import br.com.dogsteps.enums.EPort;
import br.com.dogsteps.enums.ESex;
import java.io.Serializable;
import java.util.ArrayList;

public class Pet extends Configuracoes implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nome;
	private ESex sexo;
	private EPort porte;
	private ArrayList<Avaliacao> avaliacoes;
	private double notaMedia;
	private Tutor tutor;

	public Pet(String nome, ESex sexo, EPort porte, ArrayList<Avaliacao> avaliacoes, double notaMedia, Tutor tutor) {
		setName(nome);
		setSex(sexo);
		setPorte(porte);
		setAvaliacoes(avaliacoes);
		setNotaMedia(notaMedia);
		setTutor(tutor);
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public ESex getSex() {
		return sexo;
	}

	public void setSex(ESex sexo) {
		this.sexo = sexo;
	}

	public EPort getPorte() {
		return porte;
	}

	public void setPorte(EPort porte) {
		this.porte = porte;
	}

	public ArrayList<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	public Pet(){}
}
