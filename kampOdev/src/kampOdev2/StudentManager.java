package kampOdev2;

public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println("��renci " + user.firstName + " " + user.lastName + " Eklendi");
	}
	public void remove(User user) {
		System.out.println("��renci " + user.firstName + " " + user.lastName + " Silindi");
	}
	public void update(User user) {
		System.out.println("��renci " + user.firstName + " " + user.lastName + " G�ncellendi");
	}
}
