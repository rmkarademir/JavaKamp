package kampOdev;

public class Course {
	
	public Course(int courseId, String courseName, String instructorName,int percentageCompletion) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.percentageCompletion = percentageCompletion;
	}
	
	public Course() {
	}

	int courseId;
	String courseName;
	String instructorName;
	int percentageCompletion;
}
