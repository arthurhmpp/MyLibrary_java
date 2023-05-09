package capitulo19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class OperacoesSQL {
	private final static String URL = "jdbc:mysql://localhost/impacta";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "Imp@ct@";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	public static void main(String[] args) {
		OperacoesSQL o = new OperacoesSQL();
		
		o.openDB();
		o.insertStudet();
		o.selectStudent();
		o.closeDB();		
	}
	
	private void openDB() {
		try {
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("conctado com sucesso!");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public void closeDB() {
		try {
			con.close();
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public void insertStudet() {
		//String query = "INSERT INTO students (name, age) VALUES(\"Arhur\", 34)";
		//String query = "DELETE FROM students WHERE istudents = 1";
		String query = "UPDATE students SET age = 33 WHERE istudents = 1";
		try {
			stmt = con.createStatement();
			stmt.execute(query);
			System.out.println("Registro inserido com sucesso");
		}catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public void selectStudent() {
		String query = "SELECT * FROM students";
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				System.out.println(name + " - " + age);
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
