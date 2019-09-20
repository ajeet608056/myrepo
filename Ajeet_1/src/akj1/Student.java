package akj1;

public class Student 
{

	int age;
	int roll_no;
	
	public void display1() 
	{
	
		System.out.println("I am first method");
	}
	public void display2() 
	{
	
		System.out.println("I m second method");
	}
	
	public static void main(String[] args)
	{
	 
		Student deepak=new Student();
		deepak.age=25;
		deepak.roll_no=235;
		deepak.display1();
		deepak.display2();
		System.out.println(deepak.age);
		System.out.println(deepak.roll_no);
		
	}
	
}
