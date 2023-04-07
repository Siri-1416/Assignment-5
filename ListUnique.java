import java.util.*;

public class ListUnique {

	public static void main(String[] args)
	{

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(2);
		System.out.println("Original list elements: "+list);


		List<Integer>list1 = new ArrayList<Integer>();
		for(int i=0;i<list.size();i++)
		{
			int x;
			if(!list1.contains(list.get(i)))
			{
				x=list.get(i);
				list1.add(x);
			}
		}
		System.out.println("New list elements: "+list1);
	}
}
