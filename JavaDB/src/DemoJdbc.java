
import java.net.InetAddress;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class DemoJdbc {
	public static int counter  = 1;
	public static String Connection = "localhost";
	public static String table = "client";
	
	public static void sauverEnBase (String nom, String prenom, String email, String langue){
		String url = "jdbc:mysql://"+Connection+"/parking";
		String login = "root";
		String passwd = "";

		Connection cn = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = (Connection) DriverManager.getConnection(url,login,passwd);
			st = (Statement) cn.createStatement();
			String sql = "insert into `"+table+"` VALUES ("+counter+",'"+nom+"','"+prenom+"','"+email+"','"+langue+"')";
			st.executeUpdate(sql);
			System.out.println("insertion effectué "+DemoJdbc.table);
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
		sauverEnBase("test33","test33","test33","test33");
		//sauverEnBase(new Client(2,"Ahn", "Thibault","a","francais"));
		//lireEnBase("");
	}
}
