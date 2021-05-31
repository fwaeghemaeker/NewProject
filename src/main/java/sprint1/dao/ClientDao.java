package sprint1.dao;

import java.sql.PreparedStatement;

import connexion.Connexion;
import sprint1.classes.Client;

public class ClientDao {
public void saveClient(Client client)
{
	Connexion connexion = new Connexion();
	PreparedStatement preparedStatement = connexion.prepareStatement(
			"INSERT INTO clients ( nom, prenom ) + values (" + client.getNom() + "," + client.getPrenom() + ")");
	
	preparedStatement.executeUpdate();
	
//System.out.println(client.toString()+ " ajout� avec succ�s");


}
}
