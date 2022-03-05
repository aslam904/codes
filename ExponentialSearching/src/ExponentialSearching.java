import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearching {
	
	public static int exponentialSearch(int[] arr,int searchElement) {
		if(arr[0]==searchElement) {
			return 0;
		}
		int i=1;
		while(i<arr.length && arr[i]<=searchElement) {
			i=i*2;
		}
		return Arrays.binarySearch(arr,i/2,Math.min(i,arr.length),searchElement);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the elements");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int searchElement=sc.nextInt();
		int mid=exponentialSearch(arr,searchElement);
		if(mid>=0) {
			System.out.println("The search element "+searchElement+" is in position "+mid);
		}else {
			System.out.println("Element not found");
		}
	}

}
