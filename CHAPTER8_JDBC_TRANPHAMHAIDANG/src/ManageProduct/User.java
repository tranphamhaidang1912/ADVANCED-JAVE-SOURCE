package ManageProduct;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 17-Sep-2016 Class for User
 */
public class User {
	int id;
	String user;
	String password;
	
	public User(int id, String user, String password) {
		this.id = id;
		this.user = user;
		this.password = password;
	}
	public User() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
