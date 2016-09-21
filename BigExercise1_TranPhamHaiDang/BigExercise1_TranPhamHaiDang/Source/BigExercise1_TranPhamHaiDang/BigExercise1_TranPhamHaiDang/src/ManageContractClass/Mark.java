package ManageContractClass;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 6-Sep-2016 8:28:11 AM
 * Class for Mark
 */
public class Mark {

	private String subjectName;
	List<Double> listExerciseMark = new ArrayList<>();
	List<Double> listPositiveMark = new ArrayList<>();
	List<Attendance> listAttendance = new ArrayList<>();
	private double multipleChoiceMark = 0;
	private double essayMark = 0;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public List<Attendance> getListAttendance() {
		return listAttendance;
	}

	public void setListAttendance(List<Attendance> listAttendance) {
		this.listAttendance = listAttendance;
	}

	public List<Double> getListExerciseMark() {
		return listExerciseMark;
	}

	public void setListExerciseMark(List<Double> listExerciseMark) {
		this.listExerciseMark = listExerciseMark;
	}

	public List<Double> getListPositiveMark() {
		return listPositiveMark;
	}

	public void setListPositiveMark(List<Double> listPositiveMark) {
		this.listPositiveMark = listPositiveMark;
	}

	public double getMultipleChoiceMark() {
		return multipleChoiceMark;
	}

	public void setMultipleChoiceMark(double multipleChoiceMark) {
		this.multipleChoiceMark = multipleChoiceMark;
	}

	public double getEssayMark() {
		return essayMark;
	}

	public void setEssayMark(double essayMark) {
		this.essayMark = essayMark;
	}

	public Mark(String subjectName, List<Attendance> listAttendance, List<Double> listExerciseMark,
			List<Double> listPositiveMark, double multipleChoiceMark, double essayMark) {
		super();
		this.subjectName = subjectName;
		this.listAttendance = listAttendance;
		this.listExerciseMark = listExerciseMark;
		this.listPositiveMark = listPositiveMark;
		this.multipleChoiceMark = multipleChoiceMark;
		this.essayMark = essayMark;
	}

	public Mark() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getAverageExerciseMark() {
		double totalExerciseMark = 0;
		for (Double exerciseMark : listExerciseMark) {
			totalExerciseMark += exerciseMark * 0.6;
		}
		double averageExerciseMark = totalExerciseMark / listExerciseMark.size();
		
		return averageExerciseMark;
	}
	
	public double getAveragePositiveMark() {
		double totalPositiveMark = 0;
		for (Double positiveMark : listPositiveMark) {
			totalPositiveMark += positiveMark * 0.1;
		}
		double averagePositiveMark = totalPositiveMark / listPositiveMark.size();
		
		return averagePositiveMark;
	}
	
	public double getAverageAttendanceMark() {
		double totalAttendanceMark = 0;
		double attendanceMorningMark = 0;
		double attendanceAfternoonMark = 0;
		for (Attendance attendance : listAttendance) {
			if(attendance.isPresentMorning())
			{
				if(attendance.isLateMorning() || attendance.isEarlyMorning())
					attendanceMorningMark = 5;
				else
					attendanceMorningMark = 10;
			}	
			else
				attendanceMorningMark = 0;
			
			if(attendance.isPresentAfternoon())
			{
				if(attendance.isLateAfternoon() || attendance.isEarlyAfternoon())
					attendanceAfternoonMark = 5;
				else
					attendanceAfternoonMark = 10;
			}
			else
				attendanceAfternoonMark = 0;
			
			totalAttendanceMark += (attendanceMorningMark + attendanceAfternoonMark) / 2;
			totalAttendanceMark *= 0.3;
		}
		double averageAttendanceMark = totalAttendanceMark / listAttendance.size();
		
		return averageAttendanceMark;
	}
	
	public double getAveragePersonalMark() {
		double averagePersonalMark = getAverageExerciseMark() + getAveragePositiveMark() + getAverageAttendanceMark();
		
		return averagePersonalMark;
	}
	
	public double getAverageMark() {
		double averageMark = getAveragePersonalMark() * 0.3 + multipleChoiceMark * 0.4 + essayMark * 0.3;
		
		return averageMark;
	}
}
