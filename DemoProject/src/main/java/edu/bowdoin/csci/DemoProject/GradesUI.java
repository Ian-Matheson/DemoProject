package edu.bowdoin.csci.DemoProject;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GradesUI {
	
	/**
	 * Prompts the user for grades and calculates the student's grade.
	 */
	public void requestGrades() {
		Grades grades = null;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter numerical grades for the following assignments:");
		System.out.println("Project 0: ");
		grades.setP0(in.nextDouble());
		
		System.out.println("Project 1 Part 1: ");
		grades.setP1p1(in.nextDouble());
		
		System.out.println("Project 1 Part 2: ");
		grades.setP1p2(in.nextDouble());
		
		System.out.println("Project 2: ");
		grades.setP2(in.nextDouble());
		
		System.out.println("Exam 1: ");
        grades.setExam1(in.nextDouble());
        
        System.out.println("Exam 2: ");
        grades.setExam2(in.nextDouble());
        
        System.out.println("Class Participation: ");
        grades.setClassParticipation(in.nextDouble());
        
        System.out.println("Homeworks (one line, individual grades separated by spaces):");
        grades.setHomework(Arrays.asList(in.next().split(" ")).stream().map(e -> Double.valueOf(e)).collect(Collectors.toList()));
		
		in.close(); //Always close things that you open.
		
		System.out.println(grades.toString());
	}
	
	/**
	 * Starts the program
	 * @param args
	 */
	public static void main(String[] args) {
		GradesUI ui = new GradesUI();
		ui.requestGrades();
	}

}