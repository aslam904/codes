//public access modifier

public class AccessModifiers {

	public static void main(String[] args) {
		PrivateClass cls=new PrivateClass();
		cls.setName("Aslam");
		System.out.println("The name is "+cls.getName());
		
		DefaultClass dft=new DefaultClass();
		dft.message();
		ProtectedClass pc=new ProtectedClass();
		pc.protectedmessage();
		
	}
	
	

}


//default access modifier

class DefaultClass{
	void message() {
		System.out.println("this is a default modifier");
	}
}


class PrivateClass{
	private String name;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
}

class ProtectedClass extends AccessModifiers {
	protected void protectedmessage() {
		System.out.println("This is a protected class");
	}
}