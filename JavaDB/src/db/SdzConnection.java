package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class SdzConnection{

  /**
  * URL de connection
  */
  private static String url = "jdbc:mysql://localhost/test";
  /**
  * Nom du user
  */
  private static String user = "root";

  /**
  * Mot de passe du user
  */
  private static String passwd = "";

  /**
  * Objet Connection
  */
  private static Connection connect;

  /**
  * M�thode qui va retourner notre instance
  * et la cr�er si elle n'existe pas...
  * @return
  */
  public static Connection getInstance(){
    if(connect == null){
      try {
    	// ajout demande de password.
    	// passwd = JOptionPane.showInputDialog(null, arg1)
        connect = DriverManager.getConnection(url, user, passwd);
      } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "ERREUR DE CONNEXION ! ", JOptionPane.ERROR_MESSAGE);
      }
    }		
    return connect;	
  }
}