package capitulo19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/impacta", "root", "Imp@ct@");
			System.out.println("conectado com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}
