package com.thread.alphabet;

public class LowerAlphbetThread extends Thread {
	
	private char alph;
	
	
	public LowerAlphbetThread(char alph) {
		super();
		this.alph = alph;
	}
	@Override
	public void run() {
		for(int alpa =0; alph<='z' ; alph++) {
			System.out.print((char)(alph)+" ");
		} 
	}
}
