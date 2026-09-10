
public class Duplicate {

	public static void main(String[] args) {
	int[] arr = {-2, 5, 0, -7, 8};
	int positive = 0;
	int negative = 0;
	int zero = 0 ;
	for(int i = 0;i<arr.length;i++)
	{
		if(arr[i] > 0 )
		{
			positive++;
		}
		else if(arr[i] < 0)
		{
			negative++;
		}
		else {
	}
		
	}
	System.out.println(positive);
	System.out.println(negative);
	System.out.println(zero);
	}
}
