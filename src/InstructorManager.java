
public class InstructorManager extends UserManager {

	public void getAll(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println("Tüm eðitmenler listelendi. -> " + instructor.getFirstName() + instructor.getLastName());
		}
	}
	
	public void login(Instructor instructor) {
		System.out.println("Giriþ yapýldý. -> " + instructor.getFirstName());
	}
	
	public void exit(Instructor instructor) {
		System.out.println("Çýkýþ yapýldý. -> " + instructor.getFirstName());
	}
	
	public void getAllDetailsInstructor(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println("Ýsim: " + instructor.getFirstName());
			System.out.println("Soyisim: " + instructor.getLastName());
			System.out.println("Tc No: " + instructor.getIdentityNumber());
			System.out.println("Email: " + instructor.getEmail());
			System.out.println("Þifre: " + instructor.getPassword());
			System.out.println("Öðrenci Sayýsý: " + instructor.getStudentCount());
			System.out.println("Maaþ: " + instructor.getSalary());
			System.out.println(" ----------------------------------");
		}
	}
	
	
}
