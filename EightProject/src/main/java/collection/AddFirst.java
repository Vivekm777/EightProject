package collection;

import java.util.LinkedList;

public class AddFirst {

	public static void main(String[] args) {
		LinkedList<String> ar=new LinkedList<String>();
		ar.add("jk");
		ar.add("hh");
		ar.add("lm");
		System.out.println(ar);
		ar.addFirst("Vivek");
		System.out.println(ar);
		

	}

}
