package exceptionhandling;

public class ArithematicExceptionProgramme {
	public void show()
	{
		
		try
		{
			
			int a=1/0;
		}
		catch(ArithmeticException e)
		{
			
			System.out.println(e);
		}
		System.out.println("exceptionhandled");
	}

}
