package ManageContractClass;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 6-Sep-2016 8:28:11 AM Class for Subject
 */

public class Subject {

	public String subjectName;
	public String subjectTeacher;
	public int numberSession;
	public Date startDate;
	public Date endDate;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectTeacher() {
		return subjectTeacher;
	}

	public void setSubjectTeacher(String subjectTeacher) {
		this.subjectTeacher = subjectTeacher;
	}

	public int getNumberSession() {
		return numberSession;
	}

	public void setNumberSession(int numberSession) {
		this.numberSession = numberSession;
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

	public Subject(String subjectName, String subjectTeacher, int numberSession, Date startDate, Date endDate) {
		super();
		this.subjectName = subjectName;
		this.subjectTeacher = subjectTeacher;
		this.numberSession = numberSession;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Show subject's information
	public void showSubjectInformation() {
		System.out.println("Subject name: " + subjectName);
		System.out.println("Subject teacher: " + subjectTeacher);
		System.out.println("Number session: " + numberSession);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Start date: " + dateFormat.format(startDate));
		System.out.println("End date: " + dateFormat.format(endDate));
	}
}
