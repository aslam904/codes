import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	
	
	public static int[] selectionSort(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int minimum=arr[i];
				if(arr[i]<arr[j]) {
					minimum=arr[j];
				}else {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the elements");
			arr[i]=sc.nextInt();
		}
		int[] cpyarr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			cpyarr[i]=arr[i];
		}
	
		int[] sortedarray=selectionSort(arr);
		System.out.println("The original array is "+Arrays.toString(cpyarr));
		System.out.println("The sorted array is "+Arrays.toString(sortedarray));

	}

}
