package com.sgtesting.listinterface;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
        //	addElements();
		//	removeElements();
		//	readElements1();
		//	readElements2();
		//	readElements3();
		//	readElementsListIterator();
		//	withoutGenerics();
			queueDemo();
	}
	private static void addElements()
	{
		List<Integer> obj=new LinkedList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(300);
		obj.add(500);
		obj.add(1,100);
		obj.add(700);
		System.out.println("Elements :"+obj);
		List<Integer> obj1=new LinkedList<Integer>();
		obj1.add(111);
		obj1.add(222);
		obj1.add(333);
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	private static void removeElements()
	{
		List<Integer> obj=new LinkedList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(300);
		obj.add(500);
		obj.add(1,100);
		obj.add(700);
		System.out.println("Elements :"+obj);
		obj.remove(2);
		System.out.println("Elements :"+obj);
		obj.remove(Integer.valueOf(100));
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	
	private static void readElements1()
	{
		List<Integer> obj=new LinkedList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(300);
		obj.add(500);
		obj.add(900);
		obj.add(700);
		System.out.println("Elements :"+obj);
		for(int i:obj)
		{
			System.out.println(i);
		}
	}

	private static void readElements2()
	{
		List<Integer> obj=new LinkedList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(300);
		obj.add(500);
		obj.add(900);
		obj.add(700);
		System.out.println("Elements :"+obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}
	
	private static void readElements3()
	{
		List<Integer> obj=new LinkedList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(300);
		obj.add(500);
		obj.add(900);
		obj.add(700);
		System.out.println("Elements :"+obj);
		Iterator<Integer> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	private static void readElementsListIterator()
	{
		List<Integer> obj=new LinkedList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(300);
		obj.add(500);
		obj.add(900);
		obj.add(700);
		System.out.println("Elements :"+obj);
		ListIterator<Integer> list=obj.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		System.out.println("++++++++++++");
		while(list.hasPrevious())
		{
			System.out.println(list.previous());
		}
	}
	
	private static void withoutGenerics()
	{
		LinkedList obj=new LinkedList();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add("Mango");
		obj.add('Y');
		obj.add(12.75);
		System.out.println("Elements :"+obj);
	}
	
	private static void queueDemo()
	{
		Queue<Integer> obj=new LinkedList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(300);
		obj.add(500);
		obj.add(900);
		obj.add(700);
		System.out.println("Elements :"+obj);
		obj.remove();
		System.out.println("Elements :"+obj);
		obj.remove();
		System.out.println("Elements :"+obj);
	}
}
