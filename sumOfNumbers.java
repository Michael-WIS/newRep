public class sumOfNumbers
{
	public static void main(String args[])
	{
		
		int[] a={3,6,2,9,5};
		int sum=0;

		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		
		multOfNumbers multOfNumbers=new multOfNumbers();
		multOfNumbers.multiplyNumbers();
		sum sum= new sum();
		sum.sum();
		System.out.println("The Sum of numbers are - " + sum);


	}
}