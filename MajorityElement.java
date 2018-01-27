import java.util.HashMap;



public class MajorityElement {
	public static void main(String[] args)
	{
		int ret = 0;
		int count = 1;
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		int[] arr = new int[] {9, 8, 9, 8, 9};
		
		for(int i = 0; i < arr.length; i++)
		{
			if(h.containsKey(arr[i]))
			{
				h.put(arr[i], count += 1);
			}
			else
			{
				h.put(arr[i], 1);
				
			}
			if(h.get(arr[i]) < arr.length/2)
			{
				ret = arr[i];
				break;
			}
			
					
		}
		
	
		System.out.print(ret);
			
	}
	

}
