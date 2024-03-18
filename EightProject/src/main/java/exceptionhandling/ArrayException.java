package exceptionhandling;

public class ArrayException {
public void show()
{
	try
	{
		int a[]=new int[5];
		a[8]=5;
		
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		
		System.out.println(e);
	}
	System.out.println("exception handled");
	

}

public static void main(String args[])
{
	ArrayException obj=new ArrayException();
	obj.show();
	
	
}
}
