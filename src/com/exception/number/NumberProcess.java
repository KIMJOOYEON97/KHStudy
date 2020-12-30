package com.exception.number;

public class NumberProcess {

	public NumberProcess() {
		super();
	}

	public boolean checkDouble(int a, int b)  {
			try {
				if(a>100 && b>100) 
					throw new NumberRangeException();				
				else 
					if(b%a == 0) 
						return true;						 
				
			}catch(NumberRangeException e) {
				System.out.println("1부터 100사이의 값이 아닙니다.");
				System.exit(0);
			}
			
		return false;
	}
	
}
