package kampOdev;

public class Main {

	public static void main(String[] args) {
		Lesson lesson1 = new Lesson();
		Lesson lesson2 = new Lesson(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", "Engin Demirog", 25);
		
		lesson1.lessonId = 1;
		lesson1.lessonName = "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)";
		lesson1.instructorName = "Engin Demirog";
		lesson1.percentageCompletion = 100;
		
		Lesson[] lessons = {lesson1,lesson2};
		
		for(Lesson lesson:lessons) {
			System.out.println("Ders adý: "+lesson.lessonName);
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
