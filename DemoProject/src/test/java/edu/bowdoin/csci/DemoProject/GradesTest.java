package edu.bowdoin.csci.DemoProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** 
 * Tests for the Grades class
 * @author Kai Presler-Marshall
 */
public class GradesTest {

	/**
	 * Test A student
	 */
	@Test
	public void testAStudent() {
		Grades studentA = new Grades();
		studentA.setP0(145);
		studentA.setP1p1(105);
		studentA.setP1p2(150);
		studentA.setP2(400);
		studentA.setExam1(100);
		studentA.setExam2(100);
		
		studentA.addHomework(100);
		studentA.setClassParticipation(100);
		
		assertEquals(100, studentA.getFinalGrade(), 0.01);
		assertEquals("A+", studentA.getFinalLetterGrade());
		assertEquals(100, studentA.getProjectsGrade(), 0.01);
		assertEquals(100, studentA.getHomeworksGrade(), 0.01);
		assertEquals(100, studentA.getExamsGrade(), 0.01);
		assertEquals(100, studentA.getClassParticipation(), .01);
	}
	
	/**
	 * Test A student
	 */
	@Test
	public void testAStudent2() {
		Grades studentA = new Grades();
		studentA.setP0(145);
		studentA.setP1p1(105);
		studentA.setP1p2(150);
		studentA.setP2(400);
		studentA.setExam1(90);
		studentA.setExam2(95);
		
		studentA.addHomework(100);
		studentA.setClassParticipation(100);
		
		assertEquals(98.25, studentA.getFinalGrade(), 0.01);
		assertEquals("A+", studentA.getFinalLetterGrade());
		assertEquals(100, studentA.getProjectsGrade(), 0.01);
		assertEquals(100, studentA.getHomeworksGrade(), 0.01);
		assertEquals(93, studentA.getExamsGrade(), 0.01);
		assertEquals(100, studentA.getClassParticipation(), .01);
	}
	
	/**
	 * Test B student
	 */
	@Test
	public void testBStudent() {
		Grades studentB = new Grades();
		studentB.setP0(129);
		studentB.setP1p1(90);
		studentB.setP1p2(119);
		studentB.setP2(343);
		studentB.setExam1(85);
        studentB.setExam2(87);
        
        studentB.addHomework(87);
        studentB.addHomework(84);
        studentB.addHomework(89);
        
        studentB.setClassParticipation(82);

		assertEquals(84.97, studentB.getFinalGrade(), 0.01);
		assertEquals("B", studentB.getFinalLetterGrade());
		assertEquals(84.64, studentB.getProjectsGrade(), 0.01);
		assertEquals(86.2, studentB.getExamsGrade(), 0.01);
		assertEquals(86.67, studentB.getHomeworksGrade(), .01);
	}
	
	/**
	 * Test C student
	 */
	@Test
	public void testCStudent() {
		Grades studentC = new Grades();
		studentC.setP0(106);
		studentC.setP1p1(82);
		studentC.setP1p2(111);
		studentC.setP2(284);
		studentC.setExam1(79);
        studentC.setExam2(70);
        
        studentC.addHomework(80);
        studentC.addHomework(63);
        studentC.addHomework(78);
        
        studentC.setClassParticipation(72);

		assertEquals(72.69, studentC.getFinalGrade(), 0.01);
		assertEquals("C-", studentC.getFinalLetterGrade());
		assertEquals(72.23, studentC.getProjectsGrade(), 0.01);
		assertEquals(73.6, studentC.getExamsGrade(), 0.01);
		assertEquals(73.67, studentC.getHomeworksGrade(), .01);
	}
	
	
	/**
	 * Test F student
	 */
	@Test
	public void testFStudent() {
		
		Grades studentF = new Grades();
		
		studentF.setP0(0);
		studentF.setP1p1(17);
		studentF.setP1p2(45);
		studentF.setP2(149);
		studentF.setExam1(39);
		studentF.setExam2(43);
		
		studentF.addHomework(0);
		studentF.addHomework(59);
		studentF.addHomework(40);
		
		studentF.setClassParticipation(19);
		
	}
	

	
}
