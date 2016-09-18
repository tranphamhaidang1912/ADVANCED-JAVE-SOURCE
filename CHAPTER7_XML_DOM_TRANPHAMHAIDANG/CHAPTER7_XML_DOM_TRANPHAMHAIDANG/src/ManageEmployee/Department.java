package ManageEmployee;

public class Department {

	private String idDepartment;
	private String name;

	public String getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(String idDepartment) {
		this.idDepartment = idDepartment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department(String idDepartment, String name) {
		super();
		this.idDepartment = idDepartment;
		this.name = name;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
