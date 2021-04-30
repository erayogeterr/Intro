
public class StudentManager extends UserManager {
	
	
	public void getAll(Student[] students) {	
		for (Student student : students) {
			System.out.println("T�m ��renciler listelendi. -> " + student.getFirstName());
		}
	}
	
	public void register(Student student) {
		System.out.println("Kay�t ba�ar�yla yap�ld� -> " + student.getFirstName());
	}
	
	public void login(Student student) {
		System.out.println("Giri� yap�ld� -> " + student.getFirstName());
	}
	
	public void exit(Student student) {
		System.out.println("��k�� yap�ld� -> " + student.getFirstName());
	}
	
	public void getAllDetailStudents(Student[] students) {
		for (Student student : students) {
			 System.out.println("�sim: " + student.getFirstName());
			  System.out.println("Soyisim: " + student.getLastName());
			  System.out.println("Tc No: " + student.getIdentityNumber());
			  System.out.println("E-mail: " + student.getEmail());
			  System.out.println("�ifre: " + student.getPassword());
			  System.out.println("��renci No: " + student.getStudentNumber());
			  System.out.println("Kurs Say�s�: " + student.getCourseCount());
			  System.out.println(" ----------------------------------");
		}
	}

}
