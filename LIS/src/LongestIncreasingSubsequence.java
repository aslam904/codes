
public class LongestIncreasingSubsequence {
	
	public static int lis(int arr[], int arrLen){
	      int seqArr[] = new int[arrLen];
	      int i, j, max = 0;
	      for (i = 0; i < arrLen; i++)
	         seqArr[i] = 1;
	      for (i = 1; i < arrLen; i++)
	      for (j = 0; j < i; j++)
	      if (arr[i] > arr[j] && seqArr[i] < seqArr[j] + 1)
	      seqArr[i] = seqArr[j] + 1;
	      for (i = 0; i < arrLen; i++)
	      if (max < seqArr[i])
	      max = seqArr[i];
	      return max;
	   }

	public static void main(String[] args) {
		
		 int my_arr[] = { 18, 24, 62, 34, 25, 58, 49, 24 };
	      int arr_len = my_arr.length;
	      System.out.println("The length of the longest increasing subsequence is " +lis(my_arr, arr_len));
		

	}

}
