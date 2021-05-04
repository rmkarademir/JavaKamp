package kampOdev;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course();
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", "Engin Demirog", 25);
		
		course1.courseId = 1;
		course1.courseName = "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)";
		course1.instructorName = "Engin Demirog";
		course1.percentageCompletion = 100;
		
		Course[] lessons = {course1,course2};
		
		for(Course lesson:lessons) {
			System.out.println("Kurs ad�: "+lesson.courseName);
			System.out.println("E�itmen ad�: "+lesson.instructorName);
			System.out.println("Tamamlanma oran�: %"+lesson.percentageCompletion);
			System.out.println("*********");

		}
		
		ButtonManager buttonManager = new ButtonManager();
		
		buttonManager.submitButton();
		buttonManager.nextButton();
		buttonManager.previousButton();

	}

}
