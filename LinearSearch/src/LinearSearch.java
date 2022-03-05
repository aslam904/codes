import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the elements");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array created");
		System.out.println("Linear search algorithm begins");
		System.out.println("Enter the element to be searched");
		int m=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			if(arr[i]==m) {
				System.out.println("Element is found "+m+" The position of is "+i);
				break;
			}else {
				System.out.println("element not found");
				break;
			}
		}
		
	}

}
