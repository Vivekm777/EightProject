package setpackage;

import java.util.HashSet;
import java.util.Iterator;

public class Size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet ar=new HashSet();
ar.add("ar");
ar.add("df");
ar.add("Ak");
ar.add("bg");
//System.out.println(ar.size());
Iterator itr=ar.iterator();

	while(itr.hasNext())
	{
		System.out.println(itr.next());//printing the element and move to next
		
	}
	}

}
