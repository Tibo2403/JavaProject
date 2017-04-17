package db;
//create database parking;
//use parking;
//create table Client(
//idClient primary key autoincrement;
//Nom varchar(50);
//Prenom varchar(50);
//Email varchar(100);
//Langue varchar(50);
//);

public class Client {
	protected int idClient;
	protected String nom;
	protected String prenom;
	protected String email;
	protected String langue;
	
	public Client(int idClient, String nom, String prenom, String email, String langue) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.langue = langue;
	}
}
