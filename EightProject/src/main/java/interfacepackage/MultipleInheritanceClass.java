package interfacepackage;

public class MultipleInheritanceClass implements InterfaceMultipleInheritanceParent1,InterfaceMultipleInheritanceParent2 {
public void show() {
	System.out.println("jk");
}
	public static void main(String[] args) {
		
		 MultipleInheritanceClass obj=new  MultipleInheritanceClass();
		obj.show();
	}

}
