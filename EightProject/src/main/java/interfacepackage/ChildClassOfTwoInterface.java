package interfacepackage;

public class ChildClassOfTwoInterface  implements InterfaceParent2{
	
	public void display() {
		
		System.out.println("india");
	}

	public static void main(String[] args) {
		ChildClassOfTwoInterface obj=new ChildClassOfTwoInterface();
		obj.display();
		obj.show();

	}

}
