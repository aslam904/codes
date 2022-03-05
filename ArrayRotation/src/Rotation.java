
public class Rotation {

	public static void main(String[] args) {
		
		ArrayLeftRotation  arf = new ArrayLeftRotation();    
		int array[] = {19, 25, 22, 67, -90, 77, -11, -20, 76};   
		System.out.println("Array before rotation: ");   
		arf.printArray(array, 9);  
		System.out.println("\n");   
		arf.rotateLeft(array, 2, 9);   
		System.out.println("Array after left rotation: ");   
		arf.printArray(array, 9); 
		
		ArrayRightRotation arr=new ArrayRightRotation();
		int array1[] = { 12, -9, 45, 23, -99, 67, 98, 90, 11, 45};   
		int r = 3;  
		int n = array1.length;  
		System.out.println("Array before rotation: ");   
		for(int i = 0 ; i < n ; i++)  
		{  
		System.out.print(array1[i]+ " ");   
		}  
		System.out.println();  
		ArrayRightRotation.rotateRight(array1, r, n);   
		System.out.println("\nArray after right rotation: ");   
		for(int i = 0 ; i < n ; i++)  
		{  
		System.out.print(array1[i] + " ");  
		}   

	}

}
