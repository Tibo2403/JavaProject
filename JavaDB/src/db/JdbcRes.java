package db;

import java.net.InetAddress;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class JdbcRes {
	public static int counter  = 1;
	public static String Connection = "localhost";
	public static String table = "reservation";
	
	public static void sauverEnBase (Integer id ,String heuredebut, String heurefin,  Integer client, Integer prix){
		String url = "jdbc:mysql://"+Connection+"/test";
		String login = "root";
		String passwd = "";

		Connection cn = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = (Connection) DriverManager.getConnection(url,login,passwd);
			st = (Statement) cn.createStatement();
			String sql = "insert into `"+table+"` VALUES ("+id+","+heuredebut+","+heurefin+",'"+client+","+prix+" )";
			st.executeUpdate(sql);
			System.out.println("insertion effectué "+JdbcRes.table);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sauverEnBase(3, "2017-04-17 00:00:00", "2017-04-17 06:00:00" ,100, 1);
		//sauverEnBase(new Client(2,"Ahn", "Thibault","a","francais"));
		//lireEnBase("");
	}
}
