import java.util.Scanner;

public class BinarySearch {
	
	public static int binarysearch(int[] arr,int firstElement,int lastElement,int searchElement) {
		int mid=0;
		if(lastElement>=1) {
			
			mid=firstElement+(lastElement-1)/2;
		}
		if(arr[mid]==searchElement) {
			return mid;
			
		}else if(arr[mid]>searchElement) {
			return binarysearch(arr,firstElement,mid-1,searchElement);
		}else if(arr[mid]<searchElement) {
			return binarysearch(arr,mid+1,lastElement,searchElement);
		}
		return -1;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the elements");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Binary search algorithm starts");
		System.out.println("Enter the element to be searched");
		int searchElement=sc.nextInt();
		int mid=binarysearch(arr,0,arr.length-1,searchElement);
		if(mid>=0) {
			System.out.println(searchElement+" found at index "+mid);
		}else {
			System.out.println("Element not found");
		}
		

	}

}
