
public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		System.out.println("-----------------------Öğrenciler--------------------------");
		Student student1 = new Student(1,"Ahmet","Yılmaz","10578596417","ahmet.yilmaz@gmail.com","123456789","190147258057",2);
		Student student2 = new Student(2,"Melisa","Sığın","44689726493","melisa.sigin@gmail.com","987654321","190587269097",1);
		Student[] students = {student1,student2};
		studentManager.getAllDetailStudents(students);
		
		System.out.println("-----------------------Eğitmenler--------------------------");
		Instructor instructor1 = new Instructor(3,"Engin","Demiroğ","34978542972","engin.demirog@gmail.com","147896325",2,9500);
		Instructor instructor2 = new Instructor(4,"Esra","Sancak","25978436478","esra.sancak@gmail.com","1793254862",5,8800);
		Instructor[] instructors = {instructor1,instructor2};
		instructorManager.getAllDetailsInstructor(instructors);
		
		
		System.out.println("");
		System.out.println("     -----UserManager Bölümü-----");
		userManager.addMultiple(instructors);
		userManager.updateMultiple(students);
		userManager.deleteMultiple(instructors);
		
		System.out.println("");
		System.out.println("     -----StudentManager Bölümü-----");
		studentManager.register(student2);
		studentManager.register(student1);
		studentManager.getAll(students);
		studentManager.login(student1);
		studentManager.exit(student1);
		studentManager.login(student2);
		studentManager.exit(student2);
		
		System.out.println("");
		System.out.println("     -----InstructorManager Bölümü-----");
		instructorManager.getAll(instructors);
		instructorManager.login(instructor1);
		instructorManager.login(instructor2);
		instructorManager.exit(instructor1);
		instructorManager.exit(instructor2);

	}

}
