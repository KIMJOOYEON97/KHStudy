package com.thread.alphabet;

public class AlphabetTest {

	public static void main(String[] args) {
		

		
		Thread thUp = new UpperAlphbetThread('A');
		Thread thLow = new LowerAlphbetThread('a');
		
		thUp.start();
		thLow.start();
		
		
	}

			
	
	
		

	
}
