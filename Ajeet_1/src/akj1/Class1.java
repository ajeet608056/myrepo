package akj1;

public class Class1 
{
	int a;
	
	public void Ajeet(int a, int b)
	{
	  int c=a+b;
	  System.out.println("Value of c is " +c);
	  
	}
	public Class1(int x, int y) 
	{
		int c=x/y;
		System.out.println("Value of c is " +c);	
	}
	public Class1(int y) 
	{
		int c=34/y;
		System.out.println("value of c is " +c);
		
	}
	public static void main(String[] args) 
	{
		
		Class1 cde=new Class1(50,10);
		Class1 def=new Class1(17);
		cde.Ajeet(4,5);
		cde.a=10;
		System.out.println("the value of a is " + cde.a);
	}
}
