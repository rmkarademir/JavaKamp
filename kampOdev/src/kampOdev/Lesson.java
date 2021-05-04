package kampOdev;

public class Lesson {
	
	public Lesson(int lessonId, String lessonName, String instructorName,int percentageCompletion) {
		this.lessonId = lessonId;
		this.lessonName = lessonName;
		this.instructorName = instructorName;
		this.percentageCompletion = percentageCompletion;
	}
	
	public Lesson() {
	}

	int lessonId;
	String lessonName;
	String instructorName;
	int percentageCompletion;
}
