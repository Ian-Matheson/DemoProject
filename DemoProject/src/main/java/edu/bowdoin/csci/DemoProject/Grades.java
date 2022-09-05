package edu.bowdoin.csci.DemoProject;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the grades of a CSCI 2335 student.
 * 
 * @author Kai Presler-Marshall
 */
public class Grades {

	/** Project 0 Grade */
	private double p0;

	/** Project 1 Part 1 grade */
	private double p1p1;
	/** Project 1 Part 2 grade */
	private double p1p2;

	/** Project 2 grade */
	private double p2;

	/** Exam 1 grade */
	private double exam1;
	/** Exam 2 grade */
	private double exam2;

	/** Homework assignment grades */
	private List<Double> homework = new ArrayList<Double>();
	
	/** Class participation grade */
	private double classParticipation;

	/** Weighting of Project 0 in final grade */
	private static final int P0_PERCENT = 5;
	/** Maximum score possible on Project 0 */
	private static final int P0_MAX_POINTS = 145;

	/** Weighting of Project 1 in final grade */
	private static final int P1_PERCENT = 15;
	/** Weighting of Part 1 in project 1 grade */
	private static final int PART1_PERCENT = 20;
	/** Weighting of Part 2 in project 1 grade */
	private static final int PART2_PERCENT = 80;
	/** Maximum score possible on Project 1 Part 1 */
	private static final int P1P1_MAX_POINTS = 105;
	/** Maximum score possible on Project 1 Part 2 */
	private static final int P1P2_MAX_POINTS = 150;

	/** Weighting of Project 2 in final grade */
	private static final int P2_PERCENT = 35;
	/** Maximum score possible on Project 2 */
	private static final int P2_MAX_POINTS = 400;

	/** Overall project weighting in final grade */
	private static final int PROJECT_PERCENT = P0_PERCENT + P1_PERCENT + P2_PERCENT;

	/** Weighting of homeworks in final grade */
	private static final int HOMEWORK_PERCENT = 10;

	/** Weighting of exams in final grade */
	private static final int EXAM_PERCENT = 25;
	/** Weighting of Exam 1 in final grade */
	private static final int EXAM1_PERCENT = 10;
	/** Weighting of Exam 2 in final grade */
	private static final int EXAM2_PERCENT = 15;
	
	/** Weighting of class participation grade */
	private static final int PARTICIPATION_PERCENT = 10;

	/** Grade cutoff for D- */
	private static final int D_MINUS = 60;
	/** Grade cutoff for D */
	private static final int D = 63;
	/** Grade cutoff for D+ */
	private static final int D_PLUS = 67;
	/** Grade cutoff for C- */
	private static final int C_MINUS = 70;
	/** Grade cutoff for C- */
	private static final int C = 73;
	/** Grade cutoff for C+ */
	private static final int C_PLUS = 77;
	/** Grade cutoff for B- */
	private static final int B_MINUS = 80;
	/** Grade cutoff for B */
	private static final int B = 83;
	/** Grade cutoff for B+ */
	private static final int B_PLUS = 87;
	/** Grade cutoff for A- */
	private static final int A_MINUS = 90;
	/** Grade cutoff for A */
	private static final int A = 93;
	/** Grade cutoff for A+ */
	private static final int A_PLUS = 97;
	/** Full score in CSCI 2335 */
	private static final int FULL_SCORE = 100;

	/**
	 * Returns the final numerical grade for the course.
	 */
	public double getFinalGrade() {
		double grade = (getProjectsGrade() * PROJECT_PERCENT + getHomeworksGrade() * HOMEWORK_PERCENT
				+ getExamsGrade() * EXAM_PERCENT + getClassParticipation() * PARTICIPATION_PERCENT) / FULL_SCORE;

		return grade;
	}

	/**
	 * Gets the average grade across all homework assignments
	 * @return Average HW grade
	 */
	public double getHomeworksGrade() {
		return homework.stream().reduce(Double.valueOf(0), (a, b) -> a + b) / homework.size();
	}

	public double getProjectsGrade() {
		double project0grade = (p0 / P0_MAX_POINTS) * P0_PERCENT;
		double project1Part1grade = (p1p1 / P1P1_MAX_POINTS) * PART1_PERCENT;
		double project1Part2grade = (p1p2 / P1P2_MAX_POINTS) * PART2_PERCENT;
		double project1grade = (project1Part1grade + project1Part2grade) * P1_PERCENT / 100;
				
				
		double project2grade = (p2 / P2_MAX_POINTS) * P2_PERCENT;

		return 100 * (project0grade + project1grade + project2grade) / PROJECT_PERCENT;
	}

	/**
	 * Returns the exam grades.
	 * 
	 * @return exam grades
	 */
	public double getExamsGrade() {
		double exam1grade = exam1 * EXAM1_PERCENT;
		double exam2grade = exam2 * EXAM2_PERCENT;

		return ((exam1grade + exam2grade) / (EXAM1_PERCENT + EXAM2_PERCENT));
	}

	/**
	 * Returns the letter grade for CSCI 2335
	 * 
	 * @return letter grade for CSCI 2335
	 */
	public String getFinalLetterGrade() {
		double grade = getFinalGrade();

		if (grade >= A_PLUS)
			return "A+";
		if (grade >= A)
			return "A";
		if (grade >= A_MINUS)
			return "A-";
		if (grade >= B_PLUS)
			return "B+";
		if (grade >= B)
			return "B+";
		if (grade >= B_MINUS)
			return "B-";
		if (grade >= C_PLUS)
			return "C+";
		if (grade >= C)
			return "C";
		if (grade >= C_MINUS)
			return "C-";
		if (grade >= D_PLUS)
			return "D+";
		if (grade >= D)
			return "D";
		if (grade >= D_MINUS)
			return "D-";
		if (grade >= 0)
			return "F";
		return null;

	}

	/**
	 * Returns the grade for Project 0
	 * 
	 * @return Project 0 grade
	 */
	public double getP0() {
		return p0;
	}

	/**
	 * Sets the grade for Project 0
	 * 
	 * @param p0 Project 0 grade
	 */
	public void setP0(double p0) {
		this.p0 = p0;
	}

	/**
	 * Returns the grade for Project 1 Part 1
	 * 
	 * @return Project 1 Part 1 grade
	 */
	public double getP1p1() {
		return p1p1;
	}

	/**
	 * Sets the grade for Project 1 Part 1
	 * 
	 * @param p1p1 Project 1 Part 1 grade
	 */
	public void setP1p1(double p1p1) {
		this.p1p1 = p1p1;
	}

	/**
	 * Returns the grade for Project 1 Part 2
	 * 
	 * @return Project 1 Part 2 grade
	 */
	public double getP1p2() {
		return p1p2;
	}

	/**
	 * Sets the grade for Project 1 Part 2
	 * 
	 * @param p1p2 Project 1 Part 2 grade
	 */
	public void setP1p2(double p1p2) {
		this.p1p2 = p1p2;
	}

	/**
	 * Gets the grade for Project 2
	 * 
	 * @return Project 2 grade
	 */
	public double getP2() {
		return p2;
	}

	/**
	 * Sets the grade for Project 2
	 * 
	 * @param p2 Project 2 grade
	 */
	public void setP2(double p2) {
		this.p2 = p2;
	}

	/**
	 * Gets the grade for Exam 1
	 * 
	 * @return Exam 1 grade
	 */
	public double getExam1() {
		return exam1;
	}

	/**
	 * Sets the grade for Exam 1
	 * 
	 * @param exam1 Exam 1 grade
	 */
	public void setExam1(double exam1) {
		this.exam1 = exam1;
	}

	/**
	 * Gets the grade for Exam 2
	 * 
	 * @return Exam 2 grade
	 */
	public double getExam2() {
		return exam2;
	}

	/**
	 * Sets the grade for Exam 2
	 * 
	 * @param exam2 Grade for Exam 2
	 */
	public void setExam2(double exam2) {
		this.exam2 = exam2;
	}

	/**
	 * Gets the homework grades
	 * 
	 * @return List of all homework grades
	 */
	public List<Double> getHomework() {
		return homework;
	}

	/**
	 * Sets homework grades
	 * 
	 * @param homework List of all homework grades
	 */
	public void setHomework(List<Double> homework) {
		this.homework = homework;
	}

	/**
	 * Adds a Homework grade
	 * 
	 * @param homework New grade to add to list
	 */
	public void addHomework(double homework) {
		this.homework.add(homework);
	}

	/**
	 * Gets the class participation grade
	 * @return Class participation grade
	 */
	public double getClassParticipation() {
		return classParticipation;
	}

	/**
	 * Sets the class participation grade
	 * @param Class participation grade
	 */
	public void setClassParticipation(double classParticipation) {
		this.classParticipation = classParticipation;
	}

	/**
	 * Returns grade info as a String.
	 * 
	 * @return grade info
	 */
	@Override
	public String toString() {
		String gradeInfo = "";
		gradeInfo += "Project Grade: " + getProjectsGrade() + "\n";
		gradeInfo += "Exam Grade: " + getExamsGrade() + "\n";
		gradeInfo += "Homework Grade: " + getHomeworksGrade() + "\n";
		gradeInfo += "Final Grade: " + getFinalGrade() + "\n";
		gradeInfo += "Final Letter Grade: " + getFinalLetterGrade();
		return gradeInfo;
	}

}
