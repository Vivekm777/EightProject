package collection;

import java.util.ArrayList;

public class SetMethod {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("apple");
		ar.add("orange");
		ar.add("grape");
		ar.add("bananna");
		System.out.println(ar.set(2,"fruit"));
		System.out.println(ar);

	}

}
