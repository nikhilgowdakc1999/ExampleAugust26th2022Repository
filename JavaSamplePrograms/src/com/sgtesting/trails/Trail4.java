package com.sgtesting.trails;
//execute all in one blocks by using only 1 statement
class InstBlocks3
{
	{
		method1();
		System.out.println("inst block");
	}

	static
	{
		
		System.out.println("static block");
	}

	static void method1()
	{
		
		System.out.println("Static method");	
	}

	InstBlocks3(int x)
	{
		
		System.out.println(x);
	}
}
public class Trail4 {

	public static void main(String[] args) {

		InstBlocks3 a1=new InstBlocks3(2);

	}

}
