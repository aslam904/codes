
public class InnerClass {
	private String name;
	public InnerClass(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public class ClassInsideClass{
		private int age;
		public ClassInsideClass(int age) {
			this.age=age;
		}
		public int getAge() {
			return age;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass inc=new InnerClass("aslam");
		InnerClass.ClassInsideClass icls=inc.new ClassInsideClass(12);
		System.out.println("The name of the person is "+inc.getName()+" and the person's age is "+icls.getAge());

	}

}
