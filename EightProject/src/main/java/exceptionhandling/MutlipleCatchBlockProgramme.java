package exceptionhandling;

public class MutlipleCatchBlockProgramme {
	public void display() 
	{
		try
		{
			int a=5/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
		catch(NullPointerException e)
		{
			
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println(e);
		}
		System.out.println("Exception handled");
	}

	public static void main(String[] args) {
		
		MutlipleCatchBlockProgramme obj=new MutlipleCatchBlockProgramme();
		obj.display();
	}

}
