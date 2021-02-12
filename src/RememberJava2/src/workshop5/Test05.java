package workshop5;

import java.util.StringTokenizer;

public class Test05 {

	public static void main(String[] args) {

		String str = "LGcns";
		String LG = str.substring(0, 2);
		String cns = str.substring(2, 5);
		
		System.out.println(LG+cns.toUpperCase());
		System.out.println(LG.toLowerCase()+cns);
		System.out.println(LG);
		System.out.println(cns);
		
		


	}

}
