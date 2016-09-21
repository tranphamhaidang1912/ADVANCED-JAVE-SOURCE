package ManageContractClass;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 6-Sep-2016 8:28:11 AM Class for Class
 */
public class Class {

	public String contractId;
	public String className;
	public String headTeacher;
	public Date startDate;
	public Date endDate;
	public int totalNumberSession;
	List<Subject> listSubject = new ArrayList<Subject>();
	List<Student> listStudent = new ArrayList<Student>();
	List<Teacher> listTeacher = new ArrayList<Teacher>();

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getHeadTeacher() {
		return headTeacher;
	}

	public void setHeadTeacher(String headTeacher) {
		this.headTeacher = headTeacher;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getTotalNumberSession() {
		return totalNumberSession;
	}

	public void setTotalNumberSession(int totalNumberSession) {
		this.totalNumberSession = totalNumberSession;
	}

	public Class(String contractId, String className, String headTeacher, Date startDate, Date endDate,
			int totalNumberSession) {
		super();
		this.contractId = contractId;
		this.className = className;
		this.headTeacher = headTeacher;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalNumberSession = totalNumberSession;
	}

	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Show class's information
	public void showClassInformation() {
		System.out.println("Contract id: " + contractId);
		System.out.println("Class name: " + className);
		System.out.println("Head teacher: " + headTeacher);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Start date: " + dateFormat.format(startDate));
		System.out.println("End date: " + dateFormat.format(endDate));
		System.out.println("Total number session: " + totalNumberSession);
	}
}
