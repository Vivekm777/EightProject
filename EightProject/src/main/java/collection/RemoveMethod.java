package collection;

import java.util.ArrayList;

public class RemoveMethod {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(4);
		ar.add(5);
		System.out.println(ar);
		ar.remove(2);
		System.out.println(ar);

	}

}
