import java.util.Arrays;
import java.util.Scanner;

public class SearchStringsInArray {
	
    
	
	public static String[] createArray(int number) {
		Scanner sc=new Scanner(System.in);
		String[] values=new String[number];
		for(int i=0;i<values.length;i++) {
			System.out.println("Enter the elements");
			values[i]=sc.nextLine();
		}
		return values;
	}
	
	public static void main(String[] args) {
		 System.out.println("Enter the word to be searched");
	        Scanner sc=new Scanner(System.in);
	        String word=sc.nextLine();
	        System.out.println("enter the number of elements in array");
	        int number=sc.nextInt();
	        System.out.println("Creating array");
	        String[] stringArray =createArray(number);
	        System.out.println(Arrays.asList(stringArray));
	        int flag=0;
	        for(int i=0;i<stringArray.length;i++){
	            if(stringArray[i].equals(word)){
	                flag++;
	            }
	        }
	        if(flag>0) {
	        	System.out.println("Element found");
	        }else {
	        	System.out.println("Element not found");
	        }
	}

}
