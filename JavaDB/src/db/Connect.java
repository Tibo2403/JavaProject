package db;
import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;



public class Connect {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost/test";
		String user = "root";
		String passwd = "";
		Connection conn = (Connection) DriverManager.getConnection(url, user, passwd);
		//Création d'un objet Statement
		Statement state = (Statement) conn.createStatement();
		//L'objet ResultSet contient le résultat de la requête SQL
		ResultSet result = (ResultSet) state.executeQuery("SELECT * FROM javadb");
		//On récupère les MetaData
		ResultSetMetaData resultMeta = (ResultSetMetaData) result.getMetaData();
		System.out.println("\n**********************************");
		//On affiche le nom des colonnes
		for(int i = 1; i <= resultMeta.getColumnCount(); i++)
		System.out.print ("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");
		System.out.println("\n**********************************");
			while(result.next()){
			for(int i = 1; i <= resultMeta.getColumnCount(); i++)
			System.out.print ("\t" + result.getObject(i).toString() + "\t |");
			System.out.println("\n---------------------------------");
			}
		result.close();
		state.close();
		
		} catch (Exception e) {
	e.printStackTrace();
	}
}
}