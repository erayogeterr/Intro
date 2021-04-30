
public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullan�c� Ba�ar�yla eklendi.");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
	
	public void update(User user) {
	System.out.println("Kullan�c� Ba�ar�yla g�ncellendi.");
	}
	
	public void updateMultiple(User[] users) {
		for (User user : users) {
			update(user);
		}
	}
	
	public void delete(User user) {
	System.out.println("Kullan�c� Ba�ar�yla silindi.");
	}
	
	public void deleteMultiple(User[] users) {
		for (User user : users) {
			delete(user);
		}
	}
}
