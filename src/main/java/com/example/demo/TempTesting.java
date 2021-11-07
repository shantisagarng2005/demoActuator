package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

interface DefaultMethodInterface
{
	default void sayHello()
	{
		System.out.println("Hello there");
	}
}
@FunctionalInterface
interface Summation extends DefaultMethodInterface
{
	int sum(int i,int j);
}

public class TempTesting {
public static int methodRefSum(int i, int j)
{
	return i+j;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Summation sum=TempTesting::methodRefSum;
		System.out.println("Sum::-"+sum.sum(1, 2));
		sum.sayHello();
		
		List<String> ls=new ArrayList<>();
		ls.add("sagar");
		ls.add("vijay");
		ls.add("uday");
		ls.add("ajay");
		Stream<String> filteredList=ls.stream().filter(p->(!p.equals("vijay")));
		filteredList.forEach((name)->{System.out.println(name);});
		System.out.println("------------------------");
		Collections.sort(ls, (a,b)->{return a.toString().compareTo(b.toString());});
		ls.forEach((item)->System.out.println(item));
	}

}
