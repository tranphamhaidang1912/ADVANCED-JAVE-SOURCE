package JAVA_IO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 19-Sep-2016 Class for Database
 */
public class Database {

	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/cdstore?useUnicode=true&characterEncoding=utf8";

	private static final String JDBC_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";

	private static final String JDBC_USERNAME = "root";

	private static final String JDBC_PASSWORD = "";

	public Connection connect() throws SQLException, ClassNotFoundException {
		Class.forName(JDBC_DRIVER_CLASS);
		Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME,
				JDBC_PASSWORD);

		return conn;
	}
}