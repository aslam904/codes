import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	
	public static int[] bubbleSort(int[] arr) {
		int temp=0;
		for(int k=0;k<arr.length-1;k++) {
			for(int i=0;i<arr.length-k-1;i++) {
					int minimum=arr[i];
					if(arr[i]<arr[i+1]) {
						minimum=arr[i+1];
					}else {
						temp=arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=temp;
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
	
		int[] sortedarray=bubbleSort(arr);
		System.out.println("The original array is "+Arrays.toString(cpyarr));
		System.out.println("The sorted array is "+Arrays.toString(sortedarray));

	}

}
