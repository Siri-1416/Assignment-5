
import java.util.*;
import java.io.*;
import java.lang.*;

public class Setunique
{
	public static void main(String args[])
	{
		Integer a[] = {4,2,1,2,2,3,4,2,1,4};
		Set<Integer> set = new HashSet<>(Arrays.asList(a));
		System.out.println(set);
	}
}