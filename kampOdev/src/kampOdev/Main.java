package kampOdev;

public class Main {

	public static void main(String[] args) {
		Lesson lesson1 = new Lesson();
		Lesson lesson2 = new Lesson(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", "Engin Demirog", 25);
		
		lesson1.lessonId = 1;
		lesson1.lessonName = "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)";
		lesson1.instructorName = "Engin Demirog";
		lesson1.percentageCompletion = 100;
		
		Lesson[] lessons = {lesson1,lesson2};
		
		for(Lesson lesson:lessons) {
			System.out.println("Ders ad�: "+lesson.lessonName);
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
