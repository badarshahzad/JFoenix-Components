package application;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {

	//private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:mysql:localhost/segp";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "badar5822634";

	public static void main(String[] argv) {
		try {
			selectRecordsFromTable();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void selectRecordsFromTable() throws SQLException {

		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;
		String selectSQL = "select * from clients;";

		try {
			dbConnection = getDBConnection();
			preparedStatement = dbConnection.prepareStatement(selectSQL);
			//preparedStatement.setInt(1, 1001);

			// execute select SQL stetement
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {

				String userid = rs.getString("username");
				String username = rs.getString("password");

				System.out.println("userid : " + userid);
				System.out.println("username : " + username);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}
			if (dbConnection != null) {
				dbConnection.close();
			}
		}
	}

	private static Connection getDBConnection() {
		Connection dbConnection = null;
		/*try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}*/
		try {
			dbConnection = DriverManager.getConnection(
                             DB_CONNECTION, DB_USER,DB_PASSWORD);
			return dbConnection;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return dbConnection;
	}
}