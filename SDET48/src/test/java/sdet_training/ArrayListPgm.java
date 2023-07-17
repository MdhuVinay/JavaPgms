package sdet_training;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPgm
{
	public static void main(String[] args)
	{

		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add("hii");
		list.add(null);
		list.add("bye");
		if (list.contains(10))
		{
			System.out.println("present");
		} else
		{
			System.out.println("not present");
		}
		for(Object l:list)
		{
			System.out.println(l);
		}
		


	}
}
