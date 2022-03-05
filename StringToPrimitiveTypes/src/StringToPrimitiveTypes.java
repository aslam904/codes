
public class StringToPrimitiveTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var1="17";
		String var2="123466568";
		String var3="121.7567674";
		String var4="123.654";
		//String to int
		int i=Integer.parseInt(var1);
		System.out.println("Converted string as int "+i);
		//String as Double
		double j=Double.parseDouble(var3);
		System.out.println("Converted string as double "+j);
		//string as boolean
		boolean k=Boolean.parseBoolean(var1);
		System.out.println("Converted string as boolean "+k);
		//string as float
		float l=Float.parseFloat(var4);
		System.out.println("Converted string as float "+l);
		//String as long
		long m=Long.parseLong(var2);
		System.out.println("Converted string as long "+m);
		//String as short
		short n=Short.parseShort(var1);
		System.out.println("Converted string as short "+n);
		//String as byte
		byte o=Byte.parseByte(var1);
		System.out.println("Converted string as byte "+o);

	}

}
