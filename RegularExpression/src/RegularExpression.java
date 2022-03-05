import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		String str="Aslam";
		
		System.out.println("Returns true if 'Aslam' matches 'Aslam' :"+
		Pattern.matches(str, "aslam")); //False
		
		System.out.println("Returns true if 'Aslam' or 'aslam' matches 'Aslam' : "+
		Pattern.matches("[Aa]slam", "Aslam")); //True
		
		System.out.println("Returns true if the string matches exactly 'Spidey' or 'spidey' or 'Hulk' or 'hulk' with 'Hulk' : "+
		Pattern.matches("[Ss]pidey | [Hh]ulk", "Hulk"));//True
		
		System.out.println("returns true if the string contains more than one 'A' or 'a' in the beginning of the string 'aAaAslam9042221356@gmail.com' : " +
		Pattern.matches(".*[Aa+]slam.*", "aAaAslam9042221356@gmail.com"));//True
		
		System.out.println( "returns true if the '9448anwar' have number in the beginning : "+
		Pattern.matches("[\\d].*", "9448anwar")); //True
	// "^[^\\d]" means does not contain number 0-9 in the beginning
	// "[^\\d]" means does not contain number at all	
	// "[\\d]" means contain number 0-9  it can also be written as [0-9]
	// ".*[\\d]^" means does not contain number in the end	
		
		System.out.println("returns true if the string does not have number in the beginning : " +
		Pattern.matches("^[^\\d].*", "alpha9448")); //True
		
		System.out.println("returns true if the string does not have number in the end : " +
		Pattern.matches(".*[^\\d]^", "alpha9448"));//false

	}

}
