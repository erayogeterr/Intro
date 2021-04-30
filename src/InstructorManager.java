
public class InstructorManager extends UserManager {

	public void getAll(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println("T�m e�itmenler listelendi. -> " + instructor.getFirstName() + instructor.getLastName());
		}
	}
	
	public void login(Instructor instructor) {
		System.out.println("Giri� yap�ld�. -> " + instructor.getFirstName());
	}
	
	public void exit(Instructor instructor) {
		System.out.println("��k�� yap�ld�. -> " + instructor.getFirstName());
	}
	
	public void getAllDetailsInstructor(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println("�sim: " + instructor.getFirstName());
			System.out.println("Soyisim: " + instructor.getLastName());
			System.out.println("Tc No: " + instructor.getIdentityNumber());
			System.out.println("Email: " + instructor.getEmail());
			System.out.println("�ifre: " + instructor.getPassword());
			System.out.println("��renci Say�s�: " + instructor.getStudentCount());
			System.out.println("Maa�: " + instructor.getSalary());
			System.out.println(" ----------------------------------");
		}
	}
	
	
}
