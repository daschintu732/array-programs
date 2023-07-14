package array_basics;

public class SecondLargest {

	public static void getSecondLargest(int[] arr) {

		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[arr.length-2]);
	}

	public static void main(String[] args) {
		int arr[] = { 45, 12, 39, 87, 24, 69 };
		getSecondLargest(arr);
	}
}