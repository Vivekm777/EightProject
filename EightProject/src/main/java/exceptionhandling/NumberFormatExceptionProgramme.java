package exceptionhandling;

public class NumberFormatExceptionProgramme {
	
	public void show()
	{
		try
		{
			String str="Hello";
			int num=Integer.parseInt(str);
		}
		catch(NumberFormatException e)
		{
			
			System.out.println(e);
		}
		System.out.println("Exception Handled");
	}

	public static void main(String[] args) {
		NumberFormatExceptionProgramme obj=new NumberFormatExceptionProgramme ();
		obj.show();

	}

}
