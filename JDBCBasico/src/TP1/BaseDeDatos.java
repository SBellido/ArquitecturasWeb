package TP1;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.derby.tools.sysinfo;

public class BaseDeDatos {

	public static void main(String[] args) {

		String driver = "org.apache.derby.jdbc.EmbeddedDriver";
				
		
		try {
			Class.forName(driver).getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}	
		
		
		String uri = "jdbc:derby:MyDerby;create=true";
		
		try {
			Connection conn = DriverManager.getConnection(uri);
			conn.setAutoCommit(false);
			deleteTables(conn);
			createTables(conn);
			addPerson(conn, 1, "Sebastián", 41);
			addPerson(conn, 2, "Ariel", 27);
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

	private static void addPerson(Connection conn, int id, String name, int age) throws SQLException {
		String insert = "INSERT INTO person (id, name, age) VALUES (?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(insert);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, age);
		ps.executeUpdate();
		ps.close();
		conn.commit();
	}

	private static void createTables(Connection conn) throws SQLException {
		String table = "CREATE TABLE person (" +
				" id INT," +
				"nombre VARCHAR(500)," +
				"edad INT," + 
				"PRIMARY KEY(id))";
				conn.prepareStatement(table).execute();
				conn.commit();
		
	}
	
	private static void deleteTables(Connection conn) throws SQLException {
		String table = "DELETE FROM person";
		conn.prepareStatement(table).execute();
		conn.commit();
		dropTables(conn);
	}

	private static void dropTables(Connection conn) throws SQLException {
		String table = "DROP TABLE person";
		conn.prepareStatement(table).execute();
		conn.commit();
	}

}
