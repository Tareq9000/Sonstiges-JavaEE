import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {

	
	private String id;


	private String name;
	private String vorn;


	
	public void selectTable(Daten dat) {
		
		Connection con = null;
		
		String query = dat.getSel();
		
		try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB", "root", "1234");
				
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				
				while(rs.next()) {
					
					id = rs.getString("ID");
					name = rs.getString("Name");
					vorn = rs.getString("Vorname");
					System.out.println(id + " " + name + " " + vorn);
				}
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		if(con != null) {
			
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	public int insertTable(Daten dat) {
		int anz = 0;
		
		Connection con = null;
		
		String query = dat.getIns();
		System.out.println(query);
		
		try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB", "root", "1234");
				
				Statement stmt = con.createStatement();
				anz = stmt.executeUpdate(query);
				
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		if(con != null) {

			try {
				con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return anz;
	}
	
	public int deleteTable(Daten dat) {
		
		int anz = 0;
		Connection con = null;
		
		String query = dat.getDel();
		System.out.println(query);
		
		try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB", "root", "1234");
				
				Statement stmt = con.createStatement();
				anz = stmt.executeUpdate(query);
				
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		if(con != null) {

			try {
				con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return anz;
	}
	
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getVorn() {
		return vorn;
	}


	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVorn(String vorn) {
		this.vorn = vorn;
	}


}
