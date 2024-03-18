package collection;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		ArrayList <String> ar=new ArrayList<String>();
		ar.add("jk");
		ar.add("hh");
		ar.add("mm");
		ar.add("lk");
		for(int i=ar.size()-1;i>=0;i--)
		{
			
			System.out.println(ar.get(i));
		}
		

	}

}
