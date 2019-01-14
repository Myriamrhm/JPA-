package net.simplon.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nom;
	private String prenom;
	
	@ManyToOne
	private Pays pays;
	
	
	//GETTER ET SETTER
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	//Constructeur public
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	//Constructeur protected
	protected Personne() {
	}
	
}
