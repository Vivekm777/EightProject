package exceptionhandling;

public class FirstThrow {
	public void show(int age)
	{
		
		if(age<18)
		{
			throw new ArithmeticException("Person is not eligible to vote");
			
		}
		else
		{
			
			System.out.println("Person is eligible to vote");
		}
	}

	public static void main(String[] args) {
		
		FirstThrow obj=new FirstThrow();
		obj.show(20);
	}

}
