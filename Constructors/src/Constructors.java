
public class Constructors {
	private String name;
	public Constructors(String name) {
		this.name=name;
		System.out.println("this is a parameterized constructor");
		
	}
	
	public Constructors() {
		System.out.println("This is a nonparameterized constructor");
	}
	
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors con=new Constructors();
		Constructors con1=new Constructors("aslam");
		con1.setName("aslam");
		System.out.println("The passed parameter is "+con1.getName());
		

	}

}
