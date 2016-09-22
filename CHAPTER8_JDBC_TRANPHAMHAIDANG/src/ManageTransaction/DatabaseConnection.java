package ManageTransaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 17-Sep-2016 Class for Database Connection
 */
public class DatabaseConnection {
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/store?useUnicode=true&characterEncoding=utf8";
	private static final String JDBC_DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static final String JDBC_USERNAME = "root";
	private static final String JDBC_PASSWORD = "";
	
    //connect to database
	public Connection connect() throws ClassNotFoundException, SQLException{
		Class.forName(JDBC_DRIVER_CLASS);
		Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
		return conn;
	}
}
