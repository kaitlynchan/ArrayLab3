//package arrays_materials;
import java.util.Arrays;

public class ArraysLab3 
{
	/*
	 * Write a method named sum that accepts two arrays of integers arr1 and arr2 
	 * and returns an array of integers, 
	 * in which every element is the sum of the elements at that index for the arrays arr1 and arr2. 
	 * You can assume arrays arr1 and arr2 have at least one element each and are the same length.
	 */
	public static int[] sum(int[] arr1, int[] arr2)
	{
		assert (arr1.length > 0);
		assert (arr2.length > 0);
		assert (arr1.length == arr2.length);
		
		int [] arrSum = arr1;
		
		for (int i = 0; i < arr1.length; i++){
			arrSum[i] += arr2[i];
		}
		return arrSum;
	}
	
	/*
	 * Write a method named append that accepts an array of integers arr of length n 
	 * and an integer num, and returns an array of integers of length n+1 
	 * that consists of the elements of arr with num appended to the end.  
	 * You can assume array arr has at least one element.
	 */
	public static int[] append(int[] arr, int num)
	{
		assert (arr.length > 0);
		
	}
	
	/*
	 * Write a method named remove that accepts an array of integers arr and an integer idx 
	 * and returns an array of integers consisting of all of the elements of arr 
	 * except for the element at index idx (thus, the returned array has a length of arr.length – 1).  
	 * You can assume arr has at least two elements.
	 */
	public static int[] remove(int[] arr, int idx)
	{
		assert (arr.length >= 2);
		
	}
	
	/*
	 * Write a method sumEven that accepts an array of integers arr 
	 * and returns an integer containing the sum of the elements at the even indices of arr.  
	 * (That means elements at indices 0,2,4,6,8.)  You can assume arr has at least one element.
	 */
	public static int sumEven(int[] arr)
	{
		assert (arr.length > 0);
		
	}
	
	/*
	 * Write a method rotateRight that accepts an array of integers arr 
	 * and does not return a value.  
	 * The rotateRight method moves each element of arr one index to the right 
	 * (element 0 goes to element 1, element 1 goes to element 2, …, element n-1 goes to element 0).  
	 * You can assume arr has at least one element.
	 */
	public static void rotateRight(int[] arr)
	{
		assert (arr.length > 0);
		
	}

	
	
	public static void main(String[] args) 
	{
		int [] a1 = {5,10,15,20,25,30,35,40};
		int [] a2 = {7,14,21,28,35,42,49,56};
		int [] sumArr = sum(a1,a2);
		
		int appendNum = 200;
		int [] appendArr = append(a1, appendNum);
		
		int removeIdx = 5;
		int [] removeArr = remove(a2, removeIdx);
		
		int sumOfEvens = sumEven(appendArr);
		
		rotateRight(a1);
		
		System.out.println("sum: " + Arrays.toString(sumArr));
		System.out.println("append: " + Arrays.toString(appendArr));
		System.out.println("remove: " + Arrays.toString(removeArr));
		System.out.println("sumEven: " + sumOfEvens);
		System.out.println("rotateRight: " + Arrays.toString(a1));
		
		
		//declare arrays a1, a2, sumArr, sppendArr, appendArr, removeArr
		//declare ints appendNum, removeIdx, sumOfEvens
		//call 5 various methods using declared objects/variables as parameters
		//use separate Arrays.toString and printlines to show the results of the 5 methods
		
	}
}


