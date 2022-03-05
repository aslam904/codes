
public class ArrayLeftRotation   
{  
void rotateLeft(int array[], int d, int n){   
	d = d % n;   
	int i, j, k, temp;   
	int gcd = gcd(d, n);   
	for (i = 0; i < gcd; i++)   {   
		temp = array[i];   
		j = i;   
		while (true)   
		{   
			k = j + d;   
			if (k >= n)   
				k = k - n;   
			if (k == i)   
				break;   
			array[j] = array[k];   
			j = k;   
		}   
		array[j] = temp;   
	}   
}

void printArray(int array[], int size){   
	for (int i = 0; i < size; i++)   
		System.out.print(array[i] + " ");   
	}   
	int gcd(int a, int b)   
	{   
		if (b == 0)   
			return a;   
		else  
			return gcd(b, a % b);   
	}   
}