package ManageContractClass;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 6-Sep-2016 8:28:11 AM
 * Class for Attendance
 */
public class Attendance {

	private boolean presentMorning = true;
	private boolean absenceMorning = false;
	private boolean lateMorning = false;
	private boolean earlyMorning = false;
	private boolean presentAfternoon = true;
	private boolean absenceAfternoon = false;
	private boolean lateAfternoon = false;
	private boolean earlyAfternoon = false;

	public boolean isPresentMorning() {
		return presentMorning;
	}

	public void setPresentMorning(boolean presentMorning) {
		this.presentMorning = presentMorning;
	}

	public boolean isAbsenceMorning() {
		return absenceMorning;
	}

	public void setAbsenceMorning(boolean absenceMorning) {
		this.absenceMorning = absenceMorning;
	}

	public boolean isLateMorning() {
		return lateMorning;
	}

	public void setLateMorning(boolean lateMorning) {
		this.lateMorning = lateMorning;
	}

	public boolean isEarlyMorning() {
		return earlyMorning;
	}

	public void setEarlyMorning(boolean earlyMorning) {
		this.earlyMorning = earlyMorning;
	}

	public boolean isPresentAfternoon() {
		return presentAfternoon;
	}

	public void setPresentAfternoon(boolean presentAfternoon) {
		this.presentAfternoon = presentAfternoon;
	}

	public boolean isAbsenceAfternoon() {
		return absenceAfternoon;
	}

	public void setAbsenceAfternoon(boolean absenceAfternoon) {
		this.absenceAfternoon = absenceAfternoon;
	}

	public boolean isLateAfternoon() {
		return lateAfternoon;
	}

	public void setLateAfternoon(boolean lateAfternoon) {
		this.lateAfternoon = lateAfternoon;
	}

	public boolean isEarlyAfternoon() {
		return earlyAfternoon;
	}

	public void setEarlyAfternoon(boolean earlyAfternoon) {
		this.earlyAfternoon = earlyAfternoon;
	}

	public Attendance(boolean presentMorning, boolean absenceMorning, boolean lateMorning, boolean earlyMorning,
			boolean presentAfternoon, boolean absenceAfternoon, boolean lateAfternoon, boolean earlyAfternoon) {
		super();
		this.presentMorning = presentMorning;
		this.absenceMorning = absenceMorning;
		this.lateMorning = lateMorning;
		this.earlyMorning = earlyMorning;
		this.presentAfternoon = presentAfternoon;
		this.absenceAfternoon = absenceAfternoon;
		this.lateAfternoon = lateAfternoon;
		this.earlyAfternoon = earlyAfternoon;
	}

	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
