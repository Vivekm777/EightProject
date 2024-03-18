package interfacepackage;

public class NewClassChild implements NewInterfaceParent1,NewInterfaceParent2{
	public void show()
	{
		
		System.out.println("kk");
	}
	public void display()
	{
		
		System.out.println("Jk");
	}

	public static void main(String[] args) {
		NewClassChild obj=new NewClassChild();
		obj.display();
		obj.show();

	}

}
