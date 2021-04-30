
public class StudentManager extends UserManager {
	
	
	public void getAll(Student[] students) {	
		for (Student student : students) {
			System.out.println("Tüm öğrenciler listelendi. -> " + student.getFirstName());
		}
	}
	
	public void register(Student student) {
		System.out.println("Kayıt başarıyla yapıldı -> " + student.getFirstName());
	}
	
	public void login(Student student) {
		System.out.println("Giriş yapıldı -> " + student.getFirstName());
	}
	
	public void exit(Student student) {
		System.out.println("Çıkış yapıldı -> " + student.getFirstName());
	}
	
	public void getAllDetailStudents(Student[] students) {
		for (Student student : students) {
			 System.out.println("İsim: " + student.getFirstName());
			  System.out.println("Soyisim: " + student.getLastName());
			  System.out.println("Tc No: " + student.getIdentityNumber());
			  System.out.println("E-mail: " + student.getEmail());
			  System.out.println("Şifre: " + student.getPassword());
			  System.out.println("Öğrenci No: " + student.getStudentNumber());
			  System.out.println("Kurs Sayısı: " + student.getCourseCount());
			  System.out.println(" ----------------------------------");
		}
	}

}
