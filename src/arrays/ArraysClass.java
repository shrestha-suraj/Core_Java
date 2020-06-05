package arrays;
/**
 * 
 * @author suraj
 * 
 *
 */

public class ArraysClass {

	public static void main(String[] args) {
		int[] arr=new int[5];
		int arr1[]=new int[5];
		//Both of these techniques are same
		//Here arr is a reference variable that is pointing to an object of array
		//You can access an instance variable called length that stores the amount of data stored in array
		int arr2[]= {1,2,3,4,5,6,7,8,9};
		//You can also create array like this with initialization
		
		System.out.println(arr[0]);
		//Array are never blank as they are object.
		//Hence creating array with just instantiation will store default value
		//Like: int->default->0
		//		float->default->0.0 and so on
		//String will have null
		
		
	}

}
