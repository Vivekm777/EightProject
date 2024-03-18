package abstractionpackage;

public class AbstractChildSample extends AbstractionParentSample  {
	
	public void sample()
	{
		System.out.println("India");
		
	}
	public void display() {
		
		System.out.println("Srilanka");
	}

	public static void main(String[] args) {
		
		 AbstractChildSample obj=new  AbstractChildSample();
		 obj.display();
		 obj.sample();;
		 obj.show();
	}

}
