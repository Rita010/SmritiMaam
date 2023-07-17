package SmritiMaamRevision;

public class Day2 {

	public static void main(String[] args) {
		
		studentAAA rita = new studentAAA("Rita", "Regmi");
		rita.DisplayFullName();
		
		
		System.out.println("----------- next line -------------");
		
		teacherBBB gita = new teacherBBB ("Gita", "Khatiwada", 50000);
		gita.DisplaySalary();
		
		
		System.out.println("----------- next line -------------");
		
		
		professorCCC silva = new professorCCC ("Silva", "Bhattarai", "Economics");
		silva.DisplaySubject();
	}

}
class studentAAA{
	String firstName;
	String lastName;
	public studentAAA(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	public void DisplayFullName () {
		System.out.println(this.firstName + " " +this.lastName);
		
	}
}
class teacherBBB extends studentAAA {
	int salary;
	public teacherBBB(String fn, String ln, int sal) {
		super(fn, ln);
		this.salary = sal;
	}
	public void DisplaySalary() {
		System.out.println(this.salary);
		super.DisplayFullName();	
	}
}
class professorCCC extends studentAAA {   // hierachal inheretance
	String subject;
	public professorCCC(String fn, String ln, String sub) {
		super(fn, ln);
		this.subject = sub;
	}
	public void DisplaySubject() {
		System.out.println(this.subject);
		super.DisplayFullName();
	}
}








