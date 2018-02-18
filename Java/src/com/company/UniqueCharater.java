import java.util.*;
public class UniqueCharater 
{
	public static void main(String[] args) 
	{
		String s = "leetcode";
		HashMap h = new HashMap();
		for(int i = 0; i < s.length(); i++)
		{
			if(h.containsKey(s.charAt(i)))
			{
				h.put(s.charAt(i), h.get(s.charAt(i) + 1));
			}
			else
			{
				h.put(s.charAt(i), 1);
			}
		}
		
		if()
	}
	
}
