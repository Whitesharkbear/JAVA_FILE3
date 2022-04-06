package ch20.productDb;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static DBConnect db = new DBConnect();
	private Connection conn = null;
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@localhost:1521:orcl";

	private DBConnect() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "scott", "tiger");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static DBConnect getInstance() {
		return db;
	}

	public Connection getConnection() {
		return conn;
	}

}
