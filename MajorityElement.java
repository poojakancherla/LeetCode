import java.util.HashMap;



public class MajorityElement {
	public static void main(String[] args)
	{
		int ret = 0;
		
		
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		int[] arr = new int[] {4, 4, 4, 7, 7};
		int n = arr.length;
		for(int i = 0; i < arr.length; i++)
		{
			if(h.containsKey(arr[i]))
			
				h.put(arr[i], h.get(arr[i]) + 1);
			
			else
			
				h.put(arr[i], 1);
		}
		
		for(int i : h.keySet())
		{
			if(h.get(i) > Math.floor(n/2))
			{
				ret = i;
				break;
			}
		}
		
	
		System.out.print(ret);
			
	}
	

}
