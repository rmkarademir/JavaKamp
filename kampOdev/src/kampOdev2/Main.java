package kampOdev2;

public class Main {

	public static void main(String[] args) {
		
		
		Student student1 = new Student();
		student1.id = 1;
		student1.firstName = "Rüstem";
		student1.lastName = "Karademir";
		student1.studentNumber = 667;
		
		Instructor instructor1 = new Instructor();
		instructor1.id = 1;
		instructor1.firstName = "Engin";
		instructor1.lastName = "Demiroğ";
		instructor1.profession = "Yazılım";
		
		UserManager studentManager = new StudentManager();
		UserManager instructorManager = new InstructorManager();
		studentManager.add(student1);;
		instructorManager.update(instructor1);
		
		User [] users = {student1,instructor1};
		for (User user : users) {
			System.out.println(user.firstName);
			System.out.println("*******");
		}
	}

}
