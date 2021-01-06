package com.thread.alphabet;

public class UpperAlphbetThread extends Thread {

	private char alph;
	
	
	public UpperAlphbetThread(char alph) {
		super();
		this.alph = alph;
	}


	@Override
	public void run() {
		for(int alpa =0; alph<='Z' ; alph++) {
			System.out.print((char)(alph)+" ");
		} 
			
		}
		
}

