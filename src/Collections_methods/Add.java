package Collections_methods;

import java.util.ArrayList;
import java.util.Arrays;

public class Add
{

	public static void main(String[] args)
	{
		ArrayList <String> al=new ArrayList<>();
	
		al.add("a");
		al.add("b");
		al.add("b");
		al.add("null");
		
		int s=al.size();
		System.out.println(s);
		
		
		int i;
			
		for(i=0; i<s; i++)
		{			
		String D=al.get(i);
		System.out.println(D);
		}
		
		for(String m:al)
		{
			System.out.println(m);
		}
		
		String w=al.get(1);
		System.out.println(w);
		

	}

}
