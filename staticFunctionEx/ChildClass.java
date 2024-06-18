package staticFunctionEx;

public class ChildClass extends StaticFun
{
	static int a;
	
	static 
	{
		a++;
		System.out.println("I am static block");
	}
}
