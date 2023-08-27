package SamplePrjct;

public class ConstrctrExmplPrgm {
	
public ConstrctrExmplPrgm() {
		
		System.out.println("Default constructor without parameters");
	}
	
	public ConstrctrExmplPrgm(String Name) {
		
		System.out.println("Parameterized constructor" + Name);
	}
	public ConstrctrExmplPrgm(int age) {
		
		System.out.println(age);
	}
	
	public static void main(String args[]) {
		
		ConstrctrExmplPrgm cobct1 = new ConstrctrExmplPrgm();
		ConstrctrExmplPrgm cobct2 = new ConstrctrExmplPrgm("Priyanka");
		ConstrctrExmplPrgm cobct3 = new ConstrctrExmplPrgm(33);
		
	}

}
