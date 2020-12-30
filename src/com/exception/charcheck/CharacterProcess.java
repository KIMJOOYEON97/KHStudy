package com.exception.charcheck;

public class CharacterProcess {

	public CharacterProcess() {
		super();
	}
	public int countAlpha(String s) {
		int count = 0;
		for(int i = 0; i< s.length(); i++) {
			if ((s.charAt(i) >='A'&&s.charAt(i) <='Z')
				||(s.charAt(i) >='a'&&s.charAt(i) <='z'))
				count++;
		}
		return count;
	}

}
