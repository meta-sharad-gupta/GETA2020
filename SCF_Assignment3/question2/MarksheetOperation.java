/**
 * 
 * @author Sharad
 * This class contains all the methods related to Marksheet
 *
 */
public class MarksheetOperation {
	float grade=0,returnGrades=0;
	int students=0;

	/*
	 * Used for finding average of grades of students
	 * @param grade[] : here we are getting the array in which grades of students are stored 
	 * @return returnGrades : it will return the average of grades of students
	 */
	public float averageGrades(float grades[]){


		for(int index=0;index<grades.length;index++){
			grade += grades[index];

		}
		returnGrades = (grade/grades.length);
		return returnGrades;

	}
	
	/*
	 * Used for finding maximum grade from all grades of students
	 * @param grade[] : here we are getting the array in which grades of students are stored 
	 * @return returnGrades : it will return the  maximum grade from all grades of students
	 */
	public float maximumGrade(float grades[]){
		int lastIndex = grades.length-1;

		for(int index=0;index<(grades.length/2)+1;index++){

			if(grades[index]>=grades[lastIndex])
				grade=grades[index];
			else
				grade=grades[lastIndex];

			if(grade>returnGrades)
				returnGrades=grade;
			lastIndex -=1;


		}
		return returnGrades;
	}
	
	/*
	 * Used for finding minimum grade from all grades of students
	 * @param grade[] : here we are getting the array in which grades of students are stored 
	 * @return returnGrades : it will return the  minimum grade from all grades of students
	 */
	public float minimumGrade(float grades[]){
		int lastIndex = grades.length-1;
		returnGrades=100;

		for(int index=0;index<(grades.length/2)+1;index++){

			if(grades[index]<grades[lastIndex])
				grade=grades[index];
			else
				grade=grades[lastIndex];

			if(grade<returnGrades)
				returnGrades=grade;

			lastIndex -=1;


		}
		return returnGrades;
	}
	
	/*
	 * Used for finding percentage of passed students
	 * @param grade[] : here we are getting the array in which grades of students are stored 
	 * @return passStudents : here we are getting the percentage of passed students 
	 */
	public float passStudents(float grades[]){
		for(int index=0;index<grades.length;index++){
			if(grades[index]>=40.00)
				students++;

		}
		float passStudents = (students*100)/grades.length;
		return passStudents;


	}
}
