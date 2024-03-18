package excel;

import java.io.IOException;

public class ExcelReadMain {

	public static void main(String[] args) throws IOException {
		System.out.println(ExcelRead.getStringData(0,0));
	System.out.println(ExcelRead.getIntegerData(0, 1));
	System.out.println(ExcelRead.getStringData(3, 0));
     System.out.println(ExcelRead.getIntegerData(3, 1));  

	}

}

