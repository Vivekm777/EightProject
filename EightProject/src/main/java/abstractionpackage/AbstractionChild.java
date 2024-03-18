package abstractionpackage;

public class AbstractionChild extends AbstractParent2 {

	public void show2()
	{
		System.out.println("japan");
		
	}
	public void show1() {
		
		
		System.out.println("jk");
	}
	public static void main(String[] args) {
		
		AbstractionChild obj=new AbstractionChild();
		obj.show();
		obj.show1();
		obj.show2();
		obj.sample();
		obj.display();
	}

}
