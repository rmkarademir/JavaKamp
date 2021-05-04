package kampOdev;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course();
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", "Engin Demirog", 25);
		
		course1.courseId = 1;
		course1.courseName = "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)";
		course1.instructorName = "Engin Demirog";
		course1.percentageCompletion = 100;
		
		Course[] lessons = {course1,course2};
		
		for(Course lesson:lessons) {
			System.out.println("Kurs adý: "+lesson.courseName);
			System.out.println("Eðitmen adý: "+lesson.instructorName);
			System.out.println("Tamamlanma oraný: %"+lesson.percentageCompletion);
			System.out.println("*********");

		}
		
		ButtonManager buttonManager = new ButtonManager();
		
		buttonManager.submitButton();
		buttonManager.nextButton();
		buttonManager.previousButton();

	}

}
