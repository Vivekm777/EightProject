package exceptionhandling;

public class NullPointerExceptionProgramme {
public void display()
{
	
	try
	{
		
		String a=null;
		System.out.println(a.length());
	}
	catch(NullPointerException e)
	{
		
		System.out.println(e);
	}
	System.out.println("exception handled");
}
	public static void main(String[] args) {
		NullPointerExceptionProgramme obj=new NullPointerExceptionProgramme();
		obj.display();

	}

}
