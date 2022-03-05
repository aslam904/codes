import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcept {
	
	public static int[] arrayCreation(int number) {
		Scanner sc=new Scanner(System.in);
		int[] values=new int[number];
		for(int i=0;i<number;i++) {
			System.out.println("Enter the elements");
			values[i]=sc.nextInt();
		}
		return values;
	}
	
	
	public static int[][] multiDimArrayCreation(int number) {
		Scanner sc=new Scanner(System.in);
		int[] values[]=new int[number][number];
		for(int i=0;i<number;i++) {
			for(int j=0;j<number;j++) {
				System.out.println("Enter the elements");
				values[i][j]=sc.nextInt();
			}
		}
		return values;
	}
	
	
	public static void printArray(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println("The "+i+"th " +j+"th "+" element is "+arr[i][j]);
			}
		}
	}
	

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4};
		int[][] multiarr= {{1,2,3,4},{2,3,4,5},{5,6,7,8}};
		System.out.println("Direct way of creating array and multi dimensional array");
		System.out.println("Single array"+Arrays.toString(arr));
		System.out.println("Multidimensional arrayusing direct");
		printArray(multiarr);
		System.out.println("=======================================================");
		
		
		System.out.println("Array creation using functions");
		int[] funcarr=arrayCreation(5);
		System.out.println("Single array"+Arrays.toString(funcarr));
		int[][] multifuncarr=multiDimArrayCreation(5);
		System.out.println("Multidimensional array using functions");
		printArray(multifuncarr);
		
		System.out.println("===========================================================");

	}

}
