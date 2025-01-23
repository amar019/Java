

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,4,7,2,8,1,7,5};
		
		int ans=output(arr);
		System.out.println(ans);
		
		

	}
	
	public static int output(int[] arr)
	{
		int evenSum=0,oddSum=0;
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenSum=evenSum+arr[i];
			}else
			{
				oddSum=oddSum+arr[i];
			}
		}
		
		
		
		
		return evenSum*oddSum;
	}
	

}
