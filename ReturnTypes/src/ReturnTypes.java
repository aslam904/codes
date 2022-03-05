
public class ReturnTypes {

	public static void main(String[] args) {
		returnInt(123);
		returnBoolean(true);
		returnString("aslam");
		returnFloat((float) 1.243);
		returnDouble(1.875546768);
		returnByte((byte) 12);
		returnVoid();
	
		

	}
	
	//int type
	public static int returnInt(int a) {
		System.out.println("return answer is "+a);
		return a;
	}
	
	//String type
	public static String returnString(String a) {
		System.out.println("return answer is "+a);
		return a;
	}
	
	//Boolean type
	public static boolean returnBoolean(boolean a) {
		System.out.println("return answer is "+a);
		return a;
	}
	
	
	//return void
	public static void returnVoid() {
		System.out.println("This is a void function");
	}
	
	//return float
	public static float returnFloat(float a) {
		System.out.println("return answer is "+a);
		return a;
	}
	
	//return double
	public static double returnDouble(double a) {
		System.out.println("return answer is "+a);
		return a;
	}
	
	//return byte
	public static byte returnByte(byte a) {
		System.out.println("return answer is "+a);
		return a;
	}
	
	

}
