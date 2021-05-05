package kampOdev2;

public class InstructorManager extends UserManager {
	public void add(User user) {
		System.out.println("Eðitmen " + user.firstName + " " + user.lastName + " Eklendi");
	}
	public void remove(User user) {
		System.out.println("Eðitmen " + user.firstName + " " + user.lastName + " Silindi");
	}
	public void update(User user) {
		System.out.println("Eðitmen " + user.firstName + " " + user.lastName + " Güncellendi");
	}
}
